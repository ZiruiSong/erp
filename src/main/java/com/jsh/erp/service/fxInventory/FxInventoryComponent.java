package com.jsh.erp.service.fxInventory;


import com.jsh.erp.datasource.vo.FxInventoryVo;
import com.jsh.erp.service.ICommonQuery;
import com.jsh.erp.utils.Constants;
import com.jsh.erp.utils.QueryUtils;
import com.jsh.erp.utils.StringUtil;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Service(value="fxInventory_component")
@FxInventoryResource
public class FxInventoryComponent implements ICommonQuery {
    @Resource
    private FxInventoryService fxInventoryService;

    @Override
    public Object selectOne(Long id) throws Exception {
        return null;
    }

    @Override
    public List<FxInventoryVo> select(Map<String, String> map) throws Exception {
        String search = map.get(Constants.SEARCH);
        //渠道名称
        String supplierName = StringUtil.getInfo(search, "supplierName");
        if(StringUtil.isEmpty(supplierName)){
            supplierName = null;
        }
        return fxInventoryService.select(supplierName, QueryUtils.offset(map),QueryUtils.rows(map));
    }

    @Override
    public Long counts(Map<String, String> map) throws Exception {
        String search = map.get(Constants.SEARCH);
        String supplierName = StringUtil.getInfo(search, "supplierName");
        return fxInventoryService.counts(supplierName);
    }

    @Override
    public int insert(String beanJson, HttpServletRequest request) throws Exception {
        return 0;
    }

    @Override
    public int update(String beanJson, Long id, HttpServletRequest request) throws Exception {
        return 0;
    }

    @Override
    public int delete(Long id, HttpServletRequest request) throws Exception {
        return 0;
    }

    @Override
    public int batchDelete(String ids, HttpServletRequest request) throws Exception {
        return 0;
    }

    @Override
    public int checkIsNameExist(Long id, String name) throws Exception {
        return 0;
    }
}