package com.example.loginpartfinal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class QuestAdapter extends RecyclerView.Adapter<QuestAdapter.ViewHolder> {

    private final List<Quest> quests;

    public QuestAdapter(List<Quest> quests) {
        this.quests = quests;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_quest, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Quest quest = quests.get(position);
        holder.questStatus.setText(quest.getStatus());
        holder.questDate.setText(quest.getDate());
        holder.questDescription.setText(quest.getDescription());
        holder.questDifficulty.setText(quest.getDifficulty());
        holder.questIcon.setImageResource(quest.getIconResId());
    }

    @Override
    public int getItemCount() {
        return quests.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView questStatus;
        TextView questDate;
        TextView questDescription;
        TextView questDifficulty;
        ImageView questIcon;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            questStatus = itemView.findViewById(R.id.quest_status);
            questDate = itemView.findViewById(R.id.quest_date);
            questDescription = itemView.findViewById(R.id.quest_description);
            questDifficulty = itemView.findViewById(R.id.quest_difficulty);
            questIcon = itemView.findViewById(R.id.quest_icon);
        }
    }
}
