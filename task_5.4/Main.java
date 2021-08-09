import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Веедите путь к файлу: ");
        String pathFile = scanner.nextLine();

    /*FileReader reader = new FileReader("pathFile");
    int c;
        while ((c = reader.read())!=-1){
        System.out.print((char)c);*/

        FileInputStream fin = new FileInputStream(pathFile);

        ArrayList<Character> nums = new ArrayList<>();
        ArrayList<Character> nums2 = new ArrayList<>();
        int  i = -1;
        while ((i = fin.read()) != -1) {
            char j = (char)i;
            System.out.print(j); // верно выводит
            nums.add(j);
        }
        System.out.print(nums); //запятые выводит (
    }
}
