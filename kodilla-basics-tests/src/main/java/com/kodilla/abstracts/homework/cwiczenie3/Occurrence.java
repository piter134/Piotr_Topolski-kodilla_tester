package com.kodilla.abstracts.homework.cwiczenie3;

public abstract class Occurrence {

    private String continent;
    private String environment;

    public Occurrence(String continent, String environment) {
        this.continent = continent;
        this.environment = environment;
    }
    public String getEnvironment() {
        return environment;
    }
}