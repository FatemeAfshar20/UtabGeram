package com.example.recyclerview.Model;

import java.util.UUID;

public class Users {
    private UUID mID=UUID.randomUUID();
    private String mUserName;
    private int mImageId;

    public Users(String userName, int imageId) {
        mUserName = userName;
        mImageId = imageId;
    }

    public UUID getID() {
        return mID;
    }

    public String getUserName() {
        return mUserName;
    }

    public void setUserName(String userName) {
        mUserName = userName;
    }

    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int imageId) {
        mImageId = imageId;
    }

}
