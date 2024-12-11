import java.util.Random;
import java.util.Scanner;

//add to gitHub
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int playerScore = 0;
        int comScore = 0;
        boolean isPlaying = true;
        String response;
        System.out.println();
        System.out.println("\t\t\tWelcome to Rock, Paper, Scissors Game using JAVA \n\n\t\t\t\t\t\tPress \"Enter\" to start!");
        scanner.nextLine();

        while (isPlaying) {
            String playerPick = "";
            String comPick = "";
            boolean isValid = false;

            while(!isValid){
                System.out.print("Please pick ROCK, PAPER, or SCISSORS: ");
                playerPick = scanner.nextLine().toUpperCase().trim();

                if (playerPick.equals("ROCK") || playerPick.equals("PAPER") || playerPick.equals("SCISSORS")){
                    isValid = true;
                }
            }
            int comp = random.nextInt(1,4);
            System.out.println();

            switch (comp){
                case 1:
                    comPick = "ROCK";
                    if (playerPick.equals("ROCK")){
                        System.out.println("It's a tie");
                    }
                    else if (playerPick.equals("PAPER")) {
                        System.out.println("Player wins");
                        playerScore++;
                    }
                    else {
                        System.out.println("Computer wins");
                        comScore++;
                    }
                    break;
                case 2:
                    comPick = "PAPER";
                    if (playerPick.equals("ROCK")){
                        System.out.println("Computer wins");
                        comScore++;
                    }
                    else if (playerPick.equals("PAPER")) {
                        System.out.println("It's a tie");
                    }
                    else {
                        System.out.println("Player wins");
                        playerScore++;
                    }
                    break;
                case 3:
                    comPick = "SCISSORS";
                    if (playerPick.equals("ROCK")){
                        System.out.println("Player wins");
                        playerScore++;
                    }
                    else if (playerPick.equals("PAPER")) {
                        System.out.println("Computer wins");
                        comScore++;
                    }
                    else {
                        System.out.println("It's a tie");
                    }
                    break;
            }
            System.out.println();
            System.out.println("Score");
            System.out.println("  " + playerScore + "\t\tPlayer: " + playerPick + "\n  " + comScore + "\t\tComputer: " + comPick);
            System.out.println();
            do{
                System.out.println("Do you want to play again? Y/N");
                response = scanner.nextLine().toUpperCase().trim();

                if (!response.equals("Y")){
                    isPlaying = false;
                }
            }while (response.isEmpty());
        }
        System.out.println("Thanks for playing!");
    }
}