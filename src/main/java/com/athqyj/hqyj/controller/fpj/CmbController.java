package com.athqyj.hqyj.controller.fpj;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("chemicalBear")
public class CmbController {

    @RequestMapping("chemicalBear")
    public String ruleExpandnv(){
        return "chemicalBear";
    }
}
