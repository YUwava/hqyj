package com.athqyj.hqyj.service.fpj;

import com.athqyj.hqyj.Mapper.fpj.XbcMapper;
import com.athqyj.hqyj.entity.Tblxray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class XbcService {
    @Autowired
    private XbcMapper XbcMapper;

    public Tblxray QueryxbcService(Long AutoId,String sex){
        return XbcMapper.QueryxbcMapper(AutoId,sex);
    }


    public int AddXbcService(Tblxray Tblxray){
        return XbcMapper.AddXbcMapper(Tblxray);
    }
}
