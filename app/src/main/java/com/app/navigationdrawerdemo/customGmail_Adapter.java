package com.app.navigationdrawerdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class customGmail_Adapter extends RecyclerView.Adapter<customGmail_Adapter.ViewHolder> {

    private Context context;
    ArrayList<customGmailUserData> gmailUserData;

    public customGmail_Adapter(Context context, ArrayList<customGmailUserData> gmailUserData) {
        this.context = context;
        this.gmailUserData = gmailUserData;
    }

    @NonNull
    @Override
    public customGmail_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.custom_gmail_card,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull customGmail_Adapter.ViewHolder holder, int position) {
    customGmailUserData userData=gmailUserData.get(position);

    if (userData!=null){
        holder.gmailProfile.setImageResource(userData.getGmailProfile());
        holder.gmailTime.setText(userData.getGmailTime());
        holder.gmailDescription.setText(userData.getGmailDescription());
        holder.gmailHeading.setText(userData.getGmailHeading());
    }

    }

    @Override
    public int getItemCount() {
        return gmailUserData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView gmailProfile;
        TextView gmailHeading;
        TextView gmailTime;
        TextView gmailDescription;

        public ViewHolder(@NonNull View itemView) {
             super(itemView);
             gmailProfile=itemView.findViewById(R.id.gmailProfile);
             gmailHeading=itemView.findViewById(R.id.gmailHeading);
             gmailTime=itemView.findViewById(R.id.gmailTime);
             gmailDescription=itemView.findViewById(R.id.gmailDescription);
        }
    }
}
