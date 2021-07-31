/*
Задание: Дан массив с числами. Проверьте, есть ли в нем два одинаковых числа подряд.
Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 8, 7, 5, 3, 6, 1, 4};
        String ans = "нет";
        for (int i = 1; i < nums.length; i++) {
                if  (nums[i]==nums[i-1])
                    ans= "да";
        }
                 System.out.println(ans);
    }
}
