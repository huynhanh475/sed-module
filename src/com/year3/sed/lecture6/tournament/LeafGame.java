package com.year3.sed.lecture6.tournament;

public class LeafGame extends Game{
    LeafGame(String name, Player player1, Player player2, Result result){
        super(name, player1, player2, result);
    }

    LeafGame(String name, Player player1, Player player2){
        super(name, player1, player2);
    }

    @Override
    public void showAllPlayers() {
        showThisGamePlayers();
    }

    @Override
    public void showAllGames() {
        showThisGame();
    }

    @Override
    public void showAllWinners() {
        showThisGameWinner();
    }
}
