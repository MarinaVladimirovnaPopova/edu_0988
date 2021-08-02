/*3.4
Задание: Сделайте функцию, которая параметрами принимает 2 числа.
Если их сумма больше 10 - пусть функция вернет true, а если нет - false.
*/


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print ("введите значение  a: " );
        int a = scanner.nextInt();
        System.out.print ("введите значение  b: " );
        int b = scanner.nextInt();
        System.out.println (com(a, b));
    }
    static boolean com(int a, int b){
        if ((a+b)>10) return true;
        else return false;
    }
}
