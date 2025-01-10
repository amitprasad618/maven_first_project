package com.example;

public class Alien {
    private int age;
    private Laptop lap;
    private Computer com;

    public Alien() {
        System.out.println("default Constructor");
    }

    public Alien(int a) {
        System.out.println("Parameterised Constructor...");
        this.age = a;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code() {
        System.out.println("Aliens were doing coding...");
        com.compile();
    }
    
}
