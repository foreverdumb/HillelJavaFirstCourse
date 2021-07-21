package com.hillel.homework_13.services;

public class MainServiceClass {
    public static void doTasks() throws InterruptedException {
        int option;
        do {
            System.out.println("""
                    Choose:
                    1 - Show devices;
                    2 - Play music;
                    3 - Exit.
                    """);
            option = MusicServiceClass.number();
            switch (option) {
                case 1 -> DeviceServiceClass.showDevices();
                case 2 -> MusicServiceClass.playMusic();
                case 3 -> System.out.println("Bye");
            }
        } while (option != 3);
    }
}
