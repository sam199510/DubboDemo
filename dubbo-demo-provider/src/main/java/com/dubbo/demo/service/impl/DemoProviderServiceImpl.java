package com.dubbo.demo.service.impl;

import com.dubbo.demo.service.DemoProviderService;
import org.apache.commons.lang3.StringUtils;

/**
 * 服务提供者接口实现类
 *
 * @author sam199510 273045049@qq.com
 * @version Created Time:2018/3/30 15:58:34
 */
public class DemoProviderServiceImpl implements DemoProviderService {

    public String sayHello(String name) {
        return "Server 001（port：20880）：" + name;
    }

    public Integer getStringLength(String string) {
        if (StringUtils.isBlank(string)) {
            return 0;
        } else {
            return string.length();
        }
    }
}
