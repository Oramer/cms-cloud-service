package com.cms.base_service.common;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import com.cms.base_service.common.utils.IdUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class TreeUtils {
    /*  14 */   private static final Logger log = LoggerFactory.getLogger(TreeUtils.class);

    public static List<DeptVo> resetDept(List<DeptVo> deptVos) {
        /*  17 */
        deptVos.forEach(it -> resetDept2(deptVos, it));


        /*  20 */
        return treeToList(deptVos);
    }


    private static List<DeptVo> treeToList(List<DeptVo> messageList) {
        /*  30 */
        List<DeptVo> result = new ArrayList<>();
        /*  31 */
        for (DeptVo entity : messageList) {
            /*  32 */
            result.add(entity);
            /*  33 */
            List<DeptVo> childMsg = entity.getChildren();
            /*  34 */
            if (childMsg != null && childMsg.size() > 0) {
                /*  35 */
                List<DeptVo> entityList = treeToList(childMsg);
                /*  36 */
                result.addAll(entityList);
            }
        }
        /*  39 */
        if (result.size() > 0) {
            /*  40 */
            for (DeptVo entity : result) {
                /*  41 */
                entity.setChildren(null);
            }
        }
        /*  44 */
        return result;
    }


    public static List<DeptVo> resetDept2(List<DeptVo> deptVos, DeptVo vo) {
        /*  55 */
        deptVos.forEach(it -> {
            String pk = String.valueOf(IdUtils.get());
            it.setSourceid(it.getId());
            it.setId(pk);
            if (vo != null) {
                it.setParentid(vo.getParentid());
            }
            if (it.getChildren() != null && it.getChildren().size() > 0) {
                List<DeptVo> children = it.getChildren();
                Iterator<DeptVo> iterator = children.iterator();
                while (iterator.hasNext()) {
                    String pks = String.valueOf(IdUtils.get());
                    DeptVo itt = iterator.next();
                    itt.setSourceid(itt.getId());
                    itt.setId(pks);
                    itt.setParentid(pk);
                    if (itt.getChildren() != null && itt.getChildren().size() > 0) {
                        resetDept2(itt.getChildren(), itt);
                    }
                }
            }
        });
        /*  77 */
        return deptVos;
    }


    public static JSONArray listToTree(JSONArray arr, String id, String pid, String child) {
        /*  92 */
        JSONArray r = new JSONArray();
        /*  93 */
        JSONObject hash = new JSONObject();

        /*  95 */
        for (int i = 0; i < arr.size(); i++) {
            /*  96 */
            JSONObject json = (JSONObject) arr.get(i);
            /*  97 */
            hash.put(json.getString(id), json);
        }

        /* 100 */
        for (int j = 0; j < arr.size(); j++) {

            /* 102 */
            JSONObject aVal = (JSONObject) arr.get(j);

            /* 104 */
            JSONObject hashVP = (JSONObject) hash.get(aVal.get(pid).toString());

            /* 106 */
            if (hashVP != null) {

                /* 108 */
                if (hashVP.get(child) != null) {
                    /* 109 */
                    JSONArray ch = (JSONArray) hashVP.get(child);
                    /* 110 */
                    ch.add(aVal);
                    /* 111 */
                    hashVP.put(child, ch);
                } else {
                    /* 113 */
                    JSONArray ch = new JSONArray();
                    /* 114 */
                    ch.add(aVal);
                    /* 115 */
                    hashVP.put(child, ch);
                }
            } else {
                /* 118 */
                r.add(aVal);
            }
        }
        /* 121 */
        return r;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\common\TreeUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */