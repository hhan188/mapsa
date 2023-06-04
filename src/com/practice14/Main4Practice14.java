package com.practice14;

import com.practice14.Excercise41.Excercise41;
import com.practice14.Excercise42.Excercise42;
import com.practice14.Excercise43.Excersice43;
import com.practice14.Excercise46.Album;
import com.practice14.Excercise46.Song;
import com.practice14.Excercise50.Game;
import com.practice14.Excersice44.Contact;
import com.practice14.Excersice44.MobilePhone;
import com.practice14.Excersice45.Bank;
import com.practice14.Excersice45.BranchAlreadyExist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main4Practice14
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Exercise 41 ");
        System.out.println("------------------------------------");
        System.out.println("How Many Number? ");
        int size = sc.nextInt();
        Excercise41.getNumbers(size);
        Excercise41.printArray();
        Excercise41.sortIntegers();
        System.out.println("------------------------------------\n");



        System.out.println("Exercise 42");
        System.out.println("------------------------------------");
        System.out.println("How Many Number? ");

        int size2 = sc.nextInt();

        System.out.println("Minimum: " + Excercise42.findMin(Excercise42.readElements(size2)));
        System.out.println("------------------------------------\n");


        System.out.println("Exercise 43");
        System.out.println("------------------------------------");
        Excersice43.reverse();
        System.out.println("------------------------------------\n");


        System.out.println("Exercise 44");
        System.out.println("------------------------------------");
        MobilePhone phone = new MobilePhone("12345");
        Contact c1 = new Contact("Bob", "986897");
        Contact c2 = new Contact("ali", "457847");
        Contact c3 = new Contact("mehdi", "341688");

        phone.addNewContact(c1);
        phone.addNewContact(c2);
        phone.addNewContact(c3);

        phone.printContacts();

        phone.updateContact(c1, new Contact("Ramin", "09108434"));

        phone.printContacts();

        phone.removeContact(c2);

        phone.printContacts();
        System.out.println("------------------------------------\n");



        System.out.println("Exercise 45");
        System.out.println("------------------------------------");
        Bank bank = new Bank("National Australia Bank");

        try
        {
            bank.addBranch("Adelaide");
        }
        catch (BranchAlreadyExist e)
        {
            System.out.println(e.getMessage());
        }

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.listCustomers("Adelaide", true);
        System.out.println("------------------------------------\n");



        System.out.println("Exercise 46");
        System.out.println("------------------------------------");
        ArrayList<Album> albums = new ArrayList<>();

        Album album = new Album("Stormbringer", "Deep Purple");

        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);


        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("Speed king", playList);  // Does not exist
        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(24, playList);

        System.out.println(albums);
        System.out.println("------------------------------------\n");



        System.out.println("Exercise 50");
        System.out.println("------------------------------------");
        Game.command();
        System.out.println("------------------------------------\n");
    }
}
