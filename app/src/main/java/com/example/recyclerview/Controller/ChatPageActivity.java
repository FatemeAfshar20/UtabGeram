package com.example.recyclerview.Controller;

import androidx.fragment.app.Fragment;

public class ChatPageActivity extends SingleFragment {
    @Override
    public Fragment getFragment() {
        return new ChatPageFragment();
    }
}