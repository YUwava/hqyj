package com.athqyj.hqyj.service.hzw;

import com.athqyj.hqyj.Mapper.hzw.OpenTheUltrasonicImageMapper;
import com.athqyj.hqyj.entity.MInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OpenTheUltrasonicImageService {

    @Autowired
    OpenTheUltrasonicImageMapper openTheUltrasonicImageMapper;

    public MInfo showAllMInfo(){
        MInfo list=openTheUltrasonicImageMapper.showAllMInfo();
        return list;
    }

}
