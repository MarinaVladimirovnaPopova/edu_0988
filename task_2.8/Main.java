/*
Задание: Дан массив с элементами [2, 3, 4, 5].
С помощью цикла for найдите произведение элементов этого массива.
*/

public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5};
        int prod = nums[0];
        for (int i = 1; i<nums.length; i++){
            prod*=nums[i] ;
        }
        System.out.println(prod);
    }
}
