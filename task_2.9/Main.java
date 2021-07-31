/*
Задание: Дан массив с числами.
Проверьте, что в этом массиве есть число 5.
Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {
        int[] nums = {2,8,5,3,6,43,4};
        String ans = "нет";
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==5){
                ans = "да";
            }
        }
        System.out.println(ans);

    }
}
