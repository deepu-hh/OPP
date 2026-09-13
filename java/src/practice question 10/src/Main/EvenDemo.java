package main;
import java.util.Scanner;
import evenpackage.Even;
public class EvenDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        if(Even.checkEven(n))
            System.out.println(n + " is even.");
        else
            System.out.println(n + " is not even.");
    }
}