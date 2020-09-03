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
        initUsers();
    }

    private int[] mImages = {
            R.drawable.pendar,
            R.drawable.ronaldo,
            R.drawable.tarane,
            R.drawable.ayeshe,
            R.drawable.armin,
            R.drawable.kamran_jafari,
            R.drawable.homan,
            R.drawable.tohi,
            R.drawable.kamran,
            R.drawable.mohammad,
            R.drawable.shakira,
            R.drawable.saeed_maroof,
            R.drawable.rihane,
            R.drawable.daren_hardi,
            R.drawable.messi,
            R.drawable.azari_girl,
            R.drawable.ehsan_khaje_amiri,
            R.drawable.elnaz
    };

    private String[] mNames = {
            "Pendar Akbari",
            "Ronaldo",
            "Tarane",
            "Ayeshe",
            "Armin Zarei",
            "Kamran",
            "Homan",
            "Tohi",
            "Kamran Tafti",
            "Mohammad",
            "Shakira",
            "Saeed Marouf",
            "Rihana",
            "Darenj Hardi",
            "Messi",
            "Azari Girl",
            "Ehsan Khaje Amiri",
            "Elnaz",
    };

    public List<Users> getUsersList(){
        return mUsersList;
    }

    public void initUsers(){
        for (int i = 0; i <mImages.length ; i++) {
            mUsersList.add(new Users(mNames[i],mImages[i]));
        }
    }

    public static Repository getInstance(){
        if(mInstance==null)
            mInstance=new Repository();
        return mInstance;
    }
}
