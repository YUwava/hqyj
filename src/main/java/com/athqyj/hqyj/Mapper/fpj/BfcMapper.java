package com.athqyj.hqyj.Mapper.fpj;

import com.athqyj.hqyj.entity.MInfo;
import com.athqyj.hqyj.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BfcMapper {
    @Select("SELECT * from m_info where AutoID=#{AutoId}")
    public MInfo BfcIdQuery(@Param("AutoId")Long AutoId);

    @Select("SELECT * FROM sys_user")
    public List<SysUser> sysuserQueryAll();
}
