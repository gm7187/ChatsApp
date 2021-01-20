package com.example.chatsapp;

public class User {
    private String uid, name, phoneNo, profileImage;

    public User(){

    }

    public User(String uid, String name, String phoneNo, String profileImage) {
        this.uid = uid;
        this.name = name;
        this.phoneNo = phoneNo;
        this.profileImage = profileImage;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }
}
