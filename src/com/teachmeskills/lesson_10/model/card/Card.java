package com.teachmeskills.lesson_10.model.card;


import java.util.Objects;

public class Card {
    private final String cvv;
    private final String cardNumber;
    private final double balance;
    private final String cardHolderName;

    public Card(String cvv, String cardNumber, double balance, String cardHolderName) {
        this.cvv = cvv;
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.cardHolderName = cardHolderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCvv() {
        return cvv;
    }

    public double getBalance() {
        return balance;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;

        Card card = (Card) o;
        return Objects.equals(cvv, card.cvv) &&
                Objects.equals(cardNumber, card.cardNumber) &&
                Objects.equals(cardHolderName, card.cardHolderName);
    }
}