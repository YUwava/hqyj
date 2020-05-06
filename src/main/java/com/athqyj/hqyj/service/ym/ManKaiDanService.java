package com.athqyj.hqyj.service.ym;

import com.athqyj.hqyj.Mapper.ym.ManKaiDanMapper;
import com.athqyj.hqyj.entity.NanKaidan;
import com.athqyj.hqyj.entity.NvKaidan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManKaiDanService {
    @Autowired
    private ManKaiDanMapper manKaiDanMapper;
    public int addInfo(NanKaidan nanKaidan){
        int con=manKaiDanMapper.addInfo(nanKaidan);
        return con;
    }
}
