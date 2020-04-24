package com.athqyj.hqyj.entity;


public class LSigndecinfo {

  private long autoId;
  private String id;
  private String fSignPic;
  private java.sql.Timestamp fDate;
  private String mSignPic;
  private java.sql.Timestamp mDate;
  private long mType;


  public long getAutoId() {
    return autoId;
  }

  public void setAutoId(long autoId) {
    this.autoId = autoId;
  }


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getFSignPic() {
    return fSignPic;
  }

  public void setFSignPic(String fSignPic) {
    this.fSignPic = fSignPic;
  }


  public java.sql.Timestamp getFDate() {
    return fDate;
  }

  public void setFDate(java.sql.Timestamp fDate) {
    this.fDate = fDate;
  }


  public String getMSignPic() {
    return mSignPic;
  }

  public void setMSignPic(String mSignPic) {
    this.mSignPic = mSignPic;
  }


  public java.sql.Timestamp getMDate() {
    return mDate;
  }

  public void setMDate(java.sql.Timestamp mDate) {
    this.mDate = mDate;
  }


  public long getMType() {
    return mType;
  }

  public void setMType(long mType) {
    this.mType = mType;
  }

}
