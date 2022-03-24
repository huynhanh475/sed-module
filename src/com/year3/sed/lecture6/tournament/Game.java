package com.year3.sed.lecture6.tournament;

public abstract class Game {
    protected String name;
    protected Player player1;
    protected Player player2;
    protected Result result;
    protected Player winner;

    protected Game() {}

    Game(String name, Player player1, Player player2, Result result){
        this.name = name;
        this.player1 = player1;
        this.player2 = player2;
        this.result = result;
        this.winner = result.getPlayer1Score() > result.getPlayer2Score() ? player1 : player2;
    }

    Game(String name, Player player1, Player player2) {
        this.name = name;
        this.player1 = player1;
        this.player2 = player2;
    }

//    public void display() {
//        System.out.println("Match " + name + ": " + player1.getName() + " " + result.getPlayer1Score() + " : " + result.getPlayer2Score() + " " + player2.getName());
//    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public Result getResult() {
        return result;
    }

    //Players should not be assigned freely
//    public void setPlayer1(Player player1) {
//        this.player1 = player1;
//    }
//
//    public void setPlayer2(Player player2) {
//        this.player2 = player2;
//    }

    public void setResult(Result result) {
        this.result = result;
        this.winner = result.getPlayer1Score() > result.getPlayer2Score() ? player1 : player2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showThisGameWinner() {
        System.out.println(winner.getName());
    }
    public void showThisGame(){
        System.out.println(name);
        System.out.println("\t" + player1.getName() + " - " + result.getPlayer1Score());
        System.out.println("\t" + player2.getName() + " - " + result.getPlayer2Score());
    };

    public void showThisGamePlayers(){
        System.out.println(player1.getName());
        System.out.println(player2.getName());
    };

    public abstract void showAllPlayers();
    public abstract void showAllGames();
    public abstract void showAllWinners();

}
