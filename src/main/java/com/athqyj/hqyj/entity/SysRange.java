package com.athqyj.hqyj.entity;


public class SysRange {

  private long autoId;
  private String rangeName;
  private String rangeCName;
  private double minValue;
  private double maxValue;
  private String normalValue;
  private String remark;


  public long getAutoId() {
    return autoId;
  }

  public void setAutoId(long autoId) {
    this.autoId = autoId;
  }


  public String getRangeName() {
    return rangeName;
  }

  public void setRangeName(String rangeName) {
    this.rangeName = rangeName;
  }


  public String getRangeCName() {
    return rangeCName;
  }

  public void setRangeCName(String rangeCName) {
    this.rangeCName = rangeCName;
  }


  public double getMinValue() {
    return minValue;
  }

  public void setMinValue(double minValue) {
    this.minValue = minValue;
  }


  public double getMaxValue() {
    return maxValue;
  }

  public void setMaxValue(double maxValue) {
    this.maxValue = maxValue;
  }


  public String getNormalValue() {
    return normalValue;
  }

  public void setNormalValue(String normalValue) {
    this.normalValue = normalValue;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

}
