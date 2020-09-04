package com.example.recyclerview.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.Controller.ChatPageActivity;
import com.example.recyclerview.Model.Users;
import com.example.recyclerview.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class Holder extends RecyclerView.ViewHolder  implements View.OnClickListener {
    public static final String EXTRA_USER_INFO = "com.example.recyclerview.UserInfo";
    private CircleImageView mProfileImage;
    private TextView mUserName;
    private Users mUser;
    private Context mContext;

    public Holder(@NonNull View itemView) {
        super(itemView);
        findElem(itemView);
        itemView.setOnClickListener(this);
    }

    public Context getContext() {
        return mContext;
    }

    public void setContext(Context context) {
        mContext = context;
    }

    private void findElem(View view){
        mProfileImage =view.findViewById(R.id.profile_image);
        mUserName=view.findViewById(R.id.user_name);
    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent(mContext, ChatPageActivity.class);
        intent.putExtra(EXTRA_USER_INFO,mUser);
        mContext.startActivity(intent);
    }

    public void bind(Users user){
        mUser=user;
        mProfileImage.setImageResource(user.getImageId());
        mUserName.setText(user.getUserName());
    }

    public void setBGUserNameColor(int colorId){
        mUserName.setBackgroundColor(colorId);
    }

}
