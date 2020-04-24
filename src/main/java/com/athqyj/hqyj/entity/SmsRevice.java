package com.athqyj.hqyj.entity;


public class SmsRevice {

  private long id;
  private String tel;
  private String textNeiRong;
  private java.sql.Timestamp dtime;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }


  public String getTextNeiRong() {
    return textNeiRong;
  }

  public void setTextNeiRong(String textNeiRong) {
    this.textNeiRong = textNeiRong;
  }


  public java.sql.Timestamp getDtime() {
    return dtime;
  }

  public void setDtime(java.sql.Timestamp dtime) {
    this.dtime = dtime;
  }

}
