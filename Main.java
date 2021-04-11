/*
Author: Axan7
Date Created: March 23, 2021
Purpose: To make a game which is easy and fun to play.
*/

import java.util.Random;
import java.util.Scanner;

class Game{
    private int guess, usergs, actnum;

    Game(){
        Random r = new Random();
        actnum = r.nextInt(101);
        guess = 0;
        usergs = 0;
    }

    int getGuesses(){
        return guess;
    }

    void setGuesses(int guess){
        this.guess = guess;
    }

    void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your guess here (Enter 101 to quit and 102 for help): ");
        try{usergs = sc.nextInt();} catch(Exception e){System.out.println("Invalid value entered"); System.exit(0);}
    }

    boolean checkInput(){
        if(usergs >=0 && usergs <=102)
            return true;
        else
            return false;
    }

    int isCorrectNumber(){        
        if(checkInput() && (usergs == actnum))
            return 1;
        else if(checkInput())
            return 0;
        else
            return -1;
    }

    void showMessage(){
        while(usergs != 101){
            setGuesses(getGuesses() + 1);

            if(usergs == 102){
                System.out.println("\nGuess The Number game is a game where you guess a number which the computer generates at random. You win if you guessed the number correctly.");
                System.out.println("If you enter a value higher than the guessed the number then the computer will tell you to lower your guess and if you enter a lower value");
                System.out.println("the computer will ask you to increase your guessed number. The less number of guesses you take to find the original number the better it is.");
                System.out.println("\n Hope this information is valuable for someone reading this");
                break;
            }

            if(isCorrectNumber() == 1){
                System.out.println("\nYou guessed it correct!");
                System.out.println("Number of guesses taken: " + getGuesses());
                break;
            }
            else if(isCorrectNumber() == 0){
                if(usergs > actnum){
                    System.out.println("\nYou entered too high! Lower the number\n");
                    takeUserInput();
                }
                else{
                    System.out.println("\nYou entered too low! Higher the number\n");
                    takeUserInput();
                }
            }
            else{
                System.out.println("\nYou have gone out of range!\n");
                takeUserInput();
            }
        }
    }
}

class Main{
    public static void main(String[] args) {
        Game gtn = new Game();
        System.out.println("Guess a number between 0 to 100");
        gtn.takeUserInput();
        gtn.showMessage();
    }
}