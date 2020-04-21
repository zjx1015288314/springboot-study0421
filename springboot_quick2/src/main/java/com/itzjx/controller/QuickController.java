package com.itzjx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //将@Controller和@Response合并，所有方法就不用再加@Response
public class QuickController {

    @RequestMapping("/quick2")
    public String quick(){
        return "springBoot !!!";
    }
}
