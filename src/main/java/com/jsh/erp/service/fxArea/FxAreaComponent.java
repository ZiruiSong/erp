package com.jsh.erp.service.fxArea;


import com.jsh.erp.service.ICommonQuery;
import com.jsh.erp.utils.Constants;
import com.jsh.erp.utils.QueryUtils;
import com.jsh.erp.utils.StringUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Service(value="fxArea_component")
@FxAreaResource
public class FxAreaComponent implements ICommonQuery {
    @Resource
    private FxAreaService fxAreaService;

    @Override
    public Object selectOne(Long id) throws Exception {
        return null;
    }

    @Override
    public List<?> select(Map<String, String> map) throws Exception {
        String search = map.get(Constants.SEARCH);
        //区域名称
        String areaName = StringUtil.getInfo(search, "areaName");
        //区域编号
//        String areaId = StringUtil.getInfo(search,"areaId");

        Integer areaIdInteger = null;
       /* if(!StringUtil.isEmpty(areaId)){
            areaIdInteger = Integer.valueOf(areaId);
        }*/
        if(StringUtil.isEmpty(areaName)){
            areaName = null;
        }

        return fxAreaService.select(null,areaName,null,null, QueryUtils.offset(map),QueryUtils.rows(map));
    }

    public List<?> getAllFxAreaList(){
        return fxAreaService.getFxArea();
    }

    @Override
    public Long counts(Map<String, String> map) throws Exception {
        String search = map.get(Constants.SEARCH);
        String areaName = StringUtil.getInfo(search, "areaName");
//        String areaId = StringUtil.getInfo(search, "areaId");
//        String areaParentId = StringUtil.getInfo(search, "areaParentId");
//        String areaZip = StringUtil.getInfo(search, "areaZip");
        return fxAreaService.countsByFxArea(null,areaName,null,null);
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
