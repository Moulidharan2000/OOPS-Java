package com.bridgelabz.deckofcards;

import java.util.LinkedList;

class Player {
    private String name;
    private LinkedList<String[]> cards;

    public Player(String name) {
        this.name = name;
        this.cards = new LinkedList<>();
    }

    public void addCard(String[] card) {
        this.cards.add(card);
    }

    public void sortByRank() {
        String RANKS = " ";
		this.cards.sort((card1, card2) -> RANKS.indexOf(card1[1]) - RANKS.indexOf(card2[1]));
    }

    public void printCards() {
        System.out.println("Player " + this.name + ":");
        for (String[] card : this.cards) {
            System.out.println(card[1] + " of " + card[0]);
        }
    }
}



