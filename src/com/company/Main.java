package com.company;

public class Main {

    public static void main(String[] args) {

        Human h1 = new Human("Hans",25,170);
        MainMenu m1 = new MainMenu();

        System.out.println(h1.name + " ist " + h1.age + " Jahre alt und " + h1.size + " cm groß!");

    }

}
