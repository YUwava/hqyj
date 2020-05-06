package com.athqyj.hqyj.controller.ym;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("womenClinicale")
public class WomenClinicaleController {
    @RequestMapping("/womenClinicales")
    public String showgo(HttpServletRequest request){
        return "WomenClinicale";
    }
}
