package com.example.recyclerview.Adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.Controller.ChatPageActivity;
import com.example.recyclerview.Model.Users;
import com.example.recyclerview.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.Holder>{
    public static final String EXTRA_USER_INFO = "com.example.recyclerview.UserInfo";
    private List<Users> mUsersList;
    private Context mContext;

    public UserAdapter(List<Users> usersList, Context context) {
        mUsersList = usersList;
        mContext = context;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(mContext);
        View view=layoutInflater.inflate(R.layout.item_view,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
/*        if(position==0)
            holder.setBGUserNameColor(R.color.blue_light);
        else
            holder.setBGUserNameColor(R.color.wight_light);*/
        holder.bind(mUsersList.get(position));

    }

    @Override
    public int getItemCount() {
        return mUsersList.size();
    }

    class Holder extends RecyclerView.ViewHolder  implements View.OnClickListener {
        private CircleImageView mProfileImage;
        private TextView mUserName;
        private Users mUser;

        public Holder(@NonNull View itemView) {
            super(itemView);
            findElem(itemView);
            itemView.setOnClickListener(this);
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

}
