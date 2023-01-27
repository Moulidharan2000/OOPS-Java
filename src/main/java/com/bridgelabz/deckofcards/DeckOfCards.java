package com.bridgelabz.deckofcards;

import java.util.LinkedList;
import java.util.Random;

public class DeckOfCards {
   
	public static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
    public static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    
    public static void main(String[] args) {
    	String[][] deck = new String[SUITS.length * RANKS.length][2];
    	int index = 0;
    	for (String suit : SUITS) {
    		for (String rank : RANKS) {
    			deck[index][0] = suit;
    			deck[index][1] = rank;
    			index++;
    		}
    	}
    	Random rand = new Random();
    	for (int i = 0; i < deck.length; i++) {
    		int randomIndex = rand.nextInt(deck.length);
    		String[] temp = deck[i];
    		deck[i] = deck[randomIndex];
    		deck[randomIndex] = temp;
    	}

    	LinkedList<Player> players = new LinkedList<>();
    	players.add(new Player("1"));
    	players.add(new Player("2"));
    	players.add(new Player("3"));
    	players.add(new Player("4"));

    	for (int i = 0; i < 9; i++) {
    		for (Player player : players) {
    			player.addCard(deck[i]);
    			i++;
    		}
    	}

    	for (Player player : players) {
    		player.sortByRank();
    	}
    	
    	for (Player player : players) {
    		player.printCards();
    		System.out.println();
    	}
    }
}

