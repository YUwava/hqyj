package com.athqyj.hqyj.controller.fpj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String test(){
        return "index";
    }

    @RequestMapping("welcome-1")
    public String tests(){
        return "welcome-1";
    }

    /*@RequestMapping("beforeCheck")
    public String testss(){
        return "beforeCheck";
    }*/

    /*@RequestMapping("ruleExpand")
    public String testsss(){
        return "ruleExpand";
    }*/

    /*@RequestMapping("xRayCheck")
    public String testssss(){
        return "xRayCheck";
    }*/

    /*@RequestMapping("oralCheck")
    public String testsssss(){
        return "oralCheck";
    }*/

    /*@RequestMapping("chemicalBear")
    public String testssssss(){
        return "chemicalBear";
    }
    @RequestMapping("tests")
    public String testsssssss(){
        return "chemicalBear";
    }
    @RequestMapping("checkBear")
    public String testssssssss(){
        return "checkBear";
    }*/
}
