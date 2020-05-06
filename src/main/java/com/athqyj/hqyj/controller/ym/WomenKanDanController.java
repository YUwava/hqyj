package com.athqyj.hqyj.controller.ym;

import com.athqyj.hqyj.entity.NvKaidan;
import com.athqyj.hqyj.service.ym.WomenKanDanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("womenKaiDan")
public class WomenKanDanController {
    @Autowired
    private WomenKanDanService womenTestService;
    /*进入新建档案页面*/
    @RequestMapping("/womenKaiDans")
    public String showgo(HttpServletRequest request){
        return "WomenKaiDan";
    }
    /*新增人员信息*/
    @RequestMapping("/addInfo")
    public String addInfo(NvKaidan nvKaidan, BindingResult result){
        int con=womenTestService.addInfo(nvKaidan);
        System.out.println("值=====================>>>>>>>"+con);
        if(con>0){
            return "redirect:/womenKaiDan/womenKaiDans";
        }
        return "WomenKaiDan";
    }

}
