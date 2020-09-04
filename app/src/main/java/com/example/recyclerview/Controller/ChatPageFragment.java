package com.example.recyclerview.Controller;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.example.recyclerview.Adapter.Holder;
import com.example.recyclerview.Model.Users;
import com.example.recyclerview.R;
import com.google.android.material.button.MaterialButton;

import de.hdodenhof.circleimageview.CircleImageView;

public class ChatPageFragment extends Fragment {

    private CircleImageView mProfileImage;
    private TextView mUserName;
    private EditText mMsg;
    private MaterialButton mBtnSend;
    private ViewGroup mLayChatPlace;
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
        bindInfo(user);
        setListener();
        return view;
    }

    private void findElem(View view){
        mProfileImage =view.findViewById(R.id.profile);
        mUserName=view.findViewById(R.id.username);
        mBtnSend=view.findViewById(R.id.btn_send);
        mMsg=view.findViewById(R.id.msg);
        mLayChatPlace=view.findViewById(R.id.chat_area);
    }

    public void bindInfo(Users user){
        mProfileImage.setImageResource(user.getImageId());
        mUserName.setText(user.getUserName());
    }

    private void setListener(){
        mBtnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg=mMsg.getText().toString();
                TextView msgSent=new TextView(getContext());
                msgSent.setText(msg);
                mLayChatPlace.addView(msgSent);
            }
        });
    }
}