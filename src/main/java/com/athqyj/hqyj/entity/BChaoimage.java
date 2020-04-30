package com.athqyj.hqyj.entity;


import java.util.List;

public class BChaoimage {

  private long autoId;
  private String id;
  private String bmodNums;
  private String picSource;
  private double picSize;

  public List<NvBchao> nvBchaos;

  public List<NvBchao> getNvBchaos() {
    return nvBchaos;
  }

  public void setNvBchaos(List<NvBchao> nvBchaos) {
    this.nvBchaos = nvBchaos;
  }

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


  public String getBmodNums() {
    return bmodNums;
  }

  public void setBmodNums(String bmodNums) {
    this.bmodNums = bmodNums;
  }


  public String getPicSource() {
    return picSource;
  }

  public void setPicSource(String picSource) {
    this.picSource = picSource;
  }


  public double getPicSize() {
    return picSize;
  }

  public void setPicSize(double picSize) {
    this.picSize = picSize;
  }

}
