package com.example.ceshi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zxs
 * @date 2020/12/6 下午6:32
 */
@RestController
public class CeshiController {

    @RequestMapping("/ceshi")
    public String ceshi(){
        return "hell word";
    }

    @RequestMapping("git")
    public String git(){
        return " hello git";
    }
}
