/*
4.3
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Нужно сравнить каждый критерий по отдельности, и победителем будет тот, у которого больше "победивших" критериев.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
Если ничья и никто не выиграл, возвращаем либо true либо false, по вашему усмотрению
Требования:
•	Класс Cat должен содержать конструктор без параметров.
•	Класс Cat должен содержать всего три поля: age, weight и strength. Поля должны быть публичные.
•	В классе Cat должен быть метод fight.
•	В методе fight реализовать механизм драки котов в зависимости от их веса, возраста и силы согласно условию.
•	Метод должен возвращать одно и тоже значение, если мы деремся с одним и тем же котом.
•	Если некий кот1 выигрывает у кота кот2, то кот2 должен проигрывать коту кот1.
*/

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();    /*(2,4,9)*/
        Cat cat2 = new Cat();    /* (5,7,7)*/
        cat1.age =2;
        cat1.weight = 10;
        cat1.strength = 1;
        cat2.age =5;
        cat2.weight = 7;
        cat2.strength = 7;

        System.out.println("первый кот смог победить второго? "+ cat1.fight(cat2));
        System.out.println("второй кот смог победить первого? "+ cat2.fight(cat1));

    }
}

class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        byte score1=0;
        byte score2=0;

        if (this.age>anotherCat.age) score1++;
        else score2++;

        if (this.weight>anotherCat.weight) score1++;
        else score2++;

        if (this.strength>anotherCat.strength) score1++;
        else score2++;

        if (score1 > score2) return true;
        else if (score1 < score2) return false;
        else return false;

    }
}
