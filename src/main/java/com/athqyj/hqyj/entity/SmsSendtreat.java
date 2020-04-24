package com.athqyj.hqyj.entity;


public class SmsSendtreat {

  private String id;
  private long xuhao;
  private String fName;
  private String fCard;
  private String tel;
  private String telContext;
  private java.sql.Timestamp sendTime;
  private String isSuccess;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public long getXuhao() {
    return xuhao;
  }

  public void setXuhao(long xuhao) {
    this.xuhao = xuhao;
  }


  public String getFName() {
    return fName;
  }

  public void setFName(String fName) {
    this.fName = fName;
  }


  public String getFCard() {
    return fCard;
  }

  public void setFCard(String fCard) {
    this.fCard = fCard;
  }


  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
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
