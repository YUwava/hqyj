package com.athqyj.hqyj.controller.ym;

import com.athqyj.hqyj.entity.NanKaidan;
import com.athqyj.hqyj.entity.NvKaidan;
import com.athqyj.hqyj.service.ym.ManKaiDanService;
import com.athqyj.hqyj.service.ym.ManService;
import com.athqyj.hqyj.service.ym.WomenKanDanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("manKaiDan")
public class ManKaiDanController {
    @Autowired
    private ManKaiDanService manKaiDanService;
    /*进入新建档案页面*/
    @RequestMapping("/manKaiDans")
    public String showgo(HttpServletRequest request){
        return "ManKaiDan";
    }
    /*新增人员信息*/
    @RequestMapping("/addInfo")
    public String addInfo(NanKaidan nanKaidan, BindingResult result){
        int con=manKaiDanService.addInfo(nanKaidan);
        System.out.println("值=====================>>>>>>>"+con);
        if(con>0){
            return "redirect:/manKaiDan/manKaiDans";
        }
        return "WomenKaiDan";
    }

}
