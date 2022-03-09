public class Cat {

    //В методе main создать три объекта типа Cat и заполнить их данными.
    // Использовать класс Cat из первой задачи. Класс Cat создавать не надо.
    public static void main(String[] args){
        Cat cat1 = new Cat("Boris", 7,7,5);
        Cat cat2 = new Cat("Bublik", 4,5,6);
        Cat cat3 = new Cat("Barsik", 2,3,4);

        //Создать три кота используя класс Cat.
        //Провести три боя попарно между котами.
        //Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
        //Результат каждого боя вывести на экран.

        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat3));
        System.out.println(cat3.fight(cat1));
    }

    private String name;
    private int age;
    private int weight;
    private int strength;

    public Cat(String name, int age, int weight, int strength) {

        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }
    public boolean fight(Cat anotherCat){

        if (this.age + this.strength*this.weight > anotherCat.age + anotherCat.strength * anotherCat.weight)
            return true;
        else return false;

    }
}
