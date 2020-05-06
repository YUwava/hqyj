package com.athqyj.hqyj.controller.ym;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("WomenInfo")
public class WomenInfoController {
    @RequestMapping("WomenInfo")
    public String WomenInfo(){
        return "WomenInfo";
    }
}
