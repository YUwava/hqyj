package com.athqyj.hqyj.controller.hzw;

import com.athqyj.hqyj.entity.MInfo;
import com.athqyj.hqyj.service.hzw.OpenTheUltrasonicImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.model.IModel;
import org.thymeleaf.model.IModelFactory;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/hzw")
public class OpenTheUltrasonicImageController {
    @Autowired
    OpenTheUltrasonicImageService openTheUltrasonicImageService;

    /*进入SupergeneImage影像页面*/
    @RequestMapping("/supergeneImages")
    @ResponseBody
    public Object showsupergeneImages(Model model){
        MInfo list = openTheUltrasonicImageService.showAllMInfo();
            model.addAttribute("min",list);
        return list;
    }

    @RequestMapping("/supergeneImage")
    public String showsupergeneImage(Model model){
        MInfo list = openTheUltrasonicImageService.showAllMInfo();
        model.addAttribute("min",list);
        return "SupergeneImage";
    }

}
