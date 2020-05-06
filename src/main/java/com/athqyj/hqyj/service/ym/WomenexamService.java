package com.athqyj.hqyj.service.ym;

import com.athqyj.hqyj.Mapper.ym.WomenMapper;
import com.athqyj.hqyj.Mapper.ym.WomenexamMapper;
import com.athqyj.hqyj.entity.NvTigejiancha;
import com.athqyj.hqyj.entity.NvYibanqingkuang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WomenexamService {
    @Autowired
    private WomenexamMapper womenexamMapper;
    public int addInfo(NvTigejiancha nvTigejiancha){
        int con=womenexamMapper.addInfo(nvTigejiancha);
        return con;
    }

}
