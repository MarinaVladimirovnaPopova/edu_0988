/*
task_4.6
Задача вывести на экран такое сообщение (для объекта gosha):
Меня зовут "имя объекта"
Имя моей мамы: "имя мамы"
Имя моего папы: "имя папы"
У меня две бабушки, бабушка "имя бабушки" и "имя бабушки"
У меня два деда, деда "имя деда" и "имя деда"
*/

public class Main {
    public static void main(String[] args) {
        Person valera=new Person("Валера","Иванов",69,null,null);
        Person olga = new Person("Ольга","Иванова",67,null,null);
        Person oleg = new Person("Олег","Петров",65,null,null);
        Person jula = new Person("Юля","Петрова",67,null,null);
        Person alex = new Person("Алексей","Иванов",37,olga,valera);
        Person eva  = new Person("Ева","Иванова",37,jula,oleg);
        Person gosha= new Person("Гоша","Иванов",10,eva,alex);
        System.out.println("Меня зовут: "+gosha.getName()+"\n"+"Имя моей мамы: "+gosha.getMother().getName()+
                "\n"+"Имя моего папы: "+gosha.getFather().getName()+
                "\n"+"У меня две бабушки, бабушка "+gosha.getMother().getMother().getName()+" и бабушка "+gosha.getFather().getMother().getName()+
                "\n"+"У меня два деда, дед "+gosha.getMother().getFather().getName()+" и дед "+gosha.getFather().getFather().getName()); // можно вывести через \n ? Или каждую строку через System.out.println?..


    }
}

class Person{
    private String name;
    private String lastname;
    private int age;
    /*private int hp = 100;*/  //для чего служит переменная hp? 
    private Person mother;
    private Person father;
    public Person(String name, String lastname, int age, Person mother, Person father){
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.mother = mother;
        this.father = father;
    }
    public String getName() {
        return this.name;
  /*  }
    public int getHp(){
        return this.hp;*/
    }
    public Person getMother(){
        return this.mother;
    }
    public Person getFather(){
        return this.father;
    }
   /* public void setHp(int hp){
        if (this.hp+hp>100) this.hp = 100;
        else this.hp = this.hp + hp;
    }*/
}
