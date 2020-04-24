package com.athqyj.hqyj.entity;


import java.sql.Blob;
import java.util.Date;

public class Tblrzbchaobaogao {

  private String ID;				//编号
  private String MenzhenBianhao;	//门诊编号
  private String FuWuHao;			//服务号
  private Blob 超声所见;
  private Blob 超声提示;
  private String 操作医生;
  private String 记录医生;
  private Date 检查日期;
  private String 超声号;
  private String 胚囊直径;
  private String 检查部位;
  private int     月经周期;
  private String 子宫位置;
  private Blob 子宫内膜备注;

  public Tblrzbchaobaogao() {
    super();
  }

  private String 子宫内膜;
  private String 子宫大小;
  private String 卵巢右;

  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public String getMenzhenBianhao() {
    return MenzhenBianhao;
  }

  public void setMenzhenBianhao(String menzhenBianhao) {
    MenzhenBianhao = menzhenBianhao;
  }

  public String getFuWuHao() {
    return FuWuHao;
  }

  public void setFuWuHao(String fuWuHao) {
    FuWuHao = fuWuHao;
  }

  public Blob get超声所见() {
    return 超声所见;
  }

  public void set超声所见(Blob 超声所见) {
    this.超声所见 = 超声所见;
  }

  public Blob get超声提示() {
    return 超声提示;
  }

  public void set超声提示(Blob 超声提示) {
    this.超声提示 = 超声提示;
  }

  public String get操作医生() {
    return 操作医生;
  }

  public void set操作医生(String 操作医生) {
    this.操作医生 = 操作医生;
  }

  public String get记录医生() {
    return 记录医生;
  }

  public void set记录医生(String 记录医生) {
    this.记录医生 = 记录医生;
  }

  public Date get检查日期() {
    return 检查日期;
  }

  public void set检查日期(Date 检查日期) {
    this.检查日期 = 检查日期;
  }

  public String get超声号() {
    return 超声号;
  }

  public void set超声号(String 超声号) {
    this.超声号 = 超声号;
  }

  public String get胚囊直径() {
    return 胚囊直径;
  }

  public void set胚囊直径(String 胚囊直径) {
    this.胚囊直径 = 胚囊直径;
  }

  public String get检查部位() {
    return 检查部位;
  }

  public void set检查部位(String 检查部位) {
    this.检查部位 = 检查部位;
  }

  public int get月经周期() {
    return 月经周期;
  }

  public void set月经周期(int 月经周期) {
    this.月经周期 = 月经周期;
  }

  public String get子宫位置() {
    return 子宫位置;
  }

  public void set子宫位置(String 子宫位置) {
    this.子宫位置 = 子宫位置;
  }

  public Blob get子宫内膜备注() {
    return 子宫内膜备注;
  }

  public void set子宫内膜备注(Blob 子宫内膜备注) {
    this.子宫内膜备注 = 子宫内膜备注;
  }

  public String get子宫内膜() {
    return 子宫内膜;
  }

  public void set子宫内膜(String 子宫内膜) {
    this.子宫内膜 = 子宫内膜;
  }

  public String get子宫大小() {
    return 子宫大小;
  }

  public void set子宫大小(String 子宫大小) {
    this.子宫大小 = 子宫大小;
  }

  public String get卵巢右() {
    return 卵巢右;
  }

  public void set卵巢右(String 卵巢右) {
    this.卵巢右 = 卵巢右;
  }

  public String get卵巢左() {
    return 卵巢左;
  }

  public void set卵巢左(String 卵巢左) {
    this.卵巢左 = 卵巢左;
  }

  public String get卵泡右() {
    return 卵泡右;
  }

  public void set卵泡右(String 卵泡右) {
    this.卵泡右 = 卵泡右;
  }

  public String get卵泡左() {
    return 卵泡左;
  }

  public void set卵泡左(String 卵泡左) {
    this.卵泡左 = 卵泡左;
  }

  public String get宫后方积液() {
    return 宫后方积液;
  }

  public void set宫后方积液(String 宫后方积液) {
    this.宫后方积液 = 宫后方积液;
  }

  public Blob get其它() {
    return 其它;
  }

  public void set其它(Blob 其它) {
    this.其它 = 其它;
  }

  private String 卵巢左;
  private String 卵泡右;
  private String 卵泡左;
  private String 宫后方积液;
  private Blob 其它;

}
