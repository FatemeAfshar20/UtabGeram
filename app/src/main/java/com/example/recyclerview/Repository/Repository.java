package com.example.recyclerview.Repository;

import android.widget.RelativeLayout;

import com.example.recyclerview.Model.Users;
import com.example.recyclerview.R;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    private static Repository mInstance;
    private Users mUsers;
    private List<Users> mUsersList = new ArrayList<>();

    private Repository() {
        getUsersList();
    }

    private int[] mImages = {
            R.drawable.armin,
            R.drawable.pendar,
            R.drawable.kamran_jafari,
            R.drawable.homan,
            R.drawable.tohi,
            R.drawable.kamran,
            R.drawable.mohammad,
            R.drawable.shakira,
            R.drawable.saeed_maroof,
            R.drawable.rihane,
            R.drawable.daren_hardi
    };

    private String[] mNames = {
            "Armin Zarei",
            "Pendar Akbari",
            "Kamran",
            "Homan",
            "Tohi",
            "Kamran Tafti",
            "Mohammad",
            "Shakira",
            "Saeed Marouf",
            "Rihana",
            "Darenj Hardi",
    };

    public List<Users> getUsersList(){
        for (int i = 0; i <mImages.length ; i++) {
            mUsersList.add(new Users(mNames[i],mImages[i]));
        }
        return mUsersList;
    }

    public static Repository getInstance(){
        if(mInstance==null)
            mInstance=new Repository();
        return mInstance;
    }
}
