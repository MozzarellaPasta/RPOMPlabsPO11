package com.example.kozinlab3;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MyPagerAdapter extends FragmentStateAdapter {
    public MyPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0: return new FragmentShow();
            case 1: return new FragmentAdd();
            case 2: return new FragmentDel();
            case 3: return new FragmentUpdate();
            default: return new FragmentShow();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
