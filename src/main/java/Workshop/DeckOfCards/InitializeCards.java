package Workshop.DeckOfCards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class InitializeCards {

        public static String[] suit={"Clubs","Diamonds", "Hearts", "Spades"};
        public static String[] rank={"-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10","-Jack", "-Queen", "-King", "-Ace"};
        public static int CARDS=9;
        public static int PLAYERS;
        public static ArrayList cards=new ArrayList();
        public static ArrayList numbers=new ArrayList();
        public static Scanner sc =new Scanner(System.in);

    public static void distribute() {

        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                String s1 = suit[i];
                String s2 = rank[j];
                cards.add(s1.concat(s2));

            }
        }
        print();
    }
        public static void print(){
            System.out.println("\nThe list of cards:");
        for(int i=0;i<52;i++){
            System.out.println(cards.get(i));
        }
    }

    public static void createplayers() {
        System.out.println("\nEnter how many player you need:");
        PLAYERS = sc.nextInt();
        System.out.println("Created " + PLAYERS + " players");

    }

    public static void distributecard() {
        for (int i = 0; i < CARDS; i++) {
            for (int j = 0; j < PLAYERS; j++) {

            }
        }
    }

    public static void shufflecards(){
        for(int i=0;i<52;i++){
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        System.out.println(numbers);
    }
}


