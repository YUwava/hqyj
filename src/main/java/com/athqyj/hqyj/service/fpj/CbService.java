package com.athqyj.hqyj.service.fpj;

import com.athqyj.hqyj.Mapper.fpj.CbMapper;
import com.athqyj.hqyj.entity.MInfo;
import com.athqyj.hqyj.entity.Tblmarriageresult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CbService {
    @Autowired
    private CbMapper CbMapper;

    public Tblmarriageresult QueryCbService(Long id, String sex){
        return CbMapper.showAllTblmarriageresult(id,sex);
    }

    public MInfo QueryCbsService(Long id){
        return CbMapper.QueryCbsMapper(id);
    }

    public int addcbService(Tblmarriageresult Tblmarriageresult){
        return CbMapper.addcbMapper(Tblmarriageresult);
    }
    public int count(String id ,String sex){
        return CbMapper.count(id,sex);
    }

    public int updCbService(Tblmarriageresult Tblmarriageresult){
        return CbMapper.updcbMapper(Tblmarriageresult);
    }

}
