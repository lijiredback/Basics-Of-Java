package com.demo08;

public class Dog {
    private String color;
    private String breed;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void eat() {
        System.out.println(color + "的" + breed + "正在啃骨头");
    }

    public void lookHome() {
        System.out.println(color + "的" + breed + "正在看家");
    }
}
