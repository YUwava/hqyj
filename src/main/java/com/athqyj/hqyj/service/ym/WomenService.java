package com.athqyj.hqyj.service.ym;

import com.athqyj.hqyj.Mapper.ym.WomenMapper;
import com.athqyj.hqyj.entity.NvYibanqingkuang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WomenService {
    @Autowired
    private WomenMapper womenMapper;
    public int addInfo(NvYibanqingkuang nvYibanqingkuang){
        int con=womenMapper.addInfo(nvYibanqingkuang);
        return con;
    }

}
