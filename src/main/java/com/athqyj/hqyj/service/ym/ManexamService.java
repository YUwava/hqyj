package com.athqyj.hqyj.service.ym;

import com.athqyj.hqyj.Mapper.ym.ManexamMapper;
import com.athqyj.hqyj.entity.NanTigejiancha;
import com.athqyj.hqyj.entity.NvTigejiancha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManexamService {
    @Autowired
    private ManexamMapper manexamMapper;
    public int addInfo(NanTigejiancha nanTigejiancha){
        int con=manexamMapper.addInfo(nanTigejiancha);
        return con;
    }
}
