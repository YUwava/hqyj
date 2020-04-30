package com.athqyj.hqyj.controller.fpj;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("checkBear")
public class CbController {

    @RequestMapping("checkBear/nv")
    public String ruleExpandnv(Model Model){
        Model.addAttribute("sex","nv");
        return "checkBear";
    }

    @RequestMapping("checkBear/nan")
    public String ruleExpandnan(Model Model){
        Model.addAttribute("sex","nan");
        return "checkBear";
    }
}
