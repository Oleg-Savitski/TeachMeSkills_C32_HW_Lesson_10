package com.teachmeskills.lesson_10.model.client;

import com.teachmeskills.lesson_10.model.card.Card;

public class Client {
    private Card[] cards;
    private int cardCount;

    public Client(int maxCards) {
        cards = new Card[maxCards];
        cardCount = 0;
    }

    public void addCard(String cvv, String cardNumber, double balance, String cardHolderName) {
        if (cardCount < cards.length) {
            cards[cardCount] = new Card(cvv, cardNumber, balance, cardHolderName);
            cardCount++;
        } else {
            System.out.println("You can't add more cards.");
        }

    }

    public void countDuplicateCards() {
        if (cardCount == 0) {
            System.out.println("The customer doesn't have any cards.");
            return;
        }

        int duplicates = 0;

        for (int i = 0; i < cardCount; i++) {
            for (int j = i + 1; j < cardCount; j++) {
                if (cards[i].equals(cards[j])) {
                    duplicates++;
                    break;
                }
            }
        }

        if (duplicates > 0) {
            System.out.println("The client has " + duplicates + " identical cards.");
        } else {
            System.out.println("The customer does not have the same cards.");
        }
    }

    public void displayCards() {
        if (cardCount == 0) {
            System.out.println("The customer doesn't have any cards.");
            return;
        }

        System.out.println("Customer's cards: ");
        for (int i = 0; i < cardCount; i++) {
            Card card = cards[i];
            System.out.println("Name of the holder: " + card.getCardHolderName() +
                    ", Card number: " + card.getCardNumber() +
                    ", CVV: " + card.getCvv() +
                    ", Balance: " + card.getBalance());
        }
    }
}