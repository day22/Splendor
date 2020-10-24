package edu.up.objectguitry;

public class SplendorLocalGame extends LocalGame{
    protected void sendUpdatedStateTo(GamePlayer player){}
    protected boolean canMove(int playerIdx) {return true;}
    protected String checkIfGameOver() {return "";}
    protected boolean makeMove(SplendorAction action) {return true;}
}
