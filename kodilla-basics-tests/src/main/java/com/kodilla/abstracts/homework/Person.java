package com.kodilla.abstracts.homework;


public class Person {
    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public void showResponsibilities() {
        String[] responsibilities = job.getResponsibilities();

        String output = "Twoje obowiązki to: ";

        for (int i = 0; i < responsibilities.length; i++) {
            if(i == responsibilities.length - 1){
                output = output + responsibilities[i];
            } else {
                output = output + responsibilities[i] + ", ";
            }
        }

        System.out.println(output);
    }
}