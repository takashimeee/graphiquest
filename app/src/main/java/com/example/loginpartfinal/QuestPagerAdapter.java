package com.example.loginpartfinal;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class QuestPagerAdapter extends FragmentStateAdapter {

    public QuestPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new PendingFragment();
            case 1:
                return new OnGoingFragment();
            case 2:
                return new FinishedFragment();
            default:
                return new PendingFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
