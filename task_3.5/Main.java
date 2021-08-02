/*
3.5
Задание: Дан массив с числами.
Выведите последовательно его элементы используя рекурсию и не используя цикл.
*/


public class Main {
    public static void main(String[] args) {
        int num[] = {4,2,6,2,65};

        nums(num,0);
    }
    public static void nums(int[] arr, int i) {
        if (i < arr.length) {
            System.out.println(arr[i]);
            nums(arr, i+1);
        }
    }
}
