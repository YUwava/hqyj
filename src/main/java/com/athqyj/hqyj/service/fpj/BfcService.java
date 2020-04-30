package com.athqyj.hqyj.service.fpj;

import com.athqyj.hqyj.Mapper.fpj.BfcMapper;
import com.athqyj.hqyj.entity.MInfo;
import com.athqyj.hqyj.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BfcService {
    @Autowired
    private BfcMapper BfcMapper;

    public MInfo BfcqidService(Long AutoId){
        return BfcMapper.BfcIdQuery(AutoId);
    }
    public List<SysUser> sysuserQueryAllService(){
        return BfcMapper.sysuserQueryAll();
    }
}
