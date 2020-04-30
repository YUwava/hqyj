package com.athqyj.hqyj.controller.ym;

import com.athqyj.hqyj.entity.MHascontent;
import com.athqyj.hqyj.entity.MInfo;
import com.athqyj.hqyj.service.ym.HascontentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("hascontent")
public class HascontentController {
    @Autowired
    private HascontentService hascontentService;

    /*进入新建档案页面*/
    @RequestMapping("/hascontents")
    public String showgo(HttpServletRequest request){
        return "Hascontent";
    }
    /*新增人员信息*/
    @RequestMapping("/addInfo")
    public String addInfo(MHascontent mHascontent, BindingResult result){
        int con=hascontentService.addPeopleInfo(mHascontent);
        System.out.println("值=====================>>>>>>>"+con);
        if(con>0){
            return "redirect:/hascontent/hascontents";
        }
        return "Hascontent";
    }
}
