package com.athqyj.hqyj.service.ym;


import com.athqyj.hqyj.Mapper.ym.CrtarchivesMapper;
import com.athqyj.hqyj.entity.MInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CrtarchivesService {
    /*啊*/
    @Autowired
    private CrtarchivesMapper crtarchivesMapper;

    /*新增人员信息*/
    public int addPeopleInfo(MInfo mInfo){
        int con=crtarchivesMapper.addPeopleInfo(mInfo);
        return con;
    }

}

