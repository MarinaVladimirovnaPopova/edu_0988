Задание: Дан массив с числами. Узнайте сколько элементов с начала массива надо сложить,
чтобы в сумме получилось больше 10-ти.
*/

public class Main {
    public static void main(String[] args) {
        int[] nums = {5, 1, 2, 1, 3, 6, 1, 4};
        int sum = 0, i;
        for ( i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > 10) break;
        }
            System.out.println("ответ: "+(i + 1));
    }
}
