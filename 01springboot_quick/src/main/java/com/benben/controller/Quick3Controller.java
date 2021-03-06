package com.benben.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ConfigurationProperties(prefix="person")   //写好前缀，自动匹配
public class Quick3Controller {

    private String name;
    private String addr;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @RequestMapping("/quick3")
    @ResponseBody
    public String quick3(){
        //获得配置文件的信息


        return "name:"+name+",addr="+addr;
    }
}
