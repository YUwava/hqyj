package com.athqyj.hqyj.controller.ym;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("Womenexamination")
public class WomenexaminationController {

    @RequestMapping("Womenexamination")
    public String Womenexamination(){
        return "Womenexamination";
    }

}
