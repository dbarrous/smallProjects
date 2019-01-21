/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /*
Written by : Damian Barrous-Dume
Student ID S0297708
 */
package BettingProgram;

import java.util.Scanner;

/**
 *
 * @author Damian's PC
 */
public class BettingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int cap = 1000;

        String name;
        int score;
        int count = 0;
   
        Player[] team = new Player[cap];
    
        System.out.printf("1.If you would like to add a player Type 1%n2.If you would like to place a bet Type 2%n3.If you would like to cash someone out Type 3%n4.If you would like to exit the program Type 4%n");
        int key = input.nextInt();
        while (key != 4) {

            switch (key) {

                case 1:
                    System.out.println("Enter the name of the player");
                    name = input.next();
                    System.out.println("Enter the Starting cash of the player");
                    score = input.nextInt();
                    Player g = new Player(name, score);
                    team[count] = g;
                    count++;
                    for (int i = 0; i < team.length; i++) {
                        if (team[i] == null) {
                            System.out.print("");
                        } else {
                            System.out.println("index " + i + ": " + team[i]);
                        }
                    }
                    System.out.printf("1.If you would like to add a player Type 1%n2.If you would like to place a bet Type 2%n3.If you would like to cash someone out Type 3%n4.If you would like to exit the program Type 4%n");
                    key = input.nextInt();
                    break;
                case 2:
                    if (team[1] == null) {
                        System.out.println("~Add atleast one more player!~");
                    } else {
                        System.out.println("Enter Entrance Wager: ");
                        int bet = input.nextInt();
                        System.out.println("Enter First Player index(Team 1) Participating:");
                        int p = input.nextInt();
                        System.out.println("Enter Second Player index(Team 2) Participating:");
                        int p2 = input.nextInt();
                        if (p == p2) {
                            System.out.println("~You've entered the same index silly, Try Again!~");

                        } else {
                            System.out.println("Which Team Would Won? Enter 1 or 2");
                            int t = input.nextInt();
                            if (t == 1) {
                                Player temp = team[p];
                                Player temp1 = team[p2];
                                temp.addCash(bet);
                                temp1.subCash(bet);

                                team[p] = temp;
                                team[p2] = temp1;
                            } else if (t == 2) {
                                Player temp = team[p2];
                                Player temp1 = team[p];

                                temp.addCash(bet);
                                temp1.subCash(bet);

                                team[p2] = temp;
                                team[p] = temp1;
                            } else {
                                System.out.println("~Entered Invalid Option, Try Again!~");
                            }
                            System.out.println();
                        }
                    }
                    for (int i = 0; i < team.length; i++) {
                        if (team[i] == null) {
                            System.out.print("");
                        } else {
                            System.out.println("index " + i + ": " + team[i]);
                        }
                    }
                    System.out.printf("1.If you would like to add a player Type 1%n2.If you would like to place a bet Type 2%n3.If you would like to cash someone out Type 3%n4.If you would like to exit the program Type 4%n");
                    key = input.nextInt();
                    break;

                case 3:
                    System.out.println("Type in the index of the person you wish to cash out: ");
                    int c = input.nextInt();
                    if (team[c] == null) {
                        System.out.println("~You've entered a wrong index, Try Again!~");
                    } else {
                        Player temp3 = team[c];
                        team[c] = null;

                        if (temp3.getCash() >= 0) {
                            System.out.println("~You owe " + temp3.getName() + " $" + temp3.getCash() + "~");
                        } else {
                            System.out.println("~" + temp3.getName() + " owes you " + temp3.getCash() + "~");
                        }
                    }
                    for (int i = 0; i < team.length; i++) {
                        if (team[i] == null) {
                            System.out.print("");
                        } else {
                            System.out.println("index " + i + ": " + team[i]);
                        }
                    }
                    System.out.printf("1.If you would like to add a player Type 1%n2.If you would like to place a bet Type 2%n3.If you would like to cash someone out Type 3%n4.If you would like to exit the program Type 4%n");
                    key = input.nextInt();
                    break;
                    
                default:
                key = 4;
            }
        }
    }

}
