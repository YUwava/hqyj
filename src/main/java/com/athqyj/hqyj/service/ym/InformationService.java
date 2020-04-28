package com.athqyj.hqyj.service.ym;

import com.athqyj.hqyj.Mapper.ym.InfomationMapper;
import com.athqyj.hqyj.entity.LUptoprovince;
import com.athqyj.hqyj.entity.MInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InformationService {
    @Autowired
    private InfomationMapper infomationMapper;
    /*啊*/
    /*查询所有人员信息*/
    public List<MInfo> showAllInfoNice(String fname,String mname,String midCard,String fidCard, String id, Integer index, Integer pageSize){
        List<MInfo> list=infomationMapper.showAllInfoNice(fname,mname,midCard,fidCard,id,(index-1)*pageSize,pageSize);
        return list;
    }

    /* 得到档案信息的条数*/
    public int getAllCount(){
        return infomationMapper.allcount();
    }

    /*状态信息表*/
    public List<LUptoprovince> geiUpInfo(){
        List<LUptoprovince> list=infomationMapper.geiUpInfo();
        return list;
    }






}
