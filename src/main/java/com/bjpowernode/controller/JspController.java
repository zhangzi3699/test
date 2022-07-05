package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JspController {

    @RequestMapping("/jsp")
    public String toJsp(Model model){
        model.addAttribute("data","SpringBoot中使用jsp");

        return "index";//逻辑视图名称
    }
}
