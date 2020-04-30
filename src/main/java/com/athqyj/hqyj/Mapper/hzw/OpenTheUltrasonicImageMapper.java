package com.athqyj.hqyj.Mapper.hzw;

import com.athqyj.hqyj.entity.BChaoimage;
import com.athqyj.hqyj.entity.MInfo;
import com.athqyj.hqyj.entity.NvBchao;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

@Mapper
public interface OpenTheUltrasonicImageMapper {

    /*查询用户信息*/
    @Results({@Result(id=true,column = "ID",property = "id"),
            @Result(column = "bmodNums", property = "bmodNums"),
            @Result(column = "picSource", property = "picSource"),
            @Result(column = "picSize", property = "picSize"),
            @Result(column = "ID",property ="bChaoimage", many = @Many(select = "com.athqyj.hqyj.Mapper.hzw.OpenTheUltrasonicImageMapper.getchaoimage",fetchType= FetchType.EAGER))})
    @Select("select * from m_info where ID='1017062000004'")
    public MInfo showAllMInfo();

    /*根据用户信息id查询影像*/
    @Results({@Result(id=true,column="ID",property="id"),
            @Result(column = "bmodNums", property = "bmodNums"),
            @Result(column = "picSource", property = "picSource"),
            @Result(column = "picSize", property = "picSize"),
            @Result(column = "ID",property ="nvBchaos", many = @Many(select = "com.athqyj.hqyj.Mapper.hzw.OpenTheUltrasonicImageMapper.getbchao",fetchType= FetchType.EAGER))
    })
    @Select("select * from b_chaoimage where ID='1017062000004'")
    public List<BChaoimage> getchaoimage(@Param("ID") String id);


    /*根据用户信息id查询影像结果*/
    @Results({@Result(id=true,column="ID",property="id"),
            @Result(column = "result", property = "result"),
            @Result(column = "resultDesc", property = "resultDesc"),
            @Result(column = "reportDate", property = "reportDate"),
            @Result(column = "doctorName", property = "doctorName"),

    })
    @Select("select * from nv_bchao where ID=#{ID}")
    public List<NvBchao> getbchao(@Param("ID") String id);

}
