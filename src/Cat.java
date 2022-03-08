public class Cat {

    //Создать класс Cat.
    // У кота должно быть имя (name, String), возраст (age, int), вес (weight, int), сила (strength, int).
    public String name;
    public int age;
    public int weight;
    public int strength;


    /* Реализовать метод boolean fight(Cat anotherCat):
     реализовать механизм драки котов в зависимости от их веса, возраста и силы.
      Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
       т.е. возвращать true, если выиграли и false - если нет.
        Должно выполняться условие:
        если cat1.fight(cat2) == true , то cat2.fight(cat1) == false */


    public boolean fight(Cat anotherCat){

        if (this.age + this.strength*this.weight > anotherCat.age + anotherCat.strength * anotherCat.weight)
            return true;
            else return false;

    }


    public static void main(String[] args){
        Cat Boris = new Cat();
        Boris.name = "Борис";
        Boris.age = 7;
        Boris.weight = 6;
        Boris.strength = 4;

        Cat Bublik = new Cat();
        Bublik.name = "Бублик";
        Bublik.age = 5;
        Bublik.weight = 4;
        Bublik.strength = 7;

        System.out.println(Bublik.fight(Boris));


    }
}
