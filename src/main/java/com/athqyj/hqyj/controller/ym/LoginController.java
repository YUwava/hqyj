package com.athqyj.hqyj.controller.ym;

import com.athqyj.hqyj.service.ym.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;

    /*登录页面*/
    @RequestMapping("loginWindow")
    public String home(){
        return "index";
    }


    @RequestMapping("loginNice")
    public Object loginAdmin(HttpServletRequest request, String nvcUsername, String nvcPsw, ModelAndView mode){
        int con=loginService.LoginInfo(nvcUsername,nvcPsw);
        if(con>0){
            mode.setViewName("home");
            return mode;
        }else{
            request.setAttribute("erorr", "密码错误！");
            return "index";
        }
    }
}
