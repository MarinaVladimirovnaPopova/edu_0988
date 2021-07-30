/*
Задание: Пользователь вводит сумму вклада и процент, который будет начисляться ежегодно.
Отобразить размер вклада поочередно на ближайшие 5 лет.
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print( "веедите размер вклада: " ); //напечатать строку с просьбой суммы
        int sum = scan.nextInt();//пользователь вводит сумму вклада и присвоить ему переменную
        System.out.print( "веедите размер процентов по вкладу: " );//напечатать строку с просьбой указать процент
        int prs = scan.nextInt();//вести процент и присвоить ему переменную
                for (int i = 1; i <= 5; ++i){
                    System.out.print( i + " год = ");
                    System.out.println (sum + sum*prs/100);
                    sum = sum + sum*prs/100;

                }
    }
}
