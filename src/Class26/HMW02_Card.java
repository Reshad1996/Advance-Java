package Class26;

import java.util.LinkedList;

public abstract class HMW02_Card {


         /* Create a Card class that will have implemented  and unimplemented methods and a constructor
            that will initializes credit card type.  Create 3 subclasses of a Card card.
            Create 3 objects of different card and store them into LinkedList.
             Using for loop/advanced for loop/ iterator access all methods of the class.
         */

    String cardType;

    public HMW02_Card(String cardType) {
        this.cardType = cardType;
    }

    public void display() {
        System.out.println("You can withdraw money through you ATM card ");
    }
    public abstract void print();
}

class DebitCard extends HMW02_Card {

    public DebitCard(String cardType) {
        super(cardType);
    }

    @Override
    public void display() {
        System.out.println(cardType+" is useful to withdraw money internationally");
    }

    @Override
    public void print() {
        System.out.println("With "+cardType+" we can do online shopping ");
    }
}

class CreditCard extends HMW02_Card {

    public CreditCard(String cardType) {
        super(cardType);
    }

    @Override
    public void display() {
        System.out.println(cardType+" can be valuable tools for earning rewards");
    }

    @Override
    public void print() {
        System.out.println("With "+cardType+" we Borrow money at a better interest rate.  ");
    }
}

class PlatinumCard extends HMW02_Card {

    public PlatinumCard(String cardType) {
        super(cardType);
    }

    @Override
    public void display() {
        System.out.println(" The minimum credit score should be 700 or above to get a "+cardType);
    }

    @Override
    public void print() {
        System.out.println("With "+cardType+" we Borrow money at a better interest rate.");
    }

    public static void main(String[] args) {

        DebitCard debit = new DebitCard("Debit Card");
        CreditCard credit = new CreditCard("Credit Card");
        PlatinumCard platinum = new PlatinumCard("Platinum Card");

        LinkedList<HMW02_Card> cards = new LinkedList<>();
        cards.add(debit);
        cards.add(credit);
        cards.add(platinum);

        for (var card:cards) {
            card.display();
            card.print();
        }
    }
}

