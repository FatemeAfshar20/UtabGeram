package com.example.recyclerview.Adapter;

import android.content.Context;
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

public class UserAdapter extends RecyclerView.Adapter <UserAdapter.Holder>{
    List<Users> mUsersList;
    Context mContext;

    public UserAdapter(List<Users> usersList, Context context) {
        mUsersList = usersList;
        mContext = context;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(mContext);
        View view=layoutInflater.inflate(R.layout.item_view,parent,false);
        Holder viewHolder=new Holder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
            holder.bind(mUsersList.get(position));
    }


    @Override
    public int getItemCount() {
        return mUsersList.size();
    }

    class Holder extends RecyclerView.ViewHolder {
         CircleImageView mProfile;
         TextView mUserName;
         Users mUser;

        public Holder(@NonNull View itemView) {
            super(itemView);
            findElem(itemView);
        }

        private void findElem(View view){
            mProfile=view.findViewById(R.id.profile_image);
            mUserName=view.findViewById(R.id.user_name);
        }

        public void bind(Users user){
            mProfile.setImageResource(user.getImageId());
            mUserName.setText(user.getUserName());
        }

    }
}
