import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Григорий","Петров", 69, null, null); //дедушка по маминой линии
        Person p2 = new Person("Семён","Иванов", 74, null, null); //дедушка по папиной линии
        Person p3 = new Person("Марфа","Петрова", 70, null, null);//бабушка по маминой линии
        Person p4 = new Person("Агафья","Иванова", 67, null, null);//бабушка по папиной линии
        Person p5 = new Person("Ольга", "Иванова", 45, p3, p1); // мама
        Person p6 = new Person("Алексей","Иванов", 45, p4, p2); //папа
        Person p7 = new Person("Николай","Иванов", 20, p5, p6); //сынок
        p7.info();
    }
}

class Person{ // Описание того, как должен выглядить человек
    String name;
    String lastname;
    int age;
    Person mother;
    Person father; 
    Person(String name, String lastname, int age, Person mother, Person father){
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.mother = mother;
        this.father = father;
    }
    void info(){
        String info = "Привет меня зовут "+this.name+" "+this.lastname+"\n" +
                "Мне "+this.age+" лет \n";

        if(this.mother != null){ // Проверка существования матери
            info += "Мою маму зовут "+this.mother.name+"\n";
            if(this.mother.father != null){ // Проверка существования отца матери (дедушки по маминой линии)
                info += "Дедушку по маминой линии зовут "+this.mother.father.name+"\n";
                if(this.mother.father != null){ // Проверка существования мамы матери (бабушка по маминой линии)
                    info += "Бабушку по маминой линии зовут "+this.mother.mother.name+"\n";
            }
        }
        if(this.father != null){
            info += "Моего папу зовут "+this.father.name;
            if(this.mother.father != null){ // Проверка существования отца папы  (дедушки по папиной линии)
                info += "Дедушку по папиной линии зовут "+this.father.father.name+"\n";
                if(this.mother.father != null){ // Проверка существования мамы отца (бабушка по папиной линии)
                    info += "Бабушку по папиной линии зовут "+this.father.mother.name+"\n";
        }
        System.out.println(info);
    }
    void sayHi(String name){
        System.out.println("Привет "+name);
    }
}

