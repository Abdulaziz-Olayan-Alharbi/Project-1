import java.util.ArrayList;
import java.util.Scanner;

public class Project_1_Calculator {




    public static int addition(int num_1 , int num_2){
        return num_1+num_2;
    }
    public  static int subtraction(int num_1 , int num_2){
        return num_1-num_2;
    }
    public static int multiplication(int num_1 , int num_2){
        return num_1*num_2;
    }
    public static int division(int num_1 , int num_2){
        return num_1/num_2;
    }
    public static int modulus (int num_1 , int num_2){
        return num_1%num_2;
    }
    public static int min (int num_1 , int num_2){
        if (num_1 < num_2){
            return num_1;
        }else if (num_2 < num_1){
            return num_2;
        }else {
            return num_1;
        }
    }
    public static int max (int num_1 , int num_2){
        if (num_1 > num_2){
            return num_1;
        }else if (num_2 > num_1){
            return num_2;
        }else {
            return num_1;
        }
    }
    public static int average (int num_1 , int num_2){
        return (num_1+num_2)/2;
    }




    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int last_result = 0 ;
        ArrayList<Integer> results = new ArrayList<>();
        String choice = "y";
        do {
            System.out.println("Enter first number: ");
            int num_1 = scan.nextInt();
            System.out.println("Enter second number: ");
            int num_2 = scan.nextInt();
            System.out.println("Enter 1 to addition the numbers");
            System.out.println("Enter 2 to subtraction the numbers");
            System.out.println("Enter 3 to multiplication the numbers");
            System.out.println("Enter 4 to division the numbers");
            System.out.println("Enter 5 to modulus the numbers");
            System.out.println("Enter 6 to find minimum number");
            System.out.println("Enter 7 to find maximum number");
            System.out.println("Enter 8 to find the average of numbers");
            System.out.println("Enter 9 to print the last result in calculator");
            System.out.println("Enter 10 to print the list of all results in calculator");
            int choice_2 = scan.nextInt();
            switch (choice_2){
                case 1 :
                    System.out.println(addition(num_1,num_2));
                    results.add(addition(num_1,num_2));
                    last_result = addition(num_1,num_2);
                    break;
                case 2 :
                    System.out.println(subtraction(num_1,num_2));
                    results.add(subtraction(num_1,num_2));
                    last_result = subtraction(num_1,num_2);
                    break;
                case 3 :
                    System.out.println(multiplication(num_1,num_2));
                    results.add(multiplication(num_1,num_2));
                    last_result = multiplication(num_1,num_2);
                    break;
                case 4 :
                    System.out.println(division(num_1,num_2));
                    results.add(division(num_1,num_2));
                    last_result = division(num_1,num_2);
                    break;
                case 5 :
                    System.out.println(modulus(num_1,num_2));
                    results.add(modulus(num_1,num_2));
                    last_result = modulus(num_1,num_2);
                    break;
                case 6 :
                    System.out.println(min(num_1,num_2));
                    results.add(min(num_1,num_2));
                    last_result = min(num_1,num_2);
                    break;
                case 7 :
                    System.out.println(max(num_1,num_2));
                    results.add(max(num_1,num_2));
                    last_result = max(num_1,num_2);
                    break;
                case 8 :
                    System.out.println(average(num_1,num_2));
                    results.add(average(num_1,num_2));
                    last_result = average(num_1,num_2);
                    break;
                case 9 :
                    System.out.println(last_result);
                    break;
                case 10 :
                    System.out.println(results);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            System.out.println("Do you want to continue? (y/n)");
            choice = scan.next();

        }while (choice.equals("y"));


    }



}
