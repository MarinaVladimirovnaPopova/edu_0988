/*
Задание: Пользователь вводит сумму вклада и процент, который будет начисляться ежегодно.
Отобразить размер вклада поочередно на ближайшие 5 лет.
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print( "веедите размер вклада: " ); 
        int sum = scan.nextInt();
        System.out.print( "веедите размер процентов по вкладу: " );
        int prs = scan.nextInt();
                for (int i = 1; i <= 5; ++i){
                    System.out.print( i + " год = ");
                    System.out.println (sum + sum*prs*0.01);
                    sum = sum + sum*prs/100;

                }
    }
}
