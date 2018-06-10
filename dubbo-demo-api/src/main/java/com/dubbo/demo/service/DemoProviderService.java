package com.dubbo.demo.service;

/**
 * 服务提供者接口
 * @author sam199510 273045049@qq.com
 * @version Created Time:2018/3/30 15:56:35
 */
public interface DemoProviderService {

    String sayHello(String name);

    Integer getStringLength(String string);

}
