package com.example.recyclerview.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.Model.Users;
import com.example.recyclerview.R;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<Holder>{
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
        holder.setContext(mContext);

    }

    @Override
    public int getItemCount() {
        return mUsersList.size();
    }

}
