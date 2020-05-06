package com.athqyj.hqyj.service.fpj;

import com.athqyj.hqyj.Mapper.fpj.ReMapper;
import com.athqyj.hqyj.entity.Tbljxmarriageinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReService {
    @Autowired
    private ReMapper ReMapper;

    public int AddReService(Tbljxmarriageinfo tbljxmarriageinfo){
        return ReMapper.addReMapper(tbljxmarriageinfo);
    }

    public int count(String id,String sex){
        return ReMapper.count(id ,sex);
    }

    public int updReService(Tbljxmarriageinfo tbljxmarriageinfo){
        return ReMapper.updReMapper(tbljxmarriageinfo);
    }

}
