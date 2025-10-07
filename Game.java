import java.util.Scanner;
import java.io.Console;
import java.util.Random;

class play {
    public void GamePlay() {
        Scanner scan = new Scanner(System.in);
        System.out.println("WELCOME TO ROCK PAPER SCISSORS GAME");
        System.out.println("______________________________________");

        while (true) {
            // Choose the type of game
            System.out.println("Press S for User vs Computer");
            System.out.println("Press U for User1 vs User2");
            System.out.println("Press Q to Quit the game");
            System.out.println();
            System.out.print("Enter your choice: ");
            String choice1 = scan.next().toUpperCase();
            System.out.println("_____________________________________");

            // USER VS SYSTEM(COMPUTER)
            if (choice1.equals("S")) {
                uservscom();
            }
            // USER VS USER
            else if (choice1.equals("U")) {
                uservsuser();
            }

            // If 'Q' is selected then the game quiets
            else if (choice1.equals("Q")) {
                System.out.println("______________Game Over______________");
                System.out.println();
                break;
            }

            // Except 'S','s','U','u','Q' and 'q', choosing other char will display invalid
            else {
                System.out.println("Invalid choice!!");
            }

        }
    }

    public void uservsuser(){

        Scanner scan = new Scanner(System.in);
        Console console = System.console();

        // Name of the players are taken as input.
        String[] player = new String[2];
        for(int i = 0; i<2; i++){
            System.out.print("Enter player" + (i+1) + " name: ");
            player[i] = scan.nextLine().toUpperCase();
        }
        System.out.println("player 1: " + player[0]);
        System.out.println("player 2: " + player[1]);
        System.out.println();
        
        int user1score = 0;
        int user2score = 0;

        while (true) {
            System.out.println("Press 1 for Rock");
            System.out.println("Press 2 for Paper");
            System.out.println("Press 3 for Scissors");
            System.out.println("Press 0 to exit");
            System.out.println("_______________________");
            System.out.println();

            System.out.println(player[0] + "Score: "+ user1score + "  " + player[1] + "Score: " + user2score);
            System.out.println("________________________________");
            
            
            char[] input1 = console.readPassword("Enter your choice: ");
            String inputstring1 = new String(input1);
            char[] input2 = console.readPassword("Enter your choice: ");
            String inputstring2 = new String(input2);

            int user1choice = 0;
            int user2choice = 0;
            
            try{
                user1choice = Integer.parseInt(inputstring1);
                user2choice = Integer.parseInt(inputstring2);
                if(user1choice>=1 && user1choice<=3 || user2choice >= 1 && user2choice <= 3){
                    if(user1choice == 1){
                        if(user2choice == 1){
                            System.out.println("It's a tie");
                            System.out.println("______________");
                            System.out.println(player[0] + "Score: "+ user1score + "  " + player[1] + "Score: " + user2score);
                            System.out.println();
                        }
                        else if(user2choice == 2){
                            System.out.println(player[1] + " wins");
                            System.out.println("______________");
                            user2score++;
                            System.out.println(player[0] + "Score: "+ user1score + "  " + player[1] + "Score: " + user2score);
                            System.out.println();
                        }
                        else if(user2choice == 3){
                            System.out.println(player[0] + "wins");
                            System.out.println("______________");
                            user1score++;
                            System.out.println(player[0] + "Score: "+ user1score + "  " + player[1] + "Score: " + user2score);
                            System.out.println();
                        }
                        else if(user2choice == 0){
                            System.out.println("<<<<<<<<<< Game over >>>>>>>>>>");
                            System.out.println(player[0] + "Score: "+ user1score + "  " + player[1] + "Score: " + user2score);
                            System.out.println("__________________________________________________________");
                            break;
                        }
                        else{
                            System.out.println("!!!Invalid input!!!\n.......... Try again ..........");
                            System.out.println();
                        }
                    }
                    else if(user1choice == 2){
                        if(user2choice == 2){
                            System.out.println("It's a tie");
                            System.out.println("______________");
                            System.out.println(player[0] + "Score: "+ user1score + "  " + player[1] + "Score: " + user2score);
                            System.out.println();
                        }
                        else if(user2choice == 3){
                            System.out.println(player[1] + " wins");
                            System.out.println("______________");
                            user2score++;
                            System.out.println(player[0] + "Score: "+ user1score + "  " + player[1] + "Score: " + user2score);
                            System.out.println();
                        }
                        else if(user2choice == 1){
                            System.out.println(player[0] + "wins");
                            System.out.println("______________");
                            user1score++;
                            System.out.println(player[0] + "Score: "+ user1score + "  " + player[1] + "Score: " + user2score);
                            System.out.println();
                        }
                        else if(user2choice == 0){
                            System.out.println("<<<<<<<<<< Game over >>>>>>>>>>");
                            System.out.println(player[0] + "Score: "+ user1score + "  " + player[1] + "Score: " + user2score);
                            System.out.println("_________________________________________________");
                            break;
                        }
                        else{
                            System.out.println("!!!Invalid input!!!\n.......... Try again ..........");
                            System.out.println();
                        }
                    }
                    else if(user1choice == 3){
                        if(user2choice == 3){
                            System.out.println("It's a tie");
                            System.out.println("______________");
                            System.out.println(player[0] + "Score: "+ user1score + "  " + player[1] + "Score: " + user2score);
                            System.out.println();
                        }
                        else if(user2choice == 1){
                            System.out.println(player[1] + " wins");
                            System.out.println("______________");
                            user2score++;
                            System.out.println(player[0] + "Score: "+ user1score + "  " + player[1] + "Score: " + user2score);
                            System.out.println();
                        }
                        else if(user2choice == 2){
                            System.out.println(player[0] + "wins");
                            System.out.println("______________");
                            user1score++;
                            System.out.println(player[0] + "Score: "+ user1score + "  " + player[1] + "Score: " + user2score);
                            System.out.println();
                        }
                        else if(user2choice == 0){
                            System.out.println("<<<<<<<<<< Game over >>>>>>>>>>");
                            System.out.println(player[0] + "Score: "+ user1score + "  " + player[1] + "Score: " + user2score);
                            System.out.println("____________________________________________________");
                            break;
                        }
                        else{
                            System.out.println("!!!Invalid input!!!\n.......... Try again ..........");
                        }
                    }
                }
                else if(user1choice == 0){
                    System.out.println("<<<<<<<<<<Game over>>>>>>>>>>");
                    System.out.println(player[0] + "Score: "+ user1score + "  " + player[1] + "Score: " + user2score);
                    System.out.println("_______________________________________________________");
                    System.out.println();
                    break;
                }
                else{
                    System.out.println("Invalid input!.............Try again");
                    System.out.println();
                }
            }catch(Exception ex){
                System.out.println("<<<<<Invalid input>>>>>");
            }
        
        }    
    }


    // User vs User Method
    public void uservscom() {
        int userscore = 0;
        int comscore = 0;
        Scanner scan = new Scanner(System.in);
        while (true) {
            Random random = new Random();
            System.out.println("Press 1 for Rock");
            System.out.println("Press 2 for Paper");
            System.out.println("Press 3 for Scissors");
            System.out.println("Press 0 to exit");
            System.out.println("_____________________");
            System.out.println();

            System.out.print("User's turn: ");
            char userchoice = scan.next().charAt(0);
            System.out.println();

            // computr chooses any number between 1 to 3 randomly without 0
            int comchoice = random.nextInt(3);
            System.out.println();

            if (userchoice == '0') {
                System.out.println("Thanks for playing");
                System.out.println();
                break;
            } else if (comchoice == 0) {
                if (userchoice == '1') {
                    System.out.println("It's tie");
                    System.out.println("Your score:" + userscore + "  " + "Computer score:" + comscore);
                    System.out.println();
                } else if (userchoice == '2') {
                    System.out.println("You win");
                    userscore++;
                    System.out.println("Your score:" + userscore + "  " + "Computer score:" + comscore);
                    System.out.println();
                } else if (userchoice == '3') {
                    System.out.println("Computer win");
                    comscore++;
                    System.out.println("Your score:" + userscore + "  " + "Computer score:" + comscore);
                    System.out.println();
                } else {
                    System.out.println("Invalid input");
                    System.out.println();
                }
            } else if (comchoice == 1) {
                if (userchoice == '1') {
                    System.out.println("Computer win");
                    comscore++;
                    System.out.println("Your score:" + userscore + "  " + "Computer score:" + comscore);
                    System.out.println();
                } else if (userchoice == '2') {
                    System.out.println("It's tie");
                    System.out.println("Your score:" + userscore + "  " + "Computer score:" + comscore);
                    System.out.println();
                } else if (userchoice == '3') {
                    System.out.println(" You win");
                    userscore++;
                    System.out.println("Your score:" + userscore + "  " + "Computer score:" + comscore);
                    System.out.println();
                } else {
                    System.out.println("Invalid input");
                    System.out.println();
                }
            } else if (comchoice == 2) {
                if (userchoice == '1') {
                    System.out.println("You win");
                    userscore++;
                    System.out.println("Your score:" + userscore + "  " + "Computer score:" + comscore);
                    System.out.println();
                } else if (userchoice == '2') {
                    System.out.println("Computer win");
                    comscore++;
                    System.out.println("Your score:" + userscore + "  " + "Computer score:" + comscore);
                    System.out.println();
                } else if (userchoice == '3') {
                    System.out.println(" It's tie");
                    System.out.println("Your score:" + userscore + "  " + "Computer score:" + comscore);
                    System.out.println();
                } else {
                    System.out.println("Invalid input");
                    System.out.println();
                }
            } else if (userchoice >= 4) {
                System.out.println("Invalid choice");
                System.out.println();
            } else {
                System.out.println("Invalid choice!!!! try again");
                System.out.println();
            }
        }
    }
}

public class Game {

    public static void main(String[] args) {
        play pl = new play();
        pl.GamePlay();
    }
}


