package com.athqyj.hqyj.service.ym;

import com.athqyj.hqyj.Mapper.ym.ManMapper;
import com.athqyj.hqyj.entity.NanYibanqingkuang;
import com.athqyj.hqyj.entity.NvYibanqingkuang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManService {
    @Autowired
    private ManMapper manMapper;
    public int addInfo(NanYibanqingkuang nanYibanqingkuang){
        int con=manMapper.addmanInfo(nanYibanqingkuang);
        return con;
    }
}
