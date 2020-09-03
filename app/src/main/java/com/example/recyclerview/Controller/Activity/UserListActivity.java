package com.example.recyclerview.Controller.Activity;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.Adapter.UserAdapter;
import com.example.recyclerview.Controller.SingleFragment;
import com.example.recyclerview.Controller.Fragment.UserListFragment;
import com.example.recyclerview.Model.Users;
import com.example.recyclerview.R;
import com.example.recyclerview.Repository.Repository;

import java.util.List;

public class UserListActivity extends SingleFragment {

    @Override
    public Fragment getFragment() {
        return new UserListFragment();
    }

}