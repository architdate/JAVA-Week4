import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class MyClass {

    public static void main(String[] args) {
        System.out.println("Welcome to the Appointment Scheduler");
        System.out.println("You can schedule an appointment at 1 or 2 pm.");
        Scanner reader = new Scanner(System.in);
        String appointments[] = new String[3];
        int appointmentsMade = 0;
        appointments[0] = "no 0 pm";

        while(appointmentsMade < 2) {
            Scanner input = new Scanner(System.in);
            System.out.println("What is your name?");
            String name = input.nextLine();

            Scanner time = new Scanner(System.in);
            System.out.println("What time would you like the appointment?");
            double appointmentTime = time.nextDouble();
            if (appointmentTime != 1 && appointmentTime != 2) {
                try{
                    throw new InvalidTimeException();
                }catch(InvalidTimeException e){

                }
            }
            else if (appointments[(int) appointmentTime] != null){
                try{
                    throw new TimeInUseException();
                }catch(TimeInUseException e) {
                }
            }
            else {
                appointments[(int) appointmentTime] = name;
                appointmentsMade++;
            }
        }
        System.out.println("All appointments made");
        System.out.println("At 1 pm: "+appointments[1]);
        System.out.println("At 2 pm: "+appointments[2]);
    }
}

class InvalidTimeException extends Exception{
    public InvalidTimeException(){
        System.out.println("Time value not in range");
        System.out.println("Sorry, that is not a legal time");
    }
}

class TimeInUseException extends Exception{
    public TimeInUseException(){
        System.out.println("Appointment already made at that time");
        System.out.println("Sorry, that time is already in use");
    }
}
