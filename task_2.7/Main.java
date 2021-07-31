/*
Задание: Дано число, например 31.
Проверьте, что это число не делится ни на одно другое число кроме себя самого и единицы.
То есть в нашем случае нужно проверить, что число 31 не делится на все числа от 2 до 30.
Если число не делится - выведите 'false', а если делится - выведите 'true'.
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scanner.nextInt();
        String answer = "false";
            for (int i = 2; i < n; i++) {
                if (n%i == 0){
                    answer = "true"; // answer меняется только при выполнении условия ==0
            }
        }
        System.out.println(answer);
    }
}
