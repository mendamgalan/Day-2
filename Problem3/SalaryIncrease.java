package Problem3;

import java.io.IOException;
import java.util.Scanner;

public class SalaryIncrease {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        float salary = scan.nextFloat();
        int percent = 0;
        float moneyEarned;
        float newSalary;

        if (salary >= 0 && salary <= 400.00) {
            percent = 15;
        } else if (salary <= 800.00) {
            percent = 12;
        } else if (salary <= 1200.00) {
            percent = 10;
        } else if (salary <= 2000.00) {
            percent = 7;
        } else {
            percent = 4;
        }

        moneyEarned = salary * percent / 100;
        newSalary = salary + moneyEarned;

        System.out.printf("Novo salario: %.2f\n", newSalary);
        System.out.printf("Reajuste ganho: %.2f\n", moneyEarned);
        System.out.printf("Em percentual: %d %%\n", percent);

        scan.close();
    }
}
