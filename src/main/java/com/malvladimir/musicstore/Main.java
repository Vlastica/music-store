package com.malvladimir.musicstore;

public class Main {
    public static void main(String[] args) {
        System.out.println("Music store");

        System.out.println("Artists");
        printArtists();

        System.out.println("Songs");
        printSongs();

    }

    private static void printSongs() {
        System.out.println("ID    Name");
        System.out.println("1 Paradise");
        System.out.println("2 Radioactive");
    }

    private static void printArtists() {
        System.out.println("ID    Name");
        System.out.println("1 Coldplay");
        System.out.println("2 Imagine dragons");
    }

}