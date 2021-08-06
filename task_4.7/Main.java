/*
Реализуй в классе Fox интерфейс Animal.
Учти, что создавать дополнительные классы и удалять методы нельзя!
Требования:
•	Интерфейс Animal должен быть реализован в классе Fox.
•	В интерфейсе Animal нужно объявить метод getColor.
•	Дополнительные классы или интерфейсы создавать нельзя.
*/
/*import java.awt.Color;*/

import java.awt.*;

public class Main {
    public static void main(String[] args){
    Fox Alisa = new Fox();
      System.out.println(Alisa.getName());
      System.out.println(Alisa.getColor()); // выводит значение цвета RGB 
    }
}

interface Animal {
    Color getColor(); /*System.out.println("не забудьте указать окрас лисы");*/
}

class Fox implements Animal{

     public String getName() {
        return "Fox";
    }
    public Color getColor(){
        return Color.RED;
    };
}
