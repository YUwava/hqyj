package com.athqyj.hqyj.controller.ym;

import com.athqyj.hqyj.entity.NanTigejiancha;
import com.athqyj.hqyj.entity.NvTigejiancha;
import com.athqyj.hqyj.service.ym.ManexamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("manexInfo")
public class ManxaminationController {
    @Autowired
    private ManexamService manexamService;
    @RequestMapping("/manexInfos")
    public String showgo(HttpServletRequest request){
        return "Manexamination";
    }
    /*新增人员信息*/
    @RequestMapping("/addInfo")
    public String addInfo(NanTigejiancha nanTigejiancha, BindingResult result){
        int con=manexamService.addInfo(nanTigejiancha);
        System.out.println("值=====================>>>>>>>"+con);
        if(con>0){
            return "redirect:/manexInfo/manexInfos";
        }
        return "ManInfo";
    }
}
