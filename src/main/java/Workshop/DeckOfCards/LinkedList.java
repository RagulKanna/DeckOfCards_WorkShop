package Workshop.DeckOfCards;


public class LinkedList {
    Node head;
    Node tail;

    public Node push(String data) {
        Node newnode = new Node(data);

        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            Node tempNode = head;
            this.head = newnode;
            newnode.next = tempNode;
        }
        return newnode;
    }

    public void print() {
        if (head == null) {
            System.out.println("Linked list is Empty");
            return;
        } else {
            Node tempNode = head;
            System.out.println("\n player's card in list:");
            while (tempNode != null) {
                if (tempNode.next != null) {
                    System.out.print(tempNode.data + "->");
                    tempNode = tempNode.next;
                } else {
                    System.out.print(tempNode.data);
                    tempNode = tempNode.next;
                }
            }
        }

    }

    public void cardtypecount() {

        String card, checkcard;
        for (int i = 0; i < 13; i++) {
            card = (String) InitializeCards.cards.get(i);
            Node temp = head;
            for (int j = 0; j < 9; j++) {
                checkcard = temp.data;
                if (checkcard.equals(card)) {
                    InitializeCards.CLUB_COUNT = InitializeCards.CLUB_COUNT + 1;
                }
                temp = temp.next;
            }
        }
        for (int i = 13; i < 26; i++) {
            card = (String) InitializeCards.cards.get(i);
            Node temp = head;
            for (int j = 0; j < 9; j++) {
                checkcard = temp.data;
                if (checkcard.equals(card)) {
                    InitializeCards.DIAMOND_COUNT = InitializeCards.DIAMOND_COUNT + 1;
                }
                temp = temp.next;
            }
        }
        for (int i = 26; i < 39; i++) {
            card = (String) InitializeCards.cards.get(i);
            Node temp = head;
            for (int j = 0; j < 9; j++) {
                checkcard = temp.data;
                if (checkcard.equals(card)) {
                    InitializeCards.HEARTS_COUNT = InitializeCards.HEARTS_COUNT + 1;
                }
                temp = temp.next;
            }
        }
        for (int i = 39; i < 51; i++) {
            card = (String) InitializeCards.cards.get(i);
            Node temp = head;
            for (int j = 0; j < 9; j++) {
                checkcard = temp.data;
                if (checkcard.equals(card)) {
                    InitializeCards.SPADES_COUNT = InitializeCards.SPADES_COUNT + 1;
                }
                temp = temp.next;
            }
        }
    }

    public void sort() {
        Node first = head, second = null;
        while (first != null) {
            second = first.next;
            while (second != null) {
                if (first.data.compareTo(second.data) > 0) {
                    String temp = first.data;
                    first.data = second.data;
                    second.data = temp;
                }
                second = second.next;
            }
            first = first.next;
        }
        Node tempf = head, temps = null;
        temps = tempf.next;
        while (temps != null) {
            if ((tempf.data.equals("Clubs-Ace") && (temps.data.equals("Clubs-King") || temps.data.equals("Clubs-Queen") || temps.data.equals("Clubs-Jack")))) {
                String temp = tempf.data;
                tempf.data = temps.data;
                temps.data = temp;
                temps = temps.next;
                tempf = tempf.next;
            } else if (tempf.data.equals("Clubs-King") && temps.data.equals("Clubs-Queen")) {
                String temp = tempf.data;
                tempf.data = temps.data;
                temps.data = temp;
                temps = temps.next;
                tempf = tempf.next;
            } else {
                temps = temps.next;
                tempf = tempf.next;
            }
        }
        tempf = head;
        temps = null;
        temps = tempf.next;
        while (temps != null) {
            if ((tempf.data.equals("Diamonds-Ace") && (temps.data.equals("Diamonds-King") || temps.data.equals("Diamonds-Queen") || temps.data.equals("Diamonds-Jack")))) {
                String temp = tempf.data;
                tempf.data = temps.data;
                temps.data = temp;
                temps = temps.next;
                tempf = tempf.next;
            } else if (tempf.data.equals("Diamonds-King") && temps.data.equals("Diamonds-Queen")) {
                String temp = tempf.data;
                tempf.data = temps.data;
                temps.data = temp;
                temps = temps.next;
                tempf = tempf.next;
            } else {
                temps = temps.next;
                tempf = tempf.next;
            }
        }
        tempf = head;
        temps = null;
        temps = tempf.next;
        while (temps != null) {
            if ((tempf.data.equals("Hearts-Ace") && (temps.data.equals("Hearts-King") || temps.data.equals("Hearts-Queen") || temps.data.equals("Hearts-Jack")))) {
                String temp = tempf.data;
                tempf.data = temps.data;
                temps.data = temp;
                temps = temps.next;
                tempf = tempf.next;
            } else if (tempf.data.equals("Hearts-King") && temps.data.equals("Hearts-Queen")) {
                String temp = tempf.data;
                tempf.data = temps.data;
                temps.data = temp;
                temps = temps.next;
                tempf = tempf.next;
            } else {
                temps = temps.next;
                tempf = tempf.next;
            }
        }
        tempf = head;
        temps = null;
        temps = tempf.next;
        while (temps != null) {
            if ((tempf.data.equals("Spades-Ace") && (temps.data.equals("Spades-King") || temps.data.equals("Spades-Queen") || temps.data.equals("Spades-Jack")))) {

                String temp = tempf.data;
                tempf.data = temps.data;
                temps.data = temp;
                temps = temps.next;
                tempf = tempf.next;
            } else if (tempf.data.equals("Spades-King") && temps.data.equals("Spades-Queen")) {
                String temp = tempf.data;
                tempf.data = temps.data;
                temps.data = temp;
                temps = temps.next;
                tempf = tempf.next;
            } else {
                temps = temps.next;
                tempf = tempf.next;
            }
        }
    }
}