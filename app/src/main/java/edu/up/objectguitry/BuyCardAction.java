package edu.up.objectguitry;

public class BuyCardAction extends SplendorAction {
    private Card card;
    private GamePlayer player;

    /**
     * Constructor for the splCardAction class
     *
     * @param player - the player making the move
     * @param card
     */
    public BuyCardAction(GamePlayer player, Card card) {
        super(player);
        this.card = card;
        this.player = player;
}

    public boolean buyCard() {
        //pseudocode
        if(player.hasResources(card)) {
            player.hand.addToHand(card);
            return true;
        } else {
            return false;
        }
    }


    }
}
