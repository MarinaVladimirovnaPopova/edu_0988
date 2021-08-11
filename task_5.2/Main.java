import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> lastNames = new ArrayList<>();
        List<String> cities = new ArrayList<>();
        while (true) {
            System.out.println("Введите город проживания: ");
            String city = scanner.nextLine();
            if (city.isEmpty()) {
                break;
            }
            cities.add(city);

            System.out.println("Введите фамилию: ");
            String family = scanner.nextLine();
            if (family.isEmpty()) {
                break;
            }
            lastNames.add(family);

        }

        System.out.println("Введите название города: ");

        String askCity = scanner.nextLine();

        if (cities.contains(askCity)) {
            int index1 = cities.indexOf(askCity);
            System.out.println(lastNames.get(index1));}
            else System.out.println("Такого города нет в списке или вы ввели некорректное название.");

        }
    }

/*=========ВТОРОЙ ВАРИАНТ=========

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Map<String, String> persons = new HashMap<String, String>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите город проживания: ");
            String city = scanner.nextLine();
            if (city.isEmpty()) {
                break;
            }
            System.out.println("Введите фамилию: ");
            String family = scanner.nextLine();
            if (family.isEmpty()) {
                break;
            }
            persons.put(city, family);

        }

            System.out.println("Ввод данных завершен.\nВведите название интересующего города: ");
            String askCity = scanner.nextLine();

            if (persons.get(askCity)!=null) {
                System.out.println(persons.get(askCity));
            }
            else System.out.println("Такого города нет в списке или вы ввели некорректное название.");

        }
    }

*/
