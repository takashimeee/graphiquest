package com.example.loginpartfinal;

public class Quest {
    private final String status;
    private final String date;
    private final String description;
    private final String difficulty;
    private final int iconResId;

    public Quest(String status, String date, String description, String difficulty, int iconResId) {
        this.status = status;
        this.date = date;
        this.description = description;
        this.difficulty = difficulty;
        this.iconResId = iconResId;
    }

    public String getStatus() {
        return status;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public int getIconResId() {
        return iconResId;
    }
}
