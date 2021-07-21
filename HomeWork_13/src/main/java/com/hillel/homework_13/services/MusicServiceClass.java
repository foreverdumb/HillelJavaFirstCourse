package com.hillel.homework_13.services;

import com.hillel.homework_13.polymorphism.ClassicalMusicClass;
import com.hillel.homework_13.polymorphism.MusicStyleClass;
import com.hillel.homework_13.polymorphism.PopMusicClass;
import com.hillel.homework_13.polymorphism.RockMusicClass;

import java.util.Scanner;

public class MusicServiceClass {
    public static void playMusic() throws InterruptedException {
        int result_number;
        do {
            System.out.println("----------------------------------------");
            System.out.println("""
                    Song player MENU
                    Press 1 if u want to play CLASSICAL song
                    Press 2 if u want to play POP song
                    Press 3 if u want to play ROCK song
                    Press 4 if u want to CALL METHOD EVERYWHERE
                    Press 5 to close the PLAYER""");
            result_number = number();
            switch (result_number) {
                case 1 -> {
                    System.out.println("----------------------------------------");
                    ClassicalMusicClass classicalMusic = new ClassicalMusicClass();
                    classicalMusic.playMusic();
                }
                case 2 -> {
                    System.out.println("----------------------------------------");
                    PopMusicClass popMusic = new PopMusicClass();
                    popMusic.playMusic();
                }
                case 3 -> {
                    System.out.println("----------------------------------------");
                    RockMusicClass rockMusic = new RockMusicClass();
                    rockMusic.playMusic();
                }
                case 4 -> {
                    System.out.println("----------------------------------------");
                    print();
                }
                case 5 -> {
                    System.out.println("----------------------------------------");
                    System.out.println("Bye ;) ");
                }
            }
        } while (result_number != 5);
    }

    public static int number() {
        return initOption();
    }

    static int initOption() {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            while (!sc.hasNextInt()) {
                System.out.println("Need integer");
                sc.next();
            }
            number = sc.nextInt();
        } while (number <= 0);
        return number;
    }

    public static void print() throws InterruptedException {
        MusicStyleClass musicStyles = new ClassicalMusicClass();
        MusicStyleClass musicStyles1 = new PopMusicClass();
        MusicStyleClass musicStyles2 = new RockMusicClass();
        MusicStyleClass[] musicStyles3 = new MusicStyleClass[3];
        musicStyles3[0] = musicStyles;
        musicStyles3[1] = musicStyles1;
        musicStyles3[2] = musicStyles2;
        for (MusicStyleClass m : musicStyles3) {
            m.playMusic();
        }
    }
}
