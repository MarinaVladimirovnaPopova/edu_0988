/*Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 4 ...
2 4 6 8 ...
3 6 9 12 ...
4 8 12 16 ...
... */

public class Main {
    public static void main(String[] args){
        for(int i = 1; i <= 10; i++){
            for(int k = 1; k <= 10; k++){
                System.out.print(k * i + "  "); // вывод без перевода строки
            }
            System.out.println(); // вывод с переводом строки значений после очередной итерации
        }
    }
}
