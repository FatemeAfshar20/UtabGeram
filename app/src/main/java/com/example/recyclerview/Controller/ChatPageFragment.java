package com.example.recyclerview.Controller;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.recyclerview.Adapter.Holder;
import com.example.recyclerview.Model.Users;
import com.example.recyclerview.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class ChatPageFragment extends Fragment {

    private CircleImageView mProfileImage;
    private TextView mUserName;
    public ChatPageFragment() {
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
        View view= inflater.inflate(R.layout.chat_page, container, false);
        Users user= (Users) getActivity().getIntent().getSerializableExtra(Holder.EXTRA_USER_INFO);
        findElem(view);
        bind(user);
        return view;
    }

    private void findElem(View view){
        mProfileImage =view.findViewById(R.id.profile);
        mUserName=view.findViewById(R.id.username);
    }

    public void bind(Users user){
        mProfileImage.setImageResource(user.getImageId());
        mUserName.setText(user.getUserName());
    }
}