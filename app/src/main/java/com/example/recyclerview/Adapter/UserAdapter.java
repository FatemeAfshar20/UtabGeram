package com.example.recyclerview.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.Model.Users;
import com.example.recyclerview.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.Holder> {
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
        if(position%2!=0)
            holder.getUserName().setBackgroundColor(Color.alpha(R.color.blue_light));
        holder.bind(mUsersList.get(position));
    }

    @Override
    public int getItemCount() {
        return mUsersList.size();
    }

    class Holder extends RecyclerView.ViewHolder{
        private CircleImageView mProfileImage;
        private TextView mUserName;

        public CircleImageView getProfileImage() {
            return mProfileImage;
        }

        public void setProfileImage(CircleImageView profileImage) {
            mProfileImage = profileImage;
        }

        public TextView getUserName() {
            return mUserName;
        }

        public void setUserName(TextView userName) {
            mUserName = userName;
        }

        public Holder(@NonNull View itemView) {
            super(itemView);
            findElem(itemView);
        }

        private void findElem(View view){
            mProfileImage =view.findViewById(R.id.profile_image);
            mUserName=view.findViewById(R.id.user_name);
        }

        public void bind(Users user){
            mProfileImage.setImageResource(user.getImageId());
            mUserName.setText(user.getUserName());
        }
    }

}
