package com.company;

public class Main {

    public static void main(String[] args) {

        animalSpeakable hiCow = () -> System.out.println("Я корова- Мууу-Мууу");
        animalSpeakable hiCat = () -> System.out.println("Я кіт- Мяууу-Мяууу");
        animalSpeakable hiDog = () -> System.out.println("Я пес - Гаууу-Гаууу");

        hiCow.sayHello();
        hiCat.sayHello();
        hiDog.sayHello();

        System.out.println();

        workable eat = work -> System.out.println(work);
        workable sleep = work -> System.out.println(work);
        workable swim = work -> System.out.println(work);
        workable walk = work -> System.out.println(work);

        eat.doIt("Я їм");
        sleep.doIt("Я сплю");
        swim.doIt("Я плаваю");
        walk.doIt("Я гуляю");




    }
}
