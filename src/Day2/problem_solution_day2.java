package Day2;

import java.util.Scanner;

public class problem_solution_day2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


//Write a program that prints all even numbers from 1 to 100.
        System.out.println("-----PROBLEM 1-----");
        System.out.println("All Even number from 1 to 100");
        for (int i = 1; i <= 100; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();



//Write a program that asks the user to enter a number and then prints all numbers from that number down to 1.
        System.out.println("\n-----PROBLEM 2-----");
//        System.out.println("Enter any number:");
//        int userinput = input.nextInt();
//        for (int i = userinput; i>=1; i--) {
//            System.out.print(i+" ");
//        }

//Write a program that asks the user to enter a positive integer and then prints the sum of all the even numbers from 1 to that integer.
//        System.out.println("\n\n-----PROBLEM 3-----");
//        System.out.print("Enter any positive number: ");
//        int userinput1 = input.nextInt();
//        int range ;
//        int sum = 0;
//        if (userinput1%2==0){
//            range = userinput1-1;
//        }else {
//            range = userinput1;
//        }
//        System.out.println("Printing sum of all odd number from "+userinput1+" to 1");
//        for (int i = 1; i <= range; i++) {
//            if (i%2!=0){
//                sum = sum+i;
//                System.out.print(i+" ");
//            }
//        }
//        System.out.println("\nSum of all odd number : "+sum);

//Write a program that asks the user to enter a positive integer and then prints all the prime numbers up to that integer.
                System.out.println("\n\n-----PROBLEM 4-----");
                System.out.print("Enter any positive number: ");
//                int userinput_for_prime = input.nextInt();
                int primerange = input.nextInt();


                for (int i = 2; i < primerange/2; i++) {

                    if (i%1==0 && i%i==0){
                        System.out.println("Prime number : "+i);
                        }
                }

//Write a program that generates a random number between 1 and 100 and asks the user to guess the number. If the user guesses too high, the program should tell them to guess lower. If the user guesses too low, the program should tell them to guess higher. The program should keep asking the user to guess until they correctly guess the number.
//Write a program that asks the user to enter a string and then prints whether or not the string is a palindrome.
//Write a program that asks the user to enter a positive integer and then prints the factorial of that integer.
//Write a program that asks the user to enter a number and then prints whether or not the number is a perfect square.
//Write a program that asks the user to enter a positive integer and then prints the Fibonacci sequence up to that integer.
//Write a program that asks the user to enter a string and then prints how many vowels are in the string.


    }
}
