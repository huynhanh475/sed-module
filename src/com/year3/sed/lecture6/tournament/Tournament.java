package com.year3.sed.lecture6.tournament;

public class Tournament {
    public static void main(String[] args) {
        Player player1 = new Player("P1");
        Player player2 = new Player("P2");
        Player player3 = new Player("P3");
        Player player4 = new Player("P4");
        Player player5 = new Player("P5");
        Player player6 = new Player("P6");
        Player player7 = new Player("P7");
        Player player8 = new Player("P8");

        LeafGame quarterFinal1 = new LeafGame("Quarter Final 1", player1, player2, new Result(2,4));
        LeafGame quarterFinal2 = new LeafGame("Quarter Final 2", player3, player4, new Result(1,3));
        LeafGame quarterFinal3 = new LeafGame("Quarter Final 3", player5, player6, new Result(0,5));
        LeafGame quarterFinal4 = new LeafGame("Quarter Final 4", player7, player8, new Result(6,2));

        BranchGame semiFinal1 = new BranchGame("Semi Final 1", quarterFinal1, quarterFinal2, new Result(0,1));
        BranchGame semiFinal2 = new BranchGame("Semi Final 1", quarterFinal3, quarterFinal4, new Result(2,0));

        BranchGame finalGame = new BranchGame("Final Game", semiFinal1, semiFinal2, new Result(3,2));

        System.out.println("All gmaes: ");
        finalGame.showAllGames();

        System.out.println("-------------------");

        System.out.println("All players: ");
        finalGame.showAllPlayers();

        System.out.println("-------------------");

        System.out.println("All winners: ");
        finalGame.showAllWinners();

        System.out.println("-------------------");
    }
}
