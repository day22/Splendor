package edu.up.objectguitry;

import java.util.ArrayList;


public class SplendorGameState {

    //~~~~~~~~~~~~~ player names and IDs ~~~~~~~~~~~ //
    //player display names
    //TODO figure out how to get the player names from super class.
    private String player1Name;
    private String player2Name;
    private String player3Name;
    private String player4Name;

    //holds turn value corresponding to player ID below
    private int playerTurn;

    //player values for playerTurn
    private final int PLAYER1ID = 1;
    private final int PLAYER2ID = 2;
    private final int PLAYER3ID = 3;
    private final int PLAYER4ID = 4;


    //~~~~~~~~~~~~~~~~ player 1 ~~~~~~~~~~~~~~~~~~ //
    //player 1 prestigePts
    private int p1PrestigePts;

    //player 1 resource point values
    private int p1GoldPts;
    private int p1EmeraldPts;
    private int p1SapphirePts;
    private int p1RubyPts;
    private int p1DiamondPts;
    private int p1OnyxPts;

    //player 1 coin values
    private int p1GoldCoins;
    private int p1EmeraldCoins;
    private int p1SapphireCoins;
    private int p1RubyCoins;
    private int p1DiamondCoins;
    private int p1OnyxCoins;

    //reserve cards count
    private int p1NumCardsReserved;
    private ArrayList<Card> p1ReserveCards;

//~~~~~~~~~~~~~~~~ player 2 ~~~~~~~~~~~~~~~~~~ //

    //player 2 prestigePts
    private int p2PrestigePts;

    //player 2 resource point values
    private int p2GoldPts;
    private int p2EmeraldPts;
    private int p2SapphirePts;
    private int p2RubyPts;
    private int p2DiamondPts;
    private int p2OnyxPts;

    //player 2 coin values
    private int p2GoldCoins;
    private int p2EmeraldCoins;
    private int p2SapphireCoins;
    private int p2RubyCoins;
    private int p2DiamondCoins;
    private int p2OnyxCoins;

    //reserve card count
    private int p2NumCardsReserved;
    private ArrayList<Card> p2ReserveCards;


//~~~~~~~~~~~~~~~~ player 3 ~~~~~~~~~~~~~~~~~~ //

    //player 3 prestigePts
    private int p3PrestigePts;

    //player 3 resource point values
    private int p3GoldPts;
    private int p3EmeraldPts;
    private int p3SapphirePts;
    private int p3RubyPts;
    private int p3DiamondPts;
    private int p3OnyxPts;

    //player 3 coin values
    private int p3GoldCoins;
    private int p3EmeraldCoins;
    private int p3SapphireCoins;
    private int p3RubyCoins;
    private int p3DiamondCoins;
    private int p3OnyxCoins;

    //reserve card count
    private int p3NumCardsReserved;
    private ArrayList<Card> p3ReserveCards;


//~~~~~~~~~~~~~~~~ player 4 ~~~~~~~~~~~~~~~~~~ //

    //player 4 prestigePts
    private int p4PrestigePts;

    //player 4 resource point values
    private int p4GoldPts;
    private int p4EmeraldPts;
    private int p4SapphirePts;
    private int p4RubyPts;
    private int p4DiamondPts;
    private int p4OnyxPts;

    //player 4 coin values
    private int p4GoldCoins;
    private int p4EmeraldCoins;
    private int p4SapphireCoins;
    private int p4RubyCoins;
    private int p4DiamondCoins;
    private int p4OnyxCoins;

    //reserve card count
    private int p4NumCardsReserved;
    private ArrayList<Card> p4ReserveCards;

//~~~~~~~~~~~~~~~~~~ Deck Information ~~~~~~~~~~~~~~~ //

    private ArrayList<Card> rank1Stack; //ArrayList of rank1 cards
    private ArrayList<Card> rank2Stack; //ArrayList of rank2 cards
    private ArrayList<Card> rank3Stack; //ArrayList of rank3 cards

    private Noble noble1;
    private Noble noble2;
    private Noble noble3;
    private Noble noble4;

    /*
     *New Game Constructor
     * TODO
     *  -figure out  file reading for initializing deck array lists
     *  -possibly add noble/card visibility boolean instance variables
     */
//~~~~~~~~~~~~~~~~~~ Hand Informtion ~~~~~~~~~~~~~ //

    //all players' hands
    private Hand p1Hand;
    private Hand p2Hand;
    private Hand p3Hand;
    private Hand p4Hand;

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//

    public SplendorGameState() {
        initializePlayerPointValues();
        initializeDecks(); //unfinished
    }

    /*
     *
     * Deep copy constructor
     * TODO add nobles and card visibility
     */
    public SplendorGameState(SplendorGameState stateToCopy) {

        //creates deeps copy of each players hands
        this.p1Hand = new Hand(stateToCopy.p1Hand);
        this.p2Hand = new Hand(stateToCopy.p2Hand);
        this.p3Hand = new Hand(stateToCopy.p3Hand);
        this.p4Hand = new Hand(stateToCopy.p4Hand);

        //deep copy of player 1 points and reserve cards
        this.p1GoldCoins = stateToCopy.getP1GoldCoins();
        this.p1GoldPts = stateToCopy.getP1GoldPts();
        this.p1EmeraldCoins = stateToCopy.getP1EmeraldCoins();
        this.p1EmeraldPts = stateToCopy.getP1EmeraldPts();
        this.p1SapphireCoins = stateToCopy.getP1SapphireCoins();
        this.p1SapphirePts = stateToCopy.getP1SapphirePts();
        this.p1RubyCoins = stateToCopy.getP1RubyCoins();
        this.p1RubyPts = stateToCopy.getP1RubyPts();
        this.p1OnyxCoins = stateToCopy.getP1OnyxCoins();
        this.p1OnyxPts = stateToCopy.getP1OnyxPts();
        this.p1DiamondCoins = stateToCopy.getP1DiamondCoins();
        this.p1PrestigePts = stateToCopy.getP1OnyxPts();
        this.p1NumCardsReserved = stateToCopy.getP1NumCardsReserved();
        this.p1ReserveCards = new ArrayList<Card>();
        for (Card card : stateToCopy.p1ReserveCards) {
            this.p1ReserveCards.add(new Card(card)); //uses copy constructor in card
        }

        //deep copy of player 2 points and reserve cards
        this.p2GoldCoins = stateToCopy.getP2GoldCoins();
        this.p2GoldPts = stateToCopy.getP2GoldPts();
        this.p2EmeraldCoins = stateToCopy.getP2EmeraldCoins();
        this.p2EmeraldPts = stateToCopy.getP2EmeraldPts();
        this.p2SapphireCoins = stateToCopy.getP2SapphireCoins();
        this.p2SapphirePts = stateToCopy.getP2SapphirePts();
        this.p2RubyCoins = stateToCopy.getP2RubyCoins();
        this.p2RubyPts = stateToCopy.getP2RubyPts();
        this.p2OnyxCoins = stateToCopy.getP2OnyxCoins();
        this.p2OnyxPts = stateToCopy.getP2OnyxPts();
        this.p2DiamondCoins = stateToCopy.getP2DiamondCoins();
        this.p2PrestigePts = stateToCopy.getP2OnyxPts();
        this.p2NumCardsReserved = stateToCopy.getP2NumCardsReserved();
        this.p2ReserveCards = new ArrayList<Card>();
        for (Card card : stateToCopy.p2ReserveCards) {
            this.p2ReserveCards.add(new Card(card)); //uses copy constructor in card
        }

        //deep copy of player 3 points and reserve cards
        this.p3GoldCoins = stateToCopy.getP3GoldCoins();
        this.p3GoldPts = stateToCopy.getP3GoldPts();
        this.p3EmeraldCoins = stateToCopy.getP3EmeraldCoins();
        this.p3EmeraldPts = stateToCopy.getP3EmeraldPts();
        this.p3SapphireCoins = stateToCopy.getP3SapphireCoins();
        this.p3SapphirePts = stateToCopy.getP3SapphirePts();
        this.p3RubyCoins = stateToCopy.getP3RubyCoins();
        this.p3RubyPts = stateToCopy.getP3RubyPts();
        this.p3OnyxCoins = stateToCopy.getP3OnyxCoins();
        this.p3OnyxPts = stateToCopy.getP3OnyxPts();
        this.p3DiamondCoins = stateToCopy.getP3DiamondCoins();
        this.p3PrestigePts = stateToCopy.getP3OnyxPts();
        this.p3NumCardsReserved = stateToCopy.getP3NumCardsReserved();
        this.p3ReserveCards = new ArrayList<Card>();
        for (Card card : stateToCopy.p3ReserveCards) {
            this.p3ReserveCards.add(new Card(card)); //uses copy constructor in card
        }

        //deep copy of player 4 points and reserve cards
        this.p4GoldCoins = stateToCopy.getP4GoldCoins();
        this.p4GoldPts = stateToCopy.getP4GoldPts();
        this.p4EmeraldCoins = stateToCopy.getP4EmeraldCoins();
        this.p4EmeraldPts = stateToCopy.getP4EmeraldPts();
        this.p4SapphireCoins = stateToCopy.getP4SapphireCoins();
        this.p4SapphirePts = stateToCopy.getP4SapphirePts();
        this.p4RubyCoins = stateToCopy.getP4RubyCoins();
        this.p4RubyPts = stateToCopy.getP4RubyPts();
        this.p4OnyxCoins = stateToCopy.getP4OnyxCoins();
        this.p4OnyxPts = stateToCopy.getP4OnyxPts();
        this.p4DiamondCoins = stateToCopy.getP4DiamondCoins();
        this.p4PrestigePts = stateToCopy.getP4OnyxPts();
        this.p4NumCardsReserved = stateToCopy.getP4NumCardsReserved();
        this.p4ReserveCards = new ArrayList<Card>();
        for (Card card : stateToCopy.p4ReserveCards) {
            this.p4ReserveCards.add(new Card(card)); //uses copy constructor in card
        }

        //deep copies for all 3 card stacks
        this.rank1Stack = new ArrayList<>();
        for (Card rankCard : stateToCopy.rank1Stack) {
            this.rank1Stack.add(new Card(rankCard)); //uses copy constructor in card
        }

        this.rank2Stack = new ArrayList<>();
        for (Card rankCard : stateToCopy.rank2Stack) {
            this.rank2Stack.add(new Card(rankCard)); //uses copy constructor in card
        }

        this.rank3Stack = new ArrayList<>();
        for (Card rankCard : stateToCopy.rank3Stack) {
            this.rank3Stack.add(new Card(rankCard)); //uses copy constructor in card
        }

        //TODO make noble class and copy constructor
        initializeDecks();
        initializeHands();
    }

    //helper method for constructor setting all point values for player to zero
    public void initializePlayerPointValues() {
        //player one
        this.p1GoldCoins = 0;
        this.p1GoldPts = 0;
        this.p1EmeraldCoins = 0;
        this.p1EmeraldPts = 0;
        this.p1SapphireCoins = 0;
        this.p1SapphirePts = 0;
        this.p1RubyCoins = 0;
        this.p1RubyPts = 0;
        this.p1OnyxCoins = 0;
        this.p1OnyxPts = 0;
        this.p1DiamondCoins = 0;
        this.p1PrestigePts = 0;
        this.p1NumCardsReserved = 0;
        this.p1ReserveCards = new ArrayList<Card>();

        this.p2GoldCoins = 0;
        this.p2GoldPts = 0;
        this.p2EmeraldCoins = 0;
        this.p2EmeraldPts = 0;
        this.p2SapphireCoins = 0;
        this.p2SapphirePts = 0;
        this.p2RubyCoins = 0;
        this.p2RubyPts = 0;
        this.p2OnyxCoins = 0;
        this.p2OnyxPts = 0;
        this.p2DiamondCoins = 0;
        this.p2PrestigePts = 0;
        this.p2NumCardsReserved = 0;
        this.p2ReserveCards = new ArrayList<Card>();

        this.p3GoldCoins = 0;
        this.p3GoldPts = 0;
        this.p3EmeraldCoins = 0;
        this.p3EmeraldPts = 0;
        this.p3SapphireCoins = 0;
        this.p3SapphirePts = 0;
        this.p3RubyCoins = 0;
        this.p3RubyPts = 0;
        this.p3OnyxCoins = 0;
        this.p3OnyxPts = 0;
        this.p3DiamondCoins = 0;
        this.p3PrestigePts = 0;
        this.p3NumCardsReserved = 0;
        this.p3ReserveCards = new ArrayList<Card>();

        this.p4GoldCoins = 0;
        this.p4GoldPts = 0;
        this.p4EmeraldCoins = 0;
        this.p4EmeraldPts = 0;
        this.p4SapphireCoins = 0;
        this.p4SapphirePts = 0;
        this.p4RubyCoins = 0;
        this.p4RubyPts = 0;
        this.p4OnyxCoins = 0;
        this.p4OnyxPts = 0;
        this.p4DiamondCoins = 0;
        this.p4PrestigePts = 0;
        this.p4NumCardsReserved = 0;
        this.p4ReserveCards = new ArrayList<Card>();
    }

    //TODO file reading from three rank text files
    /*initialize Decks
     * reads input from text files into three array lists then shuffles deck
     *
     */
    public void initializeDecks() {
        this.rank1Stack = new ArrayList<Card>();
        this.rank2Stack = new ArrayList<Card>();
        this.rank3Stack = new ArrayList<Card>();
    }

    public void initializeHands() {
        this.p1Hand = new Hand();
        this.p2Hand = new Hand();
        this.p3Hand = new Hand();
        this.p4Hand = new Hand();
    }

    public String getPlayer1Name() {
        return player1Name;
    }

    public String getPlayer2Name() {
        return player2Name;
    }

    public String getPlayer3Name() {
        return player3Name;
    }

    public String getPlayer4Name() {
        return player4Name;
    }

    public int getPlayerTurn() {
        return playerTurn;
    }

    public int getPLAYER1ID() {
        return PLAYER1ID;
    }

    public int getPLAYER2ID() {
        return PLAYER2ID;
    }

    public int getPLAYER3ID() {
        return PLAYER3ID;
    }

    public int getPLAYER4ID() {
        return PLAYER4ID;
    }

    public int getP1PrestigePts() {
        return p1PrestigePts;
    }

    public int getP1GoldPts() {
        return p1GoldPts;
    }

    public int getP1EmeraldPts() {
        return p1EmeraldPts;
    }

    public int getP1SapphirePts() {
        return p1SapphirePts;
    }

    public int getP1RubyPts() {
        return p1RubyPts;
    }

    public int getP1DiamondPts() {
        return p1DiamondPts;
    }

    public int getP1OnyxPts() {
        return p1OnyxPts;
    }

    public int getP1GoldCoins() {
        return p1GoldCoins;
    }

    public int getP1EmeraldCoins() {
        return p1EmeraldCoins;
    }

    public int getP1SapphireCoins() {
        return p1SapphireCoins;
    }

    public int getP1RubyCoins() {
        return p1RubyCoins;
    }

    public int getP1DiamondCoins() {
        return p1DiamondCoins;
    }

    public int getP1OnyxCoins() {
        return p1OnyxCoins;
    }

    public int getP1NumCardsReserved() {
        return p1NumCardsReserved;
    }

    public ArrayList<Card> getP1ReserveCards() {
        return p1ReserveCards;
    }

    public int getP2PrestigePts() {
        return p2PrestigePts;
    }

    public int getP2GoldPts() {
        return p2GoldPts;
    }

    public int getP2EmeraldPts() {
        return p2EmeraldPts;
    }

    public int getP2SapphirePts() {
        return p2SapphirePts;
    }

    public int getP2RubyPts() {
        return p2RubyPts;
    }

    public int getP2DiamondPts() {
        return p2DiamondPts;
    }

    public int getP2OnyxPts() {
        return p2OnyxPts;
    }

    public int getP2GoldCoins() {
        return p2GoldCoins;
    }

    public int getP2EmeraldCoins() {
        return p2EmeraldCoins;
    }

    public int getP2SapphireCoins() {
        return p2SapphireCoins;
    }

    public int getP2RubyCoins() {
        return p2RubyCoins;
    }

    public int getP2DiamondCoins() {
        return p2DiamondCoins;
    }

    public int getP2OnyxCoins() {
        return p2OnyxCoins;
    }

    public int getP2NumCardsReserved() {
        return p2NumCardsReserved;
    }

    public ArrayList<Card> getP2ReserveCards() {
        return p2ReserveCards;
    }

    public int getP3PrestigePts() {
        return p3PrestigePts;
    }

    public int getP3GoldPts() {
        return p3GoldPts;
    }

    public int getP3EmeraldPts() {
        return p3EmeraldPts;
    }

    public int getP3SapphirePts() {
        return p3SapphirePts;
    }

    public int getP3RubyPts() {
        return p3RubyPts;
    }

    public int getP3DiamondPts() {
        return p3DiamondPts;
    }

    public int getP3OnyxPts() {
        return p3OnyxPts;
    }

    public int getP3GoldCoins() {
        return p3GoldCoins;
    }

    public int getP3EmeraldCoins() {
        return p3EmeraldCoins;
    }

    public int getP3SapphireCoins() {
        return p3SapphireCoins;
    }

    public int getP3RubyCoins() {
        return p3RubyCoins;
    }

    public int getP3DiamondCoins() {
        return p3DiamondCoins;
    }

    public int getP3OnyxCoins() {
        return p3OnyxCoins;
    }

    public int getP3NumCardsReserved() {
        return p3NumCardsReserved;
    }

    public ArrayList<Card> getP3ReserveCards() {
        return p3ReserveCards;
    }

    public int getP4PrestigePts() {
        return p4PrestigePts;
    }

    public int getP4GoldPts() {
        return p4GoldPts;
    }

    public int getP4EmeraldPts() {
        return p4EmeraldPts;
    }

    public int getP4SapphirePts() {
        return p4SapphirePts;
    }

    public int getP4RubyPts() {
        return p4RubyPts;
    }

    public int getP4DiamondPts() {
        return p4DiamondPts;
    }

    public int getP4OnyxPts() {
        return p4OnyxPts;
    }

    public int getP4GoldCoins() {
        return p4GoldCoins;
    }

    public int getP4EmeraldCoins() {
        return p4EmeraldCoins;
    }

    public int getP4SapphireCoins() {
        return p4SapphireCoins;
    }

    public int getP4RubyCoins() {
        return p4RubyCoins;
    }

    public int getP4DiamondCoins() {
        return p4DiamondCoins;
    }

    public int getP4OnyxCoins() {
        return p4OnyxCoins;
    }

    public int getP4NumCardsReserved() {
        return p4NumCardsReserved;
    }

    public ArrayList<Card> getP4ReserveCards() {
        return p4ReserveCards;
    }

    public ArrayList<Card> getRank1Stack() {
        return rank1Stack;
    }

    public ArrayList<Card> getRank2Stack() {
        return rank2Stack;
    }

    public ArrayList<Card> getRank3Stack() {
        return rank3Stack;
    }

    public Noble getNoble1() {
        return noble1;
    }

    public Noble getNoble2() {
        return noble2;
    }

    public Noble getNoble3() {
        return noble3;
    }

    public Noble getNoble4() {
        return noble4;
    }
}