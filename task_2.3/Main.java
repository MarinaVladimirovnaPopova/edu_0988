/*
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример вывода на экран:
8
88
888
8888
88888
888888
8888888
88888888
888888888
8888888888
*/


public class Main {
    public static void main(String[] args){
        String i = "8"; // 8 как строка
        for (int j = 0; j < 10; j++){
            System.out.println(i);
            i = i + 8; // не складываются, т.к. i - строка и 8 авт.тоже 
        }
    }
}
