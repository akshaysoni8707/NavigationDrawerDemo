package com.app.navigationdrawerdemo.ui.dashboard;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.navigationdrawerdemo.R;
import com.app.navigationdrawerdemo.customGmailUserData;
import com.app.navigationdrawerdemo.customGmail_Adapter;

import java.util.ArrayList;

public class DashboardFragment extends Fragment {

    RecyclerView dashboardRecycler;

    public DashboardFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);

        dashboardRecycler = view.findViewById(R.id.dashboardRecycler);
        dashboardRecycler.setLayoutManager(new LinearLayoutManager(container.getContext(), LinearLayoutManager.VERTICAL, false));

        ArrayList<customGmailUserData> userData = new ArrayList<>();

        userData.add(new customGmailUserData(R.drawable.profile_1, "YES BANK Alert", "6:00", "10% discount on Select Cards. Books of all Genres at Best Prices. Buy now! Events are a useful way to collect data about a user's interaction with interactive components of"));
        userData.add(new customGmailUserData(R.drawable.profile_2, "KOTAK BANK Alert", "6:54", "10% discount on Select Cards. Books of all Genres at Best Prices. Buy now! Events are a useful way to collect data about a user's interaction with interactive components of"));
        userData.add(new customGmailUserData(R.drawable.profile_1, "YES BANK Alert", "6:00", "10% discount on Select Cards. Books of all Genres at Best Prices. Buy now! Events are a useful way to collect data about a user's interaction with interactive components of"));
        userData.add(new customGmailUserData(R.drawable.profile_2, "KOTAK BANK Alert", "6:54", "10% discount on Select Cards. Books of all Genres at Best Prices. Buy now! Events are a useful way to collect data about a user's interaction with interactive components of"));
        userData.add(new customGmailUserData(R.drawable.profile_1, "YES BANK Alert", "6:00", "10% discount on Select Cards. Books of all Genres at Best Prices. Buy now! Events are a useful way to collect data about a user's interaction with interactive components of"));
        userData.add(new customGmailUserData(R.drawable.profile_2, "KOTAK BANK Alert", "6:54", "10% discount on Select Cards. Books of all Genres at Best Prices. Buy now! Events are a useful way to collect data about a user's interaction with interactive components of"));

        customGmail_Adapter gmailAdapter = new customGmail_Adapter(getContext(),userData);
        dashboardRecycler.setAdapter(gmailAdapter);

        return view;
    }
}