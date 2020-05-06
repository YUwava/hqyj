package com.athqyj.hqyj.controller.ym;

import com.athqyj.hqyj.entity.NanYibanqingkuang;
import com.athqyj.hqyj.entity.NvYibanqingkuang;
import com.athqyj.hqyj.service.ym.ManService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("manInfo")
public class ManInfoController {
    @Autowired
    private ManService manService;
    /*进入新建档案页面*/
    @RequestMapping("/manInfos")
    public String showgo(HttpServletRequest request){
        return "ManInfo";
    }
    /*新增人员信息*/
    @RequestMapping("/addInfo")
    public String addInfo(NanYibanqingkuang nanYibanqingkuang, BindingResult result){
        int con=manService.addInfo(nanYibanqingkuang);
        System.out.println("值=====================>>>>>>>"+con);
        if(con>0){
            return "redirect:/manInfo/manInfos";
        }
        return "ManInfo";
    }
}
