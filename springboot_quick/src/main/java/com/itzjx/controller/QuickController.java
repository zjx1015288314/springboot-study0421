package com.itzjx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuickController {
    @RequestMapping("/quick")   //请求路径映射，并且将返回值解析为跳转路径
    @ResponseBody
    //@responseBody注解的作用是将controller的方法返回的对象通过适当的转换器转换为指定的格式之后，写入到response对象的body区，
    //通常用来异步返回JSON数据或者是XML数据，需要注意的呢，在使用此注解之后不会再走视图处理器，而是直接将数据写入到输入流中，
    //他的效果等同于通过response对象输出指定格式的数据。
    public String quick(){
        return "nihao springboot!!!";
    }
}
