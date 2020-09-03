package com.example.recyclerview.Controller.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import com.example.recyclerview.Adapter.UserAdapter;
import com.example.recyclerview.Model.Users;
import com.example.recyclerview.R;
import com.example.recyclerview.Repository.Repository;

import java.util.List;

public class UserListFragment extends Fragment {
    RecyclerView mRecyclerView;
    List<Users> mUsersList;
    public UserListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_user_list, container, false);
        mRecyclerView=view.findViewById(R.id.recycler_view);
        if(mUsersList==null)
             mUsersList= Repository.getInstance().getUsersList();
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setAdapter(new UserAdapter(mUsersList,getContext()));
        return view;
    }
}