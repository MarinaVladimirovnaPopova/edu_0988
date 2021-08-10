import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Веедите путь к файлу: ");
        String pathFile = scanner.nextLine();

        FileInputStream fin = new FileInputStream(pathFile);

        ArrayList<Integer> nums = new ArrayList<>();

        int i=0;
        String result = "";
        while ((i = fin.read()) != -1) {
            if (i == 13) continue;// возврат каретки, пропускаем
            if (i == 10) {// перенос строки
                String[] NumArray = result.split(" ");//Разделяем
                int n = Integer.parseInt(NumArray[0]);//Сохраняем
                nums.add(n);
                result = "";
            } else {
                result += (char) i;//Сохраняем в строку любые другие смволы прочитанные из файла
            }
        }
        fin.close();

        for(int k = nums.size()-1 ; k > 0 ; k--){  // или использовать метод sort: Collections.sort(nums);
            for(int j = 0 ; j < k ; j++){
                if( nums.get(j) > nums.get(j+1)){
                    int tmp =  nums.get(j);
                    nums.set(j, nums.get(j+1));
                    nums.set(j+1, tmp);
                }
            }
        }
        System.out.println("Итог: ");
        for (int l = 0; l < nums.size(); l++) {

            if (nums.get(l) % 2 == 0) System.out.println(nums.get(l));//Выводим только четные, отсортированные по возрастанию
        }
    }
}
