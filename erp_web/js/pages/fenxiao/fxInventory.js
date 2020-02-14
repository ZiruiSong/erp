//初始化界面
$(function() {
    initTableData();
    ininPager();
    bindEvent();
});


//初始化表格数据
function initTableData() {
    //改变宽度和高度
    $("#searchPanel").panel({width:webW-2});
    $("#tablePanel").panel({width:webW-2});
    $('#tableData').datagrid({
        //title:'单位列表',
        //iconCls:'icon-save',
        //width:700,
        height:heightInfo,
        nowrap: false,
        rownumbers: false,
        //动画效果
        animate:false,
        //选中单行
        singleSelect : true,
        collapsible:false,
        selectOnCheck:false,
        //fitColumns:true,
        //单击行是否选中
        checkOnSelect : false,
        //交替出现背景
        striped : true,
        pagination: true,
        //自动截取数据
        //nowrap : true,
        //loadFilter: pagerFilter,
        pageSize: initPageSize,
        pageList: initPageNum,
        columns:[[
            { field: 'id',width:35,align:"center",checkbox:true},
            { title: '货号',field: 'invenModel',width:100},
            { title: '尺码', field: 'invenSize',width:50,align:"center"},
            { title: '数量', field: 'invenNum',width:100,align:"center"},
            { title: '渠道',field: 'supplierName',width:80,align:"center"},
            { title: '吊牌价', field: 'tagPrice',width:100,align:"center"},
            { title: '折扣', field: 'invenAgio',width:100,align:"center"}
        ]],
        toolbar:[
            {
                id:'addSupplier',
                text:'增加',
                iconCls:'icon-add',
                handler:function() {
                    addSuppler();
                }
            },'-',
            {
                id:'deleteSupplier',
                text:'删除',
                iconCls:'icon-remove',
                handler:function() {
                    batDeleteSupplier();
                }
            },'-',
            {
                id:'setInput',
                text:'导入',
                iconCls:'icon-excel',
                handler:function() {
                    setInputFun();
                }
            },'-',
            {
                id:'setOutput',
                text:'导出',
                iconCls:'icon-excel',
                handler:function() {
                    setOutputFun();
                }
            }
        ],
        onLoadError:function() {
            $.messager.alert('页面加载提示','页面加载异常，请稍后再试！','error');
            return;
        }
    });
    dgResize();
    showInventoryDetails(1,initPageSize);
}
//导入数据
function setInputFun(){
    //IE下不允许编辑 input=file的值  解决思路：重新克隆input=file，把这个input元素复制一个，然后将原来的删除。
    //在IE下复制元素的时候，其中的值是不会被复制的，所以就达到了清空文件域的目的了。
    //而在Firefox下，其中的值也会被一同复制，清空一下就做到兼容
    var fileUploadInput = $("#inventoryFile");
    fileUploadInput.after(fileUploadInput.clone().val(""));
    fileUploadInput.remove();
    $('#importInventoryExcelDlg').dialog('open').dialog('setTitle','导入库存');
    $(".window-mask").css({ width: webW-20 ,height: webH});
    $("#inventoryFile").focus();
}

//加载数据
function showInventoryDetails(pageNo,pageSize) {

    var supplierName = $('#searchInventory').val();
    $.ajax({
        type:"get",
        url: "/fxInventory/list",
        dataType: "json",
        data: ({
            search: JSON.stringify({
                supplierName:supplierName
            }),
            currentPage: pageNo,
            pageSize: pageSize
        }),
        success: function (res) {
            if(res && res.code === 200){
                if(res.data && res.data.page) {
                    $("#tableData").datagrid('loadData', res.data.page);
                }
            }
        },
        //此处添加错误处理
        error:function() {
            $.messager.alert('查询提示','查询数据后台异常，请稍后再试！','error');
            return;
        }
    });
}


//分页信息处理
function ininPager() {
    try {
        var opts = $("#tableData").datagrid('options');
        var pager = $("#tableData").datagrid('getPager');
        pager.pagination({
            onSelectPage:function(pageNum, pageSize)
            {
                opts.pageNumber = pageNum;
                opts.pageSize = pageSize;
                pager.pagination('refresh', {
                    pageNumber:pageNum,
                    pageSize:pageSize
                });
                showSupplierDetails(pageNum,pageSize);
            }
        });
    }
    catch (e) {
        $.messager.alert('异常处理提示',"分页信息异常 :  " + e.name + ": " + e.message,'error');
    }
}

//绑定事件
function bindEvent(){
    //导入excel对话框
    $('#importInventoryExcelDlg').dialog({
        width: 400,
        closed: true,
        cache: false,
        modal: true,
        collapsible:false,
        closable: true,
        buttons:'#dlg-buttons227'
    });
    //导入excel表格
    $("#saveimport").unbind().bind({
        click:function() {
            if($("#inventoryFile").val().length == 0)
            {
                $.messager.alert('提示','请选择文件！','info');
                return;
            }
            $("#importInventoryExcelFM").submit().ajaxSuccess(function (info) {
                $.messager.alert('提示',info.message);
            });
            $('#importInventoryExcelDlg').dialog('close');

            $.messager.progress({
                title:'请稍候',
                msg:'数据处理ing...'
            });
            setTimeout(function(){
                $.messager.progress('close');
                var opts = $("#tableData").datagrid('options');
                showInventoryDetails(opts.pageNumber,opts.pageSize);
            },3300);
        }
    });


    //初始化键盘enter事件
    $(document).keydown(function(event) {
        //兼容 IE和firefox 事件
        var e = window.event || event;
        var k = e.keyCode||e.which||e.charCode;
        //兼容 IE,firefox 兼容
        var obj = e.srcElement ? e.srcElement : e.target;
        //绑定键盘事件为 id是指定的输入框才可以触发键盘事件 13键盘事件
        if(k == "13"&&(obj.id=="supplier" || obj.id=="contacts"|| obj.id=="phonenum"
            || obj.id=="email" || obj.id=="description" ))
        {
            $("#saveSupplier").click();
        }

        //搜索按钮添加快捷键
        if(k == "13"&&(obj.id=="searchSupplier" || obj.id=="searchContacts"|| obj.id=="searchPhonenum"
            || obj.id=="searchEmail" || obj.id=="searchDesc" ))
        {
            $("#searchBtn").click();
        }
    });

    //搜索处理
    $("#searchBtn").unbind().bind({
        click:function() {
            showInventoryDetails(1,initPageSize);
            var opts = $("#tableData").datagrid('options');
            var pager = $("#tableData").datagrid('getPager');
            opts.pageNumber = 1;
            opts.pageSize = initPageSize;
            pager.pagination('refresh', {
                pageNumber:1,
                pageSize:initPageSize
            });
        }
    });

    $("#searchBtn").click();

    //重置按钮
    $("#searchResetBtn").unbind().bind({
        click:function(){
            $("#searchSupplier").val("");
            $("#searchType").val("");
            $("#searchPhonenum").val("");
            $("#searchTelephone").val("");
            $("#searchDesc").val("");

            //加载完以后重新初始化
            $("#searchBtn").click();
        }
    });

}
