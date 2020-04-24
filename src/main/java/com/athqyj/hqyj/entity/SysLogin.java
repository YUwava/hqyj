package com.athqyj.hqyj.entity;


public class SysLogin {

  private long id;
  private String nvcUsername;
  private String nvcPsw;
  private String nvcRole;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getNvcUsername() {
    return nvcUsername;
  }

  public void setNvcUsername(String nvcUsername) {
    this.nvcUsername = nvcUsername;
  }


  public String getNvcPsw() {
    return nvcPsw;
  }

  public void setNvcPsw(String nvcPsw) {
    this.nvcPsw = nvcPsw;
  }


  public String getNvcRole() {
    return nvcRole;
  }

  public void setNvcRole(String nvcRole) {
    this.nvcRole = nvcRole;
  }

}
