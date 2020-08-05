package com.github.alenfive.rocketapi.extend;

import com.github.alenfive.rocketapi.entity.ApiExample;
import com.github.alenfive.rocketapi.entity.ApiInfo;
import lombok.extern.slf4j.Slf4j;

/**
 * 默认API信息接口同步，
 */
@Slf4j
public class DefaultApiDocSync implements IApiDocSync {

    @Override
    public void sync(ApiInfo apiInfo, ApiExample apiExample) {
    }
}
