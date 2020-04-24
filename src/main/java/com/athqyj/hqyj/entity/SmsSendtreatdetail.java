package com.athqyj.hqyj.entity;


public class SmsSendtreatdetail {

  private String id;
  private long xuHao;
  private String telContext;
  private java.sql.Timestamp sendTime;
  private String isSuccess;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public long getXuHao() {
    return xuHao;
  }

  public void setXuHao(long xuHao) {
    this.xuHao = xuHao;
  }


  public String getTelContext() {
    return telContext;
  }

  public void setTelContext(String telContext) {
    this.telContext = telContext;
  }


  public java.sql.Timestamp getSendTime() {
    return sendTime;
  }

  public void setSendTime(java.sql.Timestamp sendTime) {
    this.sendTime = sendTime;
  }


  public String getIsSuccess() {
    return isSuccess;
  }

  public void setIsSuccess(String isSuccess) {
    this.isSuccess = isSuccess;
  }

}
