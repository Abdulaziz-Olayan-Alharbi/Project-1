import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Project_1_Game {


    public static void two_choices (int num) throws Exception{
        if (num <= 0 || num > 2) {
            throw new Exception("you must choose 1 or 2");
        }
    }
    public static void nine_choices (String num) throws Exception{
        if (Integer.valueOf(num) <= 0 || Integer.valueOf(num) > 9) {
            throw new Exception("you must choose a number between 1 and 9");
        }
    }

    public static String check (String[][] array){
        if (array [0][0].equals(array [1][1]) && array [0][0].equals(array [2][2])){
            return array[0][0];
        }else if (array [0][0].equals(array [0][1]) && array [0][0].equals(array [0][2])){
            return array[0][0];
        } else if (array [1][0].equals(array [1][1]) && array [1][0].equals(array [1][2])) {
            return array[1][0];
        } else if (array [2][0].equals(array [2][1]) && array [2][0].equals(array [2][2])) {
            return array[2][0];
        } else if (array [0][0].equals(array [1][0]) && array [0][0].equals(array [2][0])) {
            return array[0][0];
        } else if (array [0][1].equals(array [1][1]) && array [0][1].equals(array [2][1])) {
            return array[0][1];
        } else if (array [0][2].equals(array [1][2]) && array [0][2].equals(array [2][2])) {
            return array[0][2];
        }else if (array [0][2].equals(array [1][1]) && array [0][2].equals(array [2][0])) {
            return array[0][2];
        }else {
            return "D";
        }
    }
    public static boolean position (String[][] array , String num , String player){
        switch (num){
            case "1":
                if (array[0][0].equals(num)){
                    array[0][0] = player;
                    return true;
                }else {
                    return false;
                }
            case "2" :
                if (array[0][1].equals(num)){
                    array[0][1] = player;
                    return true;
                }else {
                    return false;
                }
            case "3" :
                if (array[0][2].equals(num)){
                    array[0][2] = player;
                    return true;
                }else {
                    return false;
                }
            case "4" :
                if (array[1][0].equals(num)){
                    array[1][0] = player;
                    return true;
                }else {
                    return false;
                }
            case "5" :
                if (array[1][1].equals(num)){
                    array[1][1] = player;
                    return true;
                }else {
                    return false;
                }
            case "6" :
                if (array[1][2].equals(num)){
                    array[1][2] = player;
                    return true;
                }else {
                    return false;
                }
            case "7" :
                if (array[2][0].equals(num)){
                    array[2][0] = player;
                    return true;
                }else {
                    return false;
                }
            case "8" :
                if (array[2][1].equals(num)){
                    array[2][1] = player;
                    return true;
                }else {
                    return false;
                }
            case "9" :
                if (array[2][2].equals(num)){
                    array[2][2] = player;
                    return true;
                }else {
                    return false;
                }
            default:
                return false;
        }

    }
    public static boolean full(String[][] array){
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0 ; j < 3 ; j++){
                if (Character.isDigit(array[i][j].charAt(0))){
                    count++;
                }
            }
        }
        if (count == 0){
            return true;
        }else {
            return false;
        }
    }


    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        Random rand  = new Random();
        try {

            boolean victory = false;
            int round = 0;
            String[][] board = new String[3][3];
            board[0][0] = "1";
            board[0][1] = "2";
            board[0][2] = "3";
            board[1][0] = "4";
            board[1][1] = "5";
            board[1][2] = "6";
            board[2][0] = "7";
            board[2][1] = "8";
            board[2][2] = "9";
            int user_win = 0;
            int computer_win = 0;
            System.out.println("Welcome to tic tac toe Game");
            System.out.println("Enter 1 to play one round");
            System.out.println("Enter 2 to play three rounds");
            int choice = scan.nextInt();
            two_choices(choice);
            if (choice == 1) {
                round = 1;
            } else {
                round = 3;
            }
            System.out.println("You will take X to play with , O for the computer ");
            for (int r = 0; r < round; r++) {
                System.out.println("Round : " + (r + 1));
                do {
                    System.out.println("Board :");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(board[i][j] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println("Enter the position then computer turn : ");
                    String str = scan.next();
                    nine_choices(str);
                    boolean taken = position(board, str, "X");
                    if (taken) {
                        for (int i = 0; i < 3; i++) {
                            for (int j = 0; j < 3; j++) {
                                System.out.print(board[i][j] + " ");
                            }
                            System.out.println();
                        }
                        check(board);
                        if (full(board)) {
                            break;
                        }
                        //System.out.println("computer turn");
                        boolean p_computer_turn = false;
                        String computer_turn = "";
                        do {
                            computer_turn = String.valueOf(rand.ints(1, 10).findFirst().getAsInt());
                            p_computer_turn = position(board, computer_turn, "O");
                        } while (!p_computer_turn);
                        check(board);
                        if (full(board)) {
                            break;
                        }
                        System.out.println("**********************");


                    } else {
                        System.out.println("it not available");
                        continue;
                    }


                } while (check(board).equals("D") || full(board));
                if (check(board).equals("X")) {
                    user_win++;
                } else if (check(board).equals("O")) {
                    computer_win++;
                } else {
                    System.out.println("it is draw");
                }
                board[0][0] = "1";
                board[0][1] = "2";
                board[0][2] = "3";
                board[1][0] = "4";
                board[1][1] = "5";
                board[1][2] = "6";
                board[2][0] = "7";
                board[2][1] = "8";
                board[2][2] = "9";

            }
            if (user_win > computer_win) {
                System.out.println("You won");
            } else if (computer_win > user_win) {
                System.out.println("You lost");
            } else {
                System.out.println("there is not a winner");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }



    }


}
