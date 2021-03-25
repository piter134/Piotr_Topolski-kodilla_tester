package com.kodilla.collections.adv.Immutable.homework;

public final class Task {
    final String title;
    final int duration;

    public Task(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public String getTitle() {
        return title;
    }
}
