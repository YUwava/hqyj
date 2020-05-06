package com.athqyj.hqyj.service.ym;

import com.athqyj.hqyj.Mapper.ym.WomenKaiDanMapper;
import com.athqyj.hqyj.entity.NvKaidan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WomenKanDanService {
    @Autowired
    private WomenKaiDanMapper womenTestMapper;
    public int addInfo(NvKaidan kaidan){
        int con=womenTestMapper.addInfo(kaidan);
        return con;
    }
}
