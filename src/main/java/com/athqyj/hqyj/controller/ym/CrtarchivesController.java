package com.athqyj.hqyj.controller.ym;

import com.athqyj.hqyj.service.ym.CrtarchivesService;
import com.athqyj.hqyj.entity.MInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("archive")
public class CrtarchivesController {
    @Autowired
    private CrtarchivesService crtarchivesService;

    /*进入新建档案页面*/
    @RequestMapping("/archives")
    public String showgo(HttpServletRequest request){
        return "newCrtarchives";
    }
    /*新增人员信息*/
    @RequestMapping("/addInfo")
    public String addInfo(MInfo mInfo, BindingResult result){
        int con=crtarchivesService.addPeopleInfo(mInfo);
        System.out.println("值=====================>>>>>>>"+con);
        if(con>0){
            return "redirect:/archive/archives";
        }
        return "newCrtarchives";
    }
}
