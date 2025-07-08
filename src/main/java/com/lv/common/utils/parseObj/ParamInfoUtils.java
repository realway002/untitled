package com.lv.common.utils.parseObj;

import com.lv.bean.bo.ParamInfo;
import org.springframework.util.StringUtils;


import java.util.List;
import java.util.Optional;

public class ParamInfoUtils {
    public static Optional<ParamInfo> getParamInfoByKey(List<ParamInfo> paramInfos,String key){
        if (null == paramInfos){
            return Optional.empty();
        }
        if (paramInfos.isEmpty()){
            return Optional.empty();
        }
        if (StringUtils.isEmpty(key)){
            return Optional.empty();
        }
        return paramInfos.stream().filter(
                paramInfo -> key.equals(paramInfo.getAttrCode())
        ).findFirst();
    }
}
