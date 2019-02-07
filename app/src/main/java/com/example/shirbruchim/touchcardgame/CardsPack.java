package com.example.shirbruchim.touchcardgame;
import java.util.ArrayList;
import java.util.Collections;

public class CardsPack {
    ArrayList<Card> cards;

    public CardsPack(){
        cards = new ArrayList<Card>();

        for (int i = 1; i <= 13; i++){
            Card cardSpades = new Card();
            cardSpades.cardType = CardType.Spades;
            cardSpades.number = i;
            cards.add(cardSpades);

            Card cardHearts = new Card();
            cardHearts.cardType = CardType.Hearts;
            cardHearts.number = i;
            cards.add(cardHearts);

            Card cardDiamonds = new Card();
            cardDiamonds.cardType = CardType.Diamonds;
            cardDiamonds.number = i;
            cards.add(cardDiamonds);

            Card cardClubs = new Card();
            cardClubs.cardType = CardType.Clubs;
            cardClubs.number = i;
            cards.add(cardClubs);
        }
    }

    public void Shuffle(){
        Collections.shuffle(cards);
    }

     public Card PickCard(){
        if (cards.size() > 0){
            Shuffle();
            Card crd = cards.get(0);
            cards.remove(0);
            return crd;
        }

        return null;
     }
}
