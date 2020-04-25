package com.athqyj.hqyj.service.ym;

import com.athqyj.hqyj.Mapper.ym.InfomationMapper;
import com.athqyj.hqyj.entity.MInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InformationService {
    @Autowired
    private InfomationMapper infomationMapper;

    /*查询所有医院人员信息*/
    public List<MInfo> showAllInfo(/*Integer autoId,*/Integer index, Integer pageSize){
        return  infomationMapper.showAllInfoNice(/*autoId,*/(index-1)*pageSize,pageSize);
    }

    public List<MInfo> selectAllInfo(Integer index, Integer pageSize){
        List<MInfo> list=infomationMapper.showInfoPage((index-1)*pageSize,pageSize);
        return list;
    }
    public List<MInfo> showAllInfoNice(/*Integer autoId,*/Integer index, Integer pageSize){
        List<MInfo> list=infomationMapper.showAllInfoNice(/*autoId,*/(index-1)*pageSize,pageSize);
        return list;
    }
    /* 得到档案信息的条数*/
    public int getAllCount(){
        return infomationMapper.allcount();
    }
}
