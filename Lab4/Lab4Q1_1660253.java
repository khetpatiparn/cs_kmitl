import java.util.Scanner;

public class Lab4Q1_1660253 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Fahrenheit temperature is: ");
        double fahrenheit = sc.nextDouble();
        double celsius = ((fahrenheit - 32) / 9) * 5;
        System.out.println("Celsius temperature is: " + celsius);
        sc.close();
    }
}