package com.realdolmen.samples.angelocarly.streams;

import java.util.*;
import java.util.stream.Collectors;

public class CardDeck {

    public static void main(String[] args) {
        CardDeck deck = new CardDeck();
        deck.randomize();
        deck.sortDeck();
        deck.printCards();
    }

    private List<Card> cards;

    public CardDeck() {
        this.cards = generateFullDeck();
    }

    private List<Card> generateFullDeck() {
        return Arrays.stream(Card.CardType.values())
                .map(cardType ->
                        Arrays.stream(Card.CardValue.values())
                                .map(cardValue -> new Card(cardType, cardValue))
                                .collect(Collectors.toList())
                ).flatMap(Collection::stream).collect(Collectors.toList());
    }

    public void sortDeck() {
        cards.sort(Card::compare);
    }

    public void randomize() {
        Collections.shuffle(cards);
    }

    public void printCards() {
        this.cards.forEach(System.out::println);
    }

}
