package com.jsh.erp.service.fxExpress;


import com.jsh.erp.service.ICommonQuery;
import com.jsh.erp.utils.Constants;
import com.jsh.erp.utils.QueryUtils;
import com.jsh.erp.utils.StringUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Service(value="fxExpress_component")
@FxExpressResource
public class FxExpressComponent implements ICommonQuery {
    @Resource
    private FxExpressService fxExpressService;
    @Override
    public Object selectOne(Long id) throws Exception {
        return null;
    }

    @Override
    public List<?> select(Map<String, String> map) throws Exception {
        String search = map.get(Constants.SEARCH);
        String expressName = StringUtil.getInfo(search,"expressName");
        if(StringUtil.isEmpty(expressName)){
            expressName = null;
        }
        return fxExpressService.select(expressName, QueryUtils.offset(map),QueryUtils.rows(map));
    }

    @Override
    public Long counts(Map<String, String> map) throws Exception {
        String search = map.get(Constants.SEARCH);
        String expressName = StringUtil.getInfo(search,"expressName");
        return fxExpressService.countsByFxExpress(expressName);
    }

    @Override
    public int insert(String beanJson, HttpServletRequest request) throws Exception {

        return fxExpressService.insertFxExpress(beanJson,request);
    }

    @Override
    public int update(String beanJson, Long id, HttpServletRequest request) throws Exception {
        return fxExpressService.updateFxExpress(beanJson,id,request);
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
