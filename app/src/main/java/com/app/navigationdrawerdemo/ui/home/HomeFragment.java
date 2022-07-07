package com.app.navigationdrawerdemo.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.app.navigationdrawerdemo.R;
import com.app.navigationdrawerdemo.customGmailUserData;
import com.app.navigationdrawerdemo.customGmail_Adapter;
import com.app.navigationdrawerdemo.databinding.FragmentHomeBinding;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    RecyclerView homeRecycler;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        homeRecycler = root.findViewById(R.id.homeRecycler);
        homeRecycler.setLayoutManager(new LinearLayoutManager(container.getContext(), LinearLayoutManager.VERTICAL, false));

        ArrayList<customGmailUserData> userData = new ArrayList<>();

        userData.add(new customGmailUserData(R.drawable.profile_1, "YES BANK Alert", "6:00", "10% discount on Select Cards. Books of all Genres at Best Prices. Buy now! Events are a useful way to collect data about a user's interaction with interactive components of"));
        userData.add(new customGmailUserData(R.drawable.profile_2, "KOTAK BANK Alert", "6:54", "10% discount on Select Cards. Books of all Genres at Best Prices. Buy now! Events are a useful way to collect data about a user's interaction with interactive components of"));
        userData.add(new customGmailUserData(R.drawable.profile_1, "YES BANK Alert", "6:00", "10% discount on Select Cards. Books of all Genres at Best Prices. Buy now! Events are a useful way to collect data about a user's interaction with interactive components of"));
        userData.add(new customGmailUserData(R.drawable.profile_2, "KOTAK BANK Alert", "6:54", "10% discount on Select Cards. Books of all Genres at Best Prices. Buy now! Events are a useful way to collect data about a user's interaction with interactive components of"));
        userData.add(new customGmailUserData(R.drawable.profile_1, "YES BANK Alert", "6:00", "10% discount on Select Cards. Books of all Genres at Best Prices. Buy now! Events are a useful way to collect data about a user's interaction with interactive components of"));
        userData.add(new customGmailUserData(R.drawable.profile_2, "KOTAK BANK Alert", "6:54", "10% discount on Select Cards. Books of all Genres at Best Prices. Buy now! Events are a useful way to collect data about a user's interaction with interactive components of"));
        userData.add(new customGmailUserData(R.drawable.profile_1, "YES BANK Alert", "6:00", "10% discount on Select Cards. Books of all Genres at Best Prices. Buy now! Events are a useful way to collect data about a user's interaction with interactive components of"));
        userData.add(new customGmailUserData(R.drawable.profile_2, "KOTAK BANK Alert", "6:54", "10% discount on Select Cards. Books of all Genres at Best Prices. Buy now! Events are a useful way to collect data about a user's interaction with interactive components of"));
        userData.add(new customGmailUserData(R.drawable.profile_1, "YES BANK Alert", "6:00", "10% discount on Select Cards. Books of all Genres at Best Prices. Buy now! Events are a useful way to collect data about a user's interaction with interactive components of"));
        userData.add(new customGmailUserData(R.drawable.profile_2, "KOTAK BANK Alert", "6:54", "10% discount on Select Cards. Books of all Genres at Best Prices. Buy now! Events are a useful way to collect data about a user's interaction with interactive components of"));
        userData.add(new customGmailUserData(R.drawable.profile_1, "YES BANK Alert", "6:00", "10% discount on Select Cards. Books of all Genres at Best Prices. Buy now! Events are a useful way to collect data about a user's interaction with interactive components of"));
        userData.add(new customGmailUserData(R.drawable.profile_2, "KOTAK BANK Alert", "6:54", "10% discount on Select Cards. Books of all Genres at Best Prices. Buy now! Events are a useful way to collect data about a user's interaction with interactive components of"));
        userData.add(new customGmailUserData(R.drawable.profile_1, "YES BANK Alert", "6:00", "10% discount on Select Cards. Books of all Genres at Best Prices. Buy now! Events are a useful way to collect data about a user's interaction with interactive components of"));
        userData.add(new customGmailUserData(R.drawable.profile_2, "KOTAK BANK Alert", "6:54", "10% discount on Select Cards. Books of all Genres at Best Prices. Buy now! Events are a useful way to collect data about a user's interaction with interactive components of"));
        userData.add(new customGmailUserData(R.drawable.profile_1, "YES BANK Alert", "6:00", "10% discount on Select Cards. Books of all Genres at Best Prices. Buy now! Events are a useful way to collect data about a user's interaction with interactive components of"));
        userData.add(new customGmailUserData(R.drawable.profile_2, "KOTAK BANK Alert", "6:54", "10% discount on Select Cards. Books of all Genres at Best Prices. Buy now! Events are a useful way to collect data about a user's interaction with interactive components of"));
        userData.add(new customGmailUserData(R.drawable.profile_1, "YES BANK Alert", "6:00", "10% discount on Select Cards. Books of all Genres at Best Prices. Buy now! Events are a useful way to collect data about a user's interaction with interactive components of"));
        userData.add(new customGmailUserData(R.drawable.profile_2, "KOTAK BANK Alert", "6:54", "10% discount on Select Cards. Books of all Genres at Best Prices. Buy now! Events are a useful way to collect data about a user's interaction with interactive components of"));

        customGmail_Adapter gmailAdapter = new customGmail_Adapter(getContext(),userData);
        homeRecycler.setAdapter(gmailAdapter);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}