package com.athqyj.hqyj.controller.ym;

import com.athqyj.hqyj.entity.LUptoprovince;
import com.athqyj.hqyj.entity.MInfo;
import com.athqyj.hqyj.entity.NvPinggujianyi;
import com.athqyj.hqyj.entity.NvYibanqingkuang;
import com.athqyj.hqyj.service.ym.WomenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("womenInfo")
public class WomenInfoController {
    @Autowired
    private WomenService womenService;
    /*进入新建档案页面*/
    @RequestMapping("/womenInfos")
    public String showgo(HttpServletRequest request){
        return "WomenInfo";
    }
    /*新增人员信息*/
    @RequestMapping("/addInfo")
    public String addInfo(NvYibanqingkuang nvYibanqingkuang, BindingResult result){
        int con=womenService.addInfo(nvYibanqingkuang);
        System.out.println("值=====================>>>>>>>"+con);
        if(con>0){
                return "redirect:/womenInfo/womenInfos";
            }
        return "WomenInfo";
    }
}
