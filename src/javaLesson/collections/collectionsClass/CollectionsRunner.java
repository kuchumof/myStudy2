package javaLesson.collections.collectionsClass;

import java.util.*;

public class CollectionsRunner {
    public static void main(String[] args) {

        /**������� ������ ����**/
        List<Card> deckOfCards = new ArrayList<>();
        for (Card.Face face : Card.Face.values()) {
            for (Card.Suit suit : Card.Suit.values()) {
                deckOfCards.add(new Card(suit, face));
            }
        }

         /**������� ������ ���� � 4-� ��������**/

        /*System.out.println("Original deck of cards\n");
        printOutput(deckOfCards);

        Collections.shuffle(deckOfCards);
        System.out.println("\n\nCards after shuffle\n");
        printOutput(deckOfCards);

        Collections.sort(deckOfCards, new CardComparator());
        System.out.println("\n\nCards after sorting\n");
        printOutput(deckOfCards);

        /**����� �� �����**/
        Collections.sort(deckOfCards);

        Card card = new Card(Card.Suit.SPADES, Card.Face.Queen);
        int i = Collections.binarySearch(deckOfCards,card);
        if (i>0) {
            System.out.println("Card was found at position "+i);
        } else {
            System.out.println("Card was not found");
        }




        List <Card> cardList = new ArrayList<>(deckOfCards);
        Collections.fill(cardList,card);
        Collections.addAll(cardList, card, card,card);
        Collections.copy(cardList,deckOfCards);
        int frequency = Collections.frequency(cardList, card);
        System.out.println("Frequency of "+card+" is "+frequency);

        System.out.println("Min : "+Collections.min(cardList));
        System.out.println("Max : "+Collections.max(cardList));
        System.out.println(cardList);

    }

    private static void printOutput(List<Card> deckOfCards) {
        for (int i = 0; i < deckOfCards.size(); i++) {
            System.out.printf("%-20s %s", deckOfCards.get(i), (i + 1) % 4 == 0 ? "\n" : "   ");
        }
    }

}