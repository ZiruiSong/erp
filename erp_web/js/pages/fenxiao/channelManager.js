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
            { field: 'ck',width:35,align:"center",checkbox:true},
            { title: '渠道编号',field: 'id',width:80},
            { title: '渠道名称',field: 'supplierName',width:100},
            { title: '渠道描述', field: 'supplierDesc',width:150,align:"center"},
            { title: '渠道类型', field: 'typeName',width:100,align:"center"},
            { title: '创建时间',field: 'createTime',width:80,align:"center"},
            { title: '配货说明', field: 'distributionDesc',width:150,align:"center"},
            { title: '退货地址', field: 'returnAddr',width:100,align:"center"},
            { title: '渠道负责人', field: 'userName',width:100,align:"center"},
            { title: '支持快递', field: 'supportExpress',width:100,align:"center"},
            { title: '发货时效', field: 'deliveryLimitation',width:100,align:"center"}
        ]],
        toolbar:[
            {
                id:'addChannel',
                text:'增加',
                iconCls:'icon-add',
                handler:function() {
                    // addSuppler();

                }
            },'-',
            {
                id:'deleteChannel',
                text:'删除',
                iconCls:'icon-remove',
                handler:function() {
                    batDeleteSupplier();
                }
            }
        ],
        onLoadError:function() {
            $.messager.alert('页面加载提示','页面加载异常，请稍后再试！','error');
            return;
        }
    });
    dgResize();
    showChannelManagerDetails(1,initPageSize);
}

//加载数据
function showChannelManagerDetails(pageNo,pageSize) {
    var searchChannelName = $('#searchChannelName').val();
    var searchChannelUser = $('#searchChannelUser').val();
    $.ajax({
        type:"get",
        url: "/channelManager/list",
        dataType: "json",
        data: ({
            search: JSON.stringify({
                searchChannelName:searchChannelName,
                searchChannelUser:searchChannelUser
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
                showChannelManagerDetails(pageNum,pageSize);
            }
        });
    }
    catch (e) {
        $.messager.alert('异常处理提示',"分页信息异常 :  " + e.name + ": " + e.message,'error');
    }
}

//绑定事件
function bindEvent(){

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
            // $("#saveSupplier").click();
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
            showChannelManagerDetails(1,initPageSize);
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
            $("#searchChannelName").val("");
            $("#searchChannelUser").val("");
            //加载完以后重新初始化
            $("#searchBtn").click();
        }
    });

    //查询备选的渠道负责人
    $('#lookForChannelManagerUser').click('click',function () {
        selectChannelUser();
    });

    function selectChannelUser(){
        $('#forSelectChannelManagerUserDlg').dialog({
            title: '负责人选择',
            width: webW/2,
            height: webH/2,
            closed: false,
            cache: false,
            href: '/pages/fenxiao/channelManagerUser_forselect.html',
            modal: true,
            resizable:true
        });
    }
}
