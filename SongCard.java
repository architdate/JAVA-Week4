package com.example;

import java.util.*;

public class SongCard {

    private int songs;
    private boolean activated;
    public SongCard(int n) {
        songs = n;
    }
    public void activate() {
        activated = true;
    }
    public void buyASong() throws CardNotActivatedException, CardEmptyException {
        if (!activated)
            throw new CardNotActivatedException();
        if (songs <= 0)
            throw new CardEmptyException();
        songs = songs - 1;
    }

    public int songsRemaining() {
        return songs;
    }


    public String toString() {
        return String.format(Locale.US, "Card has %d songs and is %s", songs,
                (activated ? "activated" : "not activated"));
    }

    public static void main(String[] args) {
        SongCard sc = new SongCard(10);
        System.out.println(sc);

        System.out.println();

        System.out.println("Trying to buy a song");
        try {
            sc.buyASong();
        } catch (CardEmptyException e) {
            System.out.println("Caught error: " + e.getMessage());
        } catch (CardNotActivatedException e) {
            System.out.println("Caught error: " + e.getMessage());
        }
        System.out.println(sc);
        System.out.println("Activating the card");
        sc.activate();
        System.out.println(sc);

        System.out.println();

        System.out.println("Buying songs");

        while (true) {
            try {
                sc.buyASong();
                System.out.println("Bought a song: " + sc);
            } catch (CardEmptyException e) {
                System.out.println("Caught error: " + e.getMessage());
                break;
            } catch (CardNotActivatedException e) {
                System.out.println("Caught error: " + e.getMessage());
                break;
            }
        }

        System.out.println(sc);

    }
}

class CardNotActivatedException extends Exception {
    public String getMessage() {
        return "Card not activated";
    }
}

class CardEmptyException extends Exception {
    public String getMessage() {
        return "No more songs on the card";
    }
}
