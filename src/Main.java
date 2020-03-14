import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int version = 1;
        String lb = "- - - - - - - - - - - - - - - - - - - - - - - - - - - ";
        double currentpop =  7.8;
        System.out.println(lb);
        System.out.printf("Welcome to population simulator %d%n", version);
        System.out.println(lb);
        System.out.printf("Select how many years to predict population: ");
        int years = input.nextInt();
        double nextpop = currentpop * Math.pow(1.05, years);
        System.out.printf("In the year '%d', %s: %5.2f billion", (2020 + years), "the population will reach", nextpop);
    }
}