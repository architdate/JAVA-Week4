import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class MyClass {

    public static void main(String[] args) throws Throwable{

        try{
            method1();
            System.out.println("Statement 1");
        }catch(NullPointerException ex){
            System.out.println(ex);
        }
        System.out.println("Statement 2");
    }

    public static void method1() throws Exception{
        try{
            method2();
            System.out.println("Statement 3");
        }catch(Exception e){

        }
        System.out.println("Statement 4");
    }

    public static void method2() throws Exception {
        try{
            method3();
            System.out.println("Statement 5");
        }catch(Exception e){
            System.out.println(e);
            throw new Exception(e);
        }
        System.out.println("Statement 6");
    }
    public static void method3() throws Exception{
        throw new IllegalArgumentException("Info from method 2");
    }
}
