package com.year3.sed.lecture6.tournament;

public class Result {
    private int player1Score;
    private int player2Score;

    Result(int player1Score, int player2Score) {
        this.player1Score = player1Score;
        this.player2Score = player2Score;

    }

    public int getPlayer1Score() {
        return player1Score;
    }

    public int getPlayer2Score() {
        return player2Score;
    }

    public void setPlayer1Score(int player1Score) {
        this.player1Score = player1Score;
    }

    public void setPlayer2Score(int player2Score) {
        this.player2Score = player2Score;
    }
}
