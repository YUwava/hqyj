package com.athqyj.hqyj.service.fpj;

import com.athqyj.hqyj.Mapper.fpj.BfcMapper;
import com.athqyj.hqyj.entity.MInfo;
import com.athqyj.hqyj.entity.SysUser;
import com.athqyj.hqyj.entity.Tblmarriageresult;
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

    public Tblmarriageresult QueryCbService(Long id, String sex){
        return BfcMapper.showAllTblmarriageresult(id,sex);
    }

    public MInfo QueryCbsService(Long id){
        return BfcMapper.QueryBfcsMapper(id);
    }

    public int addcbService(Tblmarriageresult Tblmarriageresult){
        return BfcMapper.addcbMapper(Tblmarriageresult);
    }
    public int count(String id ,String sex){
        return BfcMapper.count(id,sex);
    }

    public int updCbService(Tblmarriageresult Tblmarriageresult){
        return BfcMapper.updBfcMapper(Tblmarriageresult);
    }
}
