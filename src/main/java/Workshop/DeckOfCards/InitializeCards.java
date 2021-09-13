package Workshop.DeckOfCards;

import java.util.Scanner;

public class InitializeCards {

        public static String[] suit={"Clubs","Diamonds", "Hearts", "Spades"};
        public static String[] rank={"2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King", "Ace"};
        public static int CARDS=9;
        public static int PLAYERS;
        public static int[] Players=new int[PLAYERS];
        public static String[][] cardposition=new String[4][13];
        public static Scanner sc =new Scanner(System.in);

    public static void distribute() {
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                String s1 = suit[i];
                String s2 = rank[j];
                cardposition[i][j] = s1.concat(s2);

            }
        }
        print();
    }
        public static void print(){
            System.out.println("\nThe list of cards:");
        for(int i=0;i< suit.length;i++) {
            System.out.println("\n");
            for (int j = 0; j < rank.length; j++) {

                System.out.println(cardposition[i][j]);
            }
        }
    }

    public static void createplayers(){
        System.out.println("\nEnter how many player you need:");
        PLAYERS=sc.nextInt();
        System.out.println("Created "+PLAYERS+" players");
            }
}


