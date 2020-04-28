package com.athqyj.hqyj.service.hzw;

import com.athqyj.hqyj.Mapper.hzw.QueryFileInformationMapper;
import com.athqyj.hqyj.entity.MInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class QueryFileInformationService {
    @Autowired
    QueryFileInformationMapper queryFileInformationMapper;

    /*查询所有人员信息*/
    public List<MInfo> showAllInfoNice(Integer index, Integer pageSize,String fname,String serviceTime,String fidCard,String midCard,String mname,String fbirthDate,String mbirthDate){
        List<MInfo> list=queryFileInformationMapper.showAllInfoNice((index-1)*pageSize,pageSize,fname,serviceTime,fidCard,midCard,mname,fbirthDate,mbirthDate);
        return list;
    }
    /*通过id模糊查询人员信息*/

    /* 得到档案信息的条数*/
    public int getAllCount(){
        return queryFileInformationMapper.allcount();
    }


}
