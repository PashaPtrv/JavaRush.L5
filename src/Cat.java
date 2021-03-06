public class Cat {

    /*Создать класс Cat (кот) с пятью конструкторами:
- Имя
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес (чужой домашний кот)
Задача инициализатора – сделать объект валидным.
 Например, если вес неизвестен, то нужно указать какой-нибудь средний вес.
 Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null).
  То же касается адреса: null.*/

    //
    private String name;
    private String address ;
    private int age ;
    private int weight ;
    private String color;

    public Cat(String name){
        this.name = name;
    }
    public Cat(String name,int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public Cat(String name,int age){
        this.name = name;
        this.age = age;
        this.weight = 5;

    }
    public Cat(int weight, String color){
        this.weight = weight;
        this.color = color;
        this.name = null;
        this.address = null;
        this.age = 8;
    }
    public Cat(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

}
