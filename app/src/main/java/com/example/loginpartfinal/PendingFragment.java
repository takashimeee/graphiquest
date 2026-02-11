package com.example.loginpartfinal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PendingFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pending, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        List<Quest> quests = new ArrayList<>();
        quests.add(new Quest("WAITING FOR APPROVAL", "DECEMBER 15, 2025", "Description...\nCreate a balloon commission", "Difficulty: D-", R.drawable.balloon));
        quests.add(new Quest("WAITING FOR APPROVAL", "JANUARY 04, 2026", "Description...\nCreate a sword commission", "Difficulty: A-", R.drawable.sword));
        quests.add(new Quest("WAITING FOR APPROVAL", "MARCH 20, 2026", "Description...\nCreate a shield commission", "Difficulty: C-", R.drawable.shield));

        QuestAdapter adapter = new QuestAdapter(quests);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
