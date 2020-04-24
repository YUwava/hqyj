package com.athqyj.hqyj.entity;


public class Loginlog {

  private long id;
  private java.sql.Timestamp logintime;
  private String loginmode;
  private String loginuser;
  private String loginpermissions;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public java.sql.Timestamp getLogintime() {
    return logintime;
  }

  public void setLogintime(java.sql.Timestamp logintime) {
    this.logintime = logintime;
  }


  public String getLoginmode() {
    return loginmode;
  }

  public void setLoginmode(String loginmode) {
    this.loginmode = loginmode;
  }


  public String getLoginuser() {
    return loginuser;
  }

  public void setLoginuser(String loginuser) {
    this.loginuser = loginuser;
  }


  public String getLoginpermissions() {
    return loginpermissions;
  }

  public void setLoginpermissions(String loginpermissions) {
    this.loginpermissions = loginpermissions;
  }

}
