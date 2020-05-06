package com.athqyj.hqyj.controller.ym;

import com.athqyj.hqyj.entity.NvTigejiancha;
import com.athqyj.hqyj.entity.NvYibanqingkuang;
import com.athqyj.hqyj.service.ym.WomenexamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("womenexexam")
public class WomenxaminationController {
    @Autowired
    private WomenexamService womenexamService;
    /*进入新建档案页面*/
    @RequestMapping("/womenexexams")
    public String showgo(HttpServletRequest request){
        return "Womenexamination";
    }
    /*新增人员信息*/
    @RequestMapping("/addInfo")
    public String addInfo(NvTigejiancha nvTigejiancha, BindingResult result){
        int con=womenexamService.addInfo(nvTigejiancha);
        System.out.println("值=====================>>>>>>>"+con);
        if(con>0){
            return "redirect:/womenexexam/womenexexams";
        }
        return "Womenexamination";
    }
}
