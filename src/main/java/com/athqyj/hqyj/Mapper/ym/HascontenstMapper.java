package com.athqyj.hqyj.Mapper.ym;

import com.athqyj.hqyj.entity.MHascontent;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HascontenstMapper {

    @Insert("insert  into `m_hascontent`(`ID`,`MName`,`FName`,`Qztype`,`MTime`,`FTime`,`DocName`,`DocTime`,`hospital`,`mType`) " +
            "values (#{id},#{mName},#{fName},4,#{mTime},#{fTime},#{docName},Now(),NULL,1)")
    public int addPeopleInfo(MHascontent mHascontent);
}
