package com.athqyj.hqyj.service.fpj;

import com.athqyj.hqyj.Mapper.fpj.OcMapper;
import com.athqyj.hqyj.Mapper.fpj.XbcMapper;
import com.athqyj.hqyj.entity.Tblmouth;
import com.athqyj.hqyj.entity.Tblxray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OcService {
    @Autowired
    private OcMapper OcMapper;

    public Tblmouth QueryOcService(Long AutoId, String sex){
        return OcMapper.QueryOCMapper(AutoId,sex);
    }

    public int AddOccService(Tblmouth Tblmouth){
        return OcMapper.AddOcMapper(Tblmouth);
    }

    public int count(String id,String sex){
        return OcMapper.count(id ,sex);
    }

    public int updOcService(Tblmouth Tblmouth){
        return OcMapper.updOcMapper(Tblmouth);
    }
}
