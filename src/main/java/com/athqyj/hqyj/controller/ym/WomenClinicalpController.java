package com.athqyj.hqyj.controller.ym;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("womenClinicalp")
public class WomenClinicalpController {
    @RequestMapping("/womenClinicalps")
    public String showgo(HttpServletRequest request){
        return "womenCliclap";
    }
}
