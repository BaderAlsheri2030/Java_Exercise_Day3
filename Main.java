import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Exercise 1
        System.out.println("Enter user role");
       String userRole = input.nextLine();
        if(userRole.equalsIgnoreCase("admin")){
            System.out.println("Welcome admin");
        } else if (userRole.equalsIgnoreCase("Superuser")) {
            System.out.println("Welcome Superuser");
        } else if (userRole.equalsIgnoreCase("user")) {
            System.out.println("Welcome user");
        }
        else{
            System.out.println("Access denied");
        }



        //Exercise 2
        System.out.println("Enter the first number");
        int num0 = input.nextInt();
        System.out.println("Enter the second number");
        int num1 = input.nextInt();
        System.out.println("Enter the third number");
        int num2 = input.nextInt();

        if(num0 > num1 && num0>num2){
            System.out.println("The greatest "+num0);
        }
        else if(num1 > num0 && num1>num2){
            System.out.println("The greatest "+num1);

        } else if (num2 >num0 && num2 >num1) {
            System.out.println("The greatest "+num2);

        }
        else {
            System.out.println("Error");
        }



        Random randomNumber = new Random();

        //Exercise 3
        System.out.println("Week days");
        int rand = randomNumber.nextInt(7);
        if(rand == 0) rand += 1;
        switch (rand){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("");
        }



        //Exercise 4
          System.out.println("Enter your numeric score");
          int grade = input.nextInt();

           if(grade >= 90 && grade <=100){
               System.out.println("Numeric Score: "+grade);
               System.out.println("Letter grade: A");

          } else if (grade >=80 && grade <=89) {
               System.out.println("Numeric Score: "+grade);
               System.out.println("Letter grade: B");
               
           } else if (grade >= 70 && grade <=79) {
               System.out.println("Numeric Score: "+grade);
               System.out.println("Letter grade: C");
           } else if (grade >= 60 && grade <=69) {
               System.out.println("Numeric Score: "+grade);
               System.out.println("Letter grade: D");

           }
           else if(grade >= 0 && grade <=59) {
               System.out.println("Numeric Score: " + grade);
               System.out.println("Letter grade: F");

           }
           else System.out.println("Numeric score must be between 0-100");



           //Exercise 5

        System.out.println("Enter your age");
        int age = input.nextInt();

        if(age < 13){
            System.out.println("you're a child");
        } else if (age >= 13 && age <=19) {
            System.out.println("you're a Teenager");
        }
        else System.out.println("You're an adult");


    }
}