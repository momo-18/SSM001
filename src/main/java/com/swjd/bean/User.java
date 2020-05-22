package com.swjd.bean;


public class User {

  private int uid;
  private String uname;
  private String realname;
  private String password;
  private String  flag;


  public User() {
  }

  public User(String uname, String realname, String password, String flag) {
    this.uname = uname;
    this.realname = realname;
    this.password = password;
    this.flag = flag;
  }

  public int getUid() {
    return uid;
  }

  public void setUid(int uid) {
    this.uid = uid;
  }

  public String getUname() {
    return uname;
  }

  public void setUname(String uname) {
    this.uname = uname;
  }

  public String getRealname() {
    return realname;
  }

  public void setRealname(String realname) {
    this.realname = realname;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String  getFlag() {
    return flag;
  }

  public void setFlag(String flag) {
    this.flag = flag;
  }

  @Override
  public String toString() {
    return "User{" +
            "uid=" + uid +
            ", uname='" + uname + '\'' +
            ", realname='" + realname + '\'' +
            ", password='" + password + '\'' +
            ", flag='" + flag + '\'' +
            '}';
  }
}
