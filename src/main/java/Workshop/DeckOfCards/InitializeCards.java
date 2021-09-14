package Workshop.DeckOfCards;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class InitializeCards {

    public static String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
    public static String[] rank = {"-02", "-03", "-04", "-05", "-06", "-07", "-08", "-09", "-10", "-Jack", "-Queen", "-King", "-Ace"};
    public static int CARDS = 9;
    public static int PLAYERS;
    public static int CLUB_COUNT = 0, DIAMOND_COUNT = 0, HEARTS_COUNT = 0, SPADES_COUNT = 0;
    public static int[] Cardcount;
    public static ArrayList cards = new ArrayList();
    public static ArrayList<String> array = new ArrayList<String>();
    public static int[] numbers = new int[53];
    public static int count = 0;
    public static int[] countcardtype = new int[4];
    public static Scanner sc = new Scanner(System.in);

    public static void cardsdistribution() {

        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                String s1 = suit[i];
                String s2 = rank[j];
                cards.add(s1.concat(s2));

            }
        }
    }


    public static void createplayers() {
        System.out.println("\nEnter how many player you need:");
        PLAYERS = sc.nextInt();
        do {
            System.out.println("\n You can add 2 to 4 players only");
            PLAYERS = sc.nextInt();
        } while (PLAYERS == 0 || PLAYERS > 4);
        System.out.println("Created " + PLAYERS + " players");
    }

    public static void distributecard() {
        shufflecards();
        for (int i = 0; i < PLAYERS; i++) {
            int n = i + 1;
            switch (n) {
                case 1: {
                    LinkedList linkedlist1 = new LinkedList();
                    Random random = new Random();
                    int card = CARDS;
                    while (card > 0) {
                        int randomcard = random.nextInt(52);
                        if (!(numbers[randomcard] == 0)) {
                            linkedlist1.push((String) cards.get(randomcard));
                            numbers[randomcard] = 0;
                            card = card - 1;
                            count++;
                        }
                    }
                    checkcards();
                    linkedlist1.cardtypecount();
                    linkedlist1.sort();
                    System.out.println("\n\n The 1st Player's card :");
                    linkedlist1.print();
                    printcardtype();
                    break;
                }
                case 2: {
                    LinkedList linkedlist2 = new LinkedList();
                    Random random = new Random();
                    int card = CARDS;
                    while (card > 0) {
                        int randomcard = random.nextInt(52);
                        if (!(numbers[randomcard] == 0)) {
                            linkedlist2.push((String) cards.get(randomcard));
                            numbers[randomcard] = 0;
                            card = card - 1;
                            count++;
                        }
                    }
                    checkcards();
                    linkedlist2.cardtypecount();
                    linkedlist2.sort();
                    System.out.println("\n\n The 2st Player's card :");
                    linkedlist2.print();
                    printcardtype();
                    break;
                }
                case 3: {
                    LinkedList linkedlist3 = new LinkedList();
                    Random random = new Random();
                    int card = CARDS;
                    while (card > 0) {
                        int randomcard = random.nextInt(52);
                        if (!(numbers[randomcard] == 0)) {
                            linkedlist3.push((String) cards.get(randomcard));
                            numbers[randomcard] = 0;
                            card = card - 1;
                            count++;
                        }
                    }
                    checkcards();
                    linkedlist3.cardtypecount();
                    linkedlist3.sort();
                    System.out.println("\n\n The 3rd Player's card :");
                    linkedlist3.print();
                    printcardtype();
                    break;
                }
                case 4: {
                    LinkedList linkedlist4 = new LinkedList();
                    Random random = new Random();
                    int card = CARDS;
                    while (card > 0) {
                        int randomcard = random.nextInt(52);
                        if (!(numbers[randomcard] == 0)) {
                            linkedlist4.push((String) cards.get(randomcard));
                            numbers[randomcard] = 0;
                            card = card - 1;
                            count++;
                        }
                    }
                    checkcards();
                    linkedlist4.sort();
                    System.out.println("\n\n The 4rd Player's card :");
                    linkedlist4.print();
                    linkedlist4.cardtypecount();
                    printcardtype();
                    break;
                }
            }
        }
    }

    private static void printcardtype() {
        countcardtype[0] = CLUB_COUNT;
        countcardtype[1] = DIAMOND_COUNT;
        countcardtype[2] = HEARTS_COUNT;
        countcardtype[3] = SPADES_COUNT;
        System.out.println("\n");
        for (int i = 0; i < 4; i++) {
            System.out.println(suit[i] + ": " + countcardtype[i]);
        }
        CLUB_COUNT = 0;
        DIAMOND_COUNT = 0;
        HEARTS_COUNT = 0;
        SPADES_COUNT = 0;
    }

    private static void checkcards() {
        if (count == 9) {
            System.out.println("\n\n 9 cards received by player");
            count = 0;
        } else
            System.out.println("\n player doesn't receive 9 cards");
    }

    public static void shufflecards() {

        for (int i = 0; i < 52; i++) {
            numbers[i] = i + 1;
        }
    }


}


