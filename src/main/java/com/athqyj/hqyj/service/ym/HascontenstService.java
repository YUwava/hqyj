package com.athqyj.hqyj.service.ym;

import com.athqyj.hqyj.Mapper.ym.HascontentMapper;
import com.athqyj.hqyj.entity.MHascontent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HascontenstService {
    @Autowired
    private HascontentMapper hascontentMapper;

    /*新增知情同意书*/
    public int addPeopleInfo(MHascontent mHascontent){
        int con=hascontentMapper.addPeopleInfo(mHascontent);
        return con;
    }
}
