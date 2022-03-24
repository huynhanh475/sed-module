package com.year3.sed.lecture6.tournament;

public class BranchGame extends Game {

    private Game subGame1;
    private Game subGame2;

    BranchGame(String name, Game subGame1, Game subGame2) {
        super();
        this.name = name;
        this.subGame1 = subGame1;
        this.subGame2 = subGame2;

        if (subGame1.winner != null) {
            this.player1 = subGame1.winner;
        }

        if (subGame2.winner != null) {
            this.player2 = subGame2.winner;
        }
    }

    BranchGame(String name, Game subGame1, Game subGame2, Result result) {
        super();
        this.name = name;
        this.subGame1 = subGame1;
        this.subGame2 = subGame2;

        if (subGame1.winner != null) {
            this.player1 = subGame1.winner;
        }

        if (subGame2.winner != null) {
            this.player2 = subGame2.winner;
        }
        //Use setter instead of assigning straight to this.result to get the winner assigned.
        setResult(result);
    }

    @Override
    public void showAllPlayers() {
        //showThisGamePlayers(); //Comment out this to eliminate the duplicated players
        subGame1.showAllPlayers();
        subGame2.showAllPlayers();
    }

    @Override
    public void showAllGames() {
        showThisGame();
        subGame1.showAllGames();
        subGame2.showAllGames();
    }

    @Override
    public void showAllWinners() {
        showThisGameWinner();
        subGame1.showAllWinners();
        subGame2.showAllWinners();
    }

//    public void update() {
//        if (subGame1.winner != null) {
//            this.player1 = subGame1.winner;
//        }
//
//        if (subGame2.winner != null) {
//            this.player2 = subGame2.winner;
//        }
//    }
}
