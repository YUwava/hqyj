package com.athqyj.hqyj.service.ym;

import com.athqyj.hqyj.Mapper.ym.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private LoginMapper loginMapper;
    /*验证登录人员信息进行登录*/
    public int LoginInfo(String nvcUsername,String nvcPsw){
        int con=loginMapper.loginInfo(nvcUsername,nvcPsw);
        return con;
    }

}
