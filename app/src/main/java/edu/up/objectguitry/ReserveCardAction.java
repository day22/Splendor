package edu.up.objectguitry;

public class ReserveCardAction extends SplendorAction {

    private final Card card;
    private final GamePlayer player;

    public ReserveCardAction(GamePlayer player, Card card) {
        super(player);
        this.card = card;
        this.player = player;
    }


    public boolean reserveCard() {
        if (player.hand.canReserve(card)) {
            player.hand.addToReserve(card);
            return true;
        }
    }
}
