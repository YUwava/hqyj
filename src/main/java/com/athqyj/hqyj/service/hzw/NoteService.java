package com.athqyj.hqyj.service.hzw;

import com.athqyj.hqyj.Mapper.hzw.NoteMapper;
import com.athqyj.hqyj.entity.MInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {
    @Autowired
    private NoteMapper notemapper;



    public List<MInfo> showAllMInfo(/*Integer autoId,*/Integer index, Integer pageSize){
        List<MInfo> list=notemapper.showAllMInfo(/*autoId,*/(index-1)*pageSize,pageSize);
        return list;
    }
    /* 得到档案信息的条数*/
    public int getAllCount(){
        return notemapper.allcount();
    }

}
