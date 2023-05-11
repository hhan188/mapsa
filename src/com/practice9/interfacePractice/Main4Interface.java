package com.practice9.interfacePractice;

import com.practice9.interfacePractice.Tamrin2.BasicCalculator;
import com.practice9.interfacePractice.Tamrin4.Bird;
import com.practice9.interfacePractice.Tamrin4.Flyable;
import com.practice9.interfacePractice.Tamrin4.Plane;
import com.practice9.interfacePractice.Tamrin4.Superman;
import com.practice9.interfacePractice.Tamrin5.CDPlayer;
import com.practice9.interfacePractice.Tamrin5.MP3Player;
import com.practice9.interfacePractice.Tamrin5.Playable;
import com.practice9.interfacePractice.Tamrin6.Rectangle;

public class Main4Interface
{
    public static void main(String[] args)
    {

        //------------------------------------------------------------------------
        //Tamrin 2
        System.out.println("Tamrin 2");
        System.out.println("---------------------------------------------------");

        BasicCalculator calc = new BasicCalculator(20,4, '+');
        System.out.println(calc);

        System.out.println("\n");


        //------------------------------------------------------------------------
        //Tamrin 4
        System.out.println("Tamrin 4");
        System.out.println("---------------------------------------------------");

        Flyable bird = new Bird();
        Flyable plane = new Plane();
        Flyable superman = new Superman();

        bird.fly();
        plane.fly();
        superman.fly();

        System.out.println("\n");


        //------------------------------------------------------------------------
        //Tamrin 5
        System.out.println("Tamrin 5");
        System.out.println("---------------------------------------------------");

        Playable cdPlayer = new CDPlayer();
        Playable mp3Player = new MP3Player();

        cdPlayer.play();
        cdPlayer.pause();
        cdPlayer.stop();

        mp3Player.play();
        mp3Player.pause();
        mp3Player.stop();

        System.out.println("\n");

        //------------------------------------------------------------------------
        //Tamrin 6
        System.out.println("Tamrin 6");
        System.out.println("---------------------------------------------------");

        Rectangle rec = new Rectangle(6, 8);
        rec.resize(15);
        System.out.println("Height: " + rec.getHeight());
        System.out.println("Width: " + rec.getWidth());
    }
}
