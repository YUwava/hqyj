package com.athqyj.hqyj.controller.hzw;

import com.athqyj.hqyj.entity.MInfo;
import com.athqyj.hqyj.service.hzw.QueryFileInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/hzw")
public class QueryFileInformationController {

    @Autowired
    QueryFileInformationService queryFileInformationService;

    /*进入FileInformation档案信息*/
    @RequestMapping("/fileInformation")
    public String showfileInformation(HttpServletRequest request){
        return "FileInformation";
    }


    /*查询所有档案信息*/
    @RequestMapping("getIndex")
    @ResponseBody
    public Object getIndex(/*String id,*/Integer page, Integer limit ,String fname,String serviceTime,String fidCard,String midCard,String mname,String fbirthDate,String mbirthDate) {
        List<MInfo> list = queryFileInformationService.showAllInfoNice(page,limit,fname,serviceTime,fidCard,midCard,mname,fbirthDate,mbirthDate);

        if(list.get(0).getlUptoprovince().get(0).getUpFlag()!=null){
            System.out.println("上传状态:"+list.get(0).getlUptoprovince().get(0).getUpFlag());
        }else {
            System.out.println("错误！");
        }
        int count = queryFileInformationService.getAllCount();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", count);
        map.put("data", list);
        return map;
    }


}
