package com.athqyj.hqyj.controller.hzw;

import com.athqyj.hqyj.entity.MInfo;
import com.athqyj.hqyj.service.hzw.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/hzw")
public class NoteController {
    @Autowired
    NoteService noteService;

    /*进入SuggestedSMS评估页面*/
    @RequestMapping("/suggested")
    public String showsuggested(HttpServletRequest request){
        return "SuggestedSMS";

    }

    /*进入CustomSMS用户页面*/
    @RequestMapping("/custom")
    public String showcustom(HttpServletRequest request){
        return "CustomSMS";
    }

    /**
     * 查询用户评估信息
     * @param page
     * @param limit
     * @return
     */
    @RequestMapping("getShowAll")
    @ResponseBody
    public Object getShowAll(Integer page, Integer limit) {
        List<MInfo> list = noteService.showAllMInfo(page,limit);
        if(list.get(0).getNvPinggujianyis().get(0).getEvaluateResultDetail()!=null){
            System.out.println("评估内容:"+list.get(0).getNvPinggujianyis().get(0).getEvaluateResultDetail());
        }else {
            System.out.println("错误！");
        }
        int count = noteService.getAllCount();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", count);
        map.put("data", list);
        return map;
    }

}
