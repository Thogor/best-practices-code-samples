package com.realdolmen.samples.angelocarly.streams;

public class Card {

    public enum CardType {
        CLUBS(0),
        HEARTS(1),
        SPADES(2),
        DIAMONDS(3);

        final int index;

        CardType(int index) {
            this.index = index;
        }
    }

    public enum CardValue {
        ONE(0),
        TWO(1),
        THREE(2),
        FOUR(3),
        FIVE(4),
        SIX(5),
        SEVEN(6),
        EIGHT(7),
        NINE(8),
        JACK(9),
        QUEEN(10),
        KING(11);

        final int index;

        CardValue(int index) {
            this.index = index;
        }
    }

    private CardType cardType;
    private CardValue cardValue;

    public Card(CardType cardType, CardValue cardValue) {
        this.cardType = cardType;
        this.cardValue = cardValue;
    }

    public static int compare(Card c1, Card c2) {
        if (c1.cardType.index == c2.cardType.index) {
            return Integer.compare(c1.cardValue.index, c2.cardValue.index);
        } else
        {
            return Integer.compare(c1.cardType.index, c2.cardType.index);
        }
    }

    @Override
    public String toString() {
        return "Card{" + cardValue + ", " + cardType + "}";
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public CardValue getCardValue() {
        return cardValue;
    }

    public void setCardValue(CardValue cardValue) {
        this.cardValue = cardValue;
    }
}
