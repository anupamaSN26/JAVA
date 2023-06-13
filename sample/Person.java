public class Person{
    String name;
    int age;
    String sex;
    String height;
    String weight;

    public void eat(String s)
    {
        System.out.println(s);
    }
    public void fight(String s)
    {
        System.out.println(s);
    }
    public static void main(String args[]){
        Person obj=new Person();
        obj.eat("ABC");
        obj.fight("xyz");
    }

}