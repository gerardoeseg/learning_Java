import java.util.Scanner;

public class Main {

    public static double salaryCalculator(double hoursPerWeek, double moneyPerHour, int vacationDays){
        if (hoursPerWeek < 0){
            return -1;
        }
        if (moneyPerHour < 0){
            return -1;
        }

        double earnings = hoursPerWeek * moneyPerHour;
        double unpaidTime = vacationDays * moneyPerHour * 8; // One day has one hour
        return ((earnings/7)*365) - unpaidTime;
    }

    public static void main(String[] args) {

        System.out.println("Hours per week:");
        Scanner input = new Scanner(System.in);
        double hours = input.nextDouble();

        System.out.println("Money per hour:");
        double money = input.nextDouble();

        System.out.println("Vacation days:");
        int days = input.nextInt();

        double salary = salaryCalculator(hours, money, days);

        System.out.println(salary);
    }
}