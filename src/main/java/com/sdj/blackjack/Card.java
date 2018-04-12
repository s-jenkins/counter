package com.sdj.blackjack;

public class Card
{
    public final Rank rank;
    public final Suit suit;

    public enum Suit
    {
        CLUB('♣'), DIAMONDS('♦'), HEARTS('♥'), SPADES('♠');
        public char out;
        private Suit(char out)
        {
            this.out = out;
        }
    };
    public enum Rank
    {
        ACE(1, 'A'),
        TWO(2, '2'),
        THREE(3, '3'),
        FOUR(4, '4'),
        FIVE(5, '5'),
        SIX(6, '6'),
        SEVEN(7, '7'),
        EIGHT(8, '8'),
        NINE(9, '9'),
        TEN(10, 'T'),
        JACK(10, 'J'),
        QUEEN(10, 'Q'),
        KING(10, 'A');

        public int val;
        public char out;

        private Rank(int val, char out)
        {
            this.out = out;
            this.val = val;
        }
    };

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String toString() {
        return "" + rank.out + suit.out;
    }
}
