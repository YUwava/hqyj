package com.athqyj.hqyj.entity;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;

public class MInfo {

  private long autoId;
  private String id;
  private String mname;
  private String mnationality;
  private long midCardType;
  private String midCard;
  private String mbirthDate;
  private long mage;
  private String meduLevel;
  private long mjob;
  private String mcellPhoneNum;
  private long maccountType;
  private String phoneNum;
  private String fname;
  private String fnationality;
  private long fidCardType;
  private String fidCard;
  private String fbirthDate;
  private long fage;
  private long feduLevel;
  private long fjob;
  private long faccountType;
  private String fcellPhoneNum;
  private String mtime;
  private String maccountLocationProvince;
  private String maccountLocationCity;
  private String maccountLocationCounty;
  private String maccountLocationCountry;
  private String maccountLocationVillage;
  private String faccountLocationProvince;
  private String faccountLocationCity;
  private String faccountLocationCounty;
  private String faccountLocationCountry;
  private String faccountLocationVillage;
  private String addressProvince;
  private String addressCity;
  private String addressCounty;
  private String addressCountry;
  private String addressVillage;
  private String postCode;
  private String doctorName;
  private java.sql.Timestamp serviceTime;
  private String psid;
  private String remindLocationId;
  private long hasContent;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private Date dUpDate;
  private String dupFlag;
  private String faddress;
  private String maddress;
  private String mjobOthers;
  private String fjobOthers;
  private String preId;
  private String emailN;
  private String emailW;
  private String wechatN;
  private String wechatW;
  private String qqn;
  private String qqw;
  private String floatPopulation;

  public List<NvPinggujianyi> getNvPinggujianyis() {
    return nvPinggujianyis;
  }

  public void setNvPinggujianyis(List<NvPinggujianyi> nvPinggujianyis) {
    this.nvPinggujianyis = nvPinggujianyis;
  }

  private List<NvPinggujianyi> nvPinggujianyis;




  public List<LUptoprovince> getlUptoprovince() {
    return lUptoprovince;
  }

  public void setlUptoprovince(List<LUptoprovince> lUptoprovince) {
    this.lUptoprovince = lUptoprovince;
  }

  private List<LUptoprovince> lUptoprovince;



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


  public String getMname() {
    return mname;
  }

  public void setMname(String mname) {
    this.mname = mname;
  }


  public String getMnationality() {
    return mnationality;
  }

  public void setMnationality(String mnationality) {
    this.mnationality = mnationality;
  }


  public long getMidCardType() {
    return midCardType;
  }

  public void setMidCardType(long midCardType) {
    this.midCardType = midCardType;
  }


  public String getMidCard() {
    return midCard;
  }

  public void setMidCard(String midCard) {
    this.midCard = midCard;
  }


  public String getMbirthDate() {
    return mbirthDate;
  }

  public void setMbirthDate(String mbirthDate) {
    this.mbirthDate = mbirthDate;
  }


  public long getMage() {
    return mage;
  }

  public void setMage(long mage) {
    this.mage = mage;
  }


  public String getMeduLevel() {
    return meduLevel;
  }

  public void setMeduLevel(String meduLevel) {
    this.meduLevel = meduLevel;
  }


  public long getMjob() {
    return mjob;
  }

  public void setMjob(long mjob) {
    this.mjob = mjob;
  }


  public String getMcellPhoneNum() {
    return mcellPhoneNum;
  }

  public void setMcellPhoneNum(String mcellPhoneNum) {
    this.mcellPhoneNum = mcellPhoneNum;
  }


  public long getMaccountType() {
    return maccountType;
  }

  public void setMaccountType(long maccountType) {
    this.maccountType = maccountType;
  }


  public String getPhoneNum() {
    return phoneNum;
  }

  public void setPhoneNum(String phoneNum) {
    this.phoneNum = phoneNum;
  }


  public String getFname() {
    return fname;
  }

  public void setFname(String fname) {
    this.fname = fname;
  }


  public String getFnationality() {
    return fnationality;
  }

  public void setFnationality(String fnationality) {
    this.fnationality = fnationality;
  }


  public long getFidCardType() {
    return fidCardType;
  }

  public void setFidCardType(long fidCardType) {
    this.fidCardType = fidCardType;
  }


  public String getFidCard() {
    return fidCard;
  }

  public void setFidCard(String fidCard) {
    this.fidCard = fidCard;
  }


  public String getFbirthDate() {
    return fbirthDate;
  }

  public void setFbirthDate(String fbirthDate) {
    this.fbirthDate = fbirthDate;
  }


  public long getFage() {
    return fage;
  }

  public void setFage(long fage) {
    this.fage = fage;
  }


  public long getFeduLevel() {
    return feduLevel;
  }

  public void setFeduLevel(long feduLevel) {
    this.feduLevel = feduLevel;
  }


  public long getFjob() {
    return fjob;
  }

  public void setFjob(long fjob) {
    this.fjob = fjob;
  }


  public long getFaccountType() {
    return faccountType;
  }

  public void setFaccountType(long faccountType) {
    this.faccountType = faccountType;
  }


  public String getFcellPhoneNum() {
    return fcellPhoneNum;
  }

  public void setFcellPhoneNum(String fcellPhoneNum) {
    this.fcellPhoneNum = fcellPhoneNum;
  }


  public String getMtime() {
    return mtime;
  }

  public void setMtime(String mtime) {
    this.mtime = mtime;
  }


  public String getMaccountLocationProvince() {
    return maccountLocationProvince;
  }

  public void setMaccountLocationProvince(String maccountLocationProvince) {
    this.maccountLocationProvince = maccountLocationProvince;
  }


  public String getMaccountLocationCity() {
    return maccountLocationCity;
  }

  public void setMaccountLocationCity(String maccountLocationCity) {
    this.maccountLocationCity = maccountLocationCity;
  }


  public String getMaccountLocationCounty() {
    return maccountLocationCounty;
  }

  public void setMaccountLocationCounty(String maccountLocationCounty) {
    this.maccountLocationCounty = maccountLocationCounty;
  }


  public String getMaccountLocationCountry() {
    return maccountLocationCountry;
  }

  public void setMaccountLocationCountry(String maccountLocationCountry) {
    this.maccountLocationCountry = maccountLocationCountry;
  }


  public String getMaccountLocationVillage() {
    return maccountLocationVillage;
  }

  public void setMaccountLocationVillage(String maccountLocationVillage) {
    this.maccountLocationVillage = maccountLocationVillage;
  }


  public String getFaccountLocationProvince() {
    return faccountLocationProvince;
  }

  public void setFaccountLocationProvince(String faccountLocationProvince) {
    this.faccountLocationProvince = faccountLocationProvince;
  }


  public String getFaccountLocationCity() {
    return faccountLocationCity;
  }

  public void setFaccountLocationCity(String faccountLocationCity) {
    this.faccountLocationCity = faccountLocationCity;
  }


  public String getFaccountLocationCounty() {
    return faccountLocationCounty;
  }

  public void setFaccountLocationCounty(String faccountLocationCounty) {
    this.faccountLocationCounty = faccountLocationCounty;
  }


  public String getFaccountLocationCountry() {
    return faccountLocationCountry;
  }

  public void setFaccountLocationCountry(String faccountLocationCountry) {
    this.faccountLocationCountry = faccountLocationCountry;
  }


  public String getFaccountLocationVillage() {
    return faccountLocationVillage;
  }

  public void setFaccountLocationVillage(String faccountLocationVillage) {
    this.faccountLocationVillage = faccountLocationVillage;
  }


  public String getAddressProvince() {
    return addressProvince;
  }

  public void setAddressProvince(String addressProvince) {
    this.addressProvince = addressProvince;
  }


  public String getAddressCity() {
    return addressCity;
  }

  public void setAddressCity(String addressCity) {
    this.addressCity = addressCity;
  }


  public String getAddressCounty() {
    return addressCounty;
  }

  public void setAddressCounty(String addressCounty) {
    this.addressCounty = addressCounty;
  }


  public String getAddressCountry() {
    return addressCountry;
  }

  public void setAddressCountry(String addressCountry) {
    this.addressCountry = addressCountry;
  }


  public String getAddressVillage() {
    return addressVillage;
  }

  public void setAddressVillage(String addressVillage) {
    this.addressVillage = addressVillage;
  }


  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }


  public String getDoctorName() {
    return doctorName;
  }

  public void setDoctorName(String doctorName) {
    this.doctorName = doctorName;
  }


  public java.sql.Timestamp getServiceTime() {
    return serviceTime;
  }

  public void setServiceTime(java.sql.Timestamp serviceTime) {
    this.serviceTime = serviceTime;
  }


  public String getPsid() {
    return psid;
  }

  public void setPsid(String psid) {
    this.psid = psid;
  }


  public String getRemindLocationId() {
    return remindLocationId;
  }

  public void setRemindLocationId(String remindLocationId) {
    this.remindLocationId = remindLocationId;
  }


  public long getHasContent() {
    return hasContent;
  }

  public void setHasContent(long hasContent) {
    this.hasContent = hasContent;
  }


  public Date getDUpDate() {
    return dUpDate;
  }

  public void setDUpDate(Date dUpDate) {
    this.dUpDate = dUpDate;
  }


  public String getDupFlag() {
    return dupFlag;
  }

  public void setDupFlag(String dupFlag) {
    this.dupFlag = dupFlag;
  }


  public String getFaddress() {
    return faddress;
  }

  public void setFaddress(String faddress) {
    this.faddress = faddress;
  }


  public String getMaddress() {
    return maddress;
  }

  public void setMaddress(String maddress) {
    this.maddress = maddress;
  }


  public String getMjobOthers() {
    return mjobOthers;
  }

  public void setMjobOthers(String mjobOthers) {
    this.mjobOthers = mjobOthers;
  }


  public String getFjobOthers() {
    return fjobOthers;
  }

  public void setFjobOthers(String fjobOthers) {
    this.fjobOthers = fjobOthers;
  }


  public String getPreId() {
    return preId;
  }

  public void setPreId(String preId) {
    this.preId = preId;
  }


  public String getEmailN() {
    return emailN;
  }

  public void setEmailN(String emailN) {
    this.emailN = emailN;
  }


  public String getEmailW() {
    return emailW;
  }

  public void setEmailW(String emailW) {
    this.emailW = emailW;
  }


  public String getWechatN() {
    return wechatN;
  }

  public void setWechatN(String wechatN) {
    this.wechatN = wechatN;
  }


  public String getWechatW() {
    return wechatW;
  }

  public void setWechatW(String wechatW) {
    this.wechatW = wechatW;
  }


  public String getQqn() {
    return qqn;
  }

  public void setQqn(String qqn) {
    this.qqn = qqn;
  }


  public String getQqw() {
    return qqw;
  }

  public void setQqw(String qqw) {
    this.qqw = qqw;
  }


  public String getFloatPopulation() {
    return floatPopulation;
  }

  public void setFloatPopulation(String floatPopulation) {
    this.floatPopulation = floatPopulation;
  }

}
