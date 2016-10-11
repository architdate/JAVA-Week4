import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class MyClass {

    public static void main(String[] args){
        System.out.println("Welcome to the modulus computer");
        userInts();
        System.out.println("Do another pair of values ? (y)");
        Scanner input = new Scanner(System.in);
        String ans = input.next();
        while(ans == "y"){
            if(input.next() == "y"){
                userInts();
                System.out.println("Do another pair of values ? (y)");
                ans = input.next();
            }else break;
        }
    }

    public static void userInts(){
        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter two integer values");
        try{
            int firstNum = user_input.nextInt();
            int secondNum = user_input.nextInt();
            int ans = firstNum % secondNum;
            System.out.println(ans);
        }catch(ArithmeticException e){
            System.out.println("Sorry, cannot compute mod by 0");
        }catch(Exception e){
            System.out.println("Sorry, you must enter two integer values");
        }
    }
}
