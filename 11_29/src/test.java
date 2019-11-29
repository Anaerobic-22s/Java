import java.lang.Object;

class money {
    public int m;

    public money(int m) {
        this.m = m;
    }

    public int getM() {
        return m;
    }
}
class Person implements Cloneable{

    public String name;
    public int age;
    public money m;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(money m) {
        this.m = m;
    }

    public money getM() {
        return m;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}


public class test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person("caocao",33);
        Person person2 = (Person)person1.clone();
        System.out.println(person1.age + person1.name + person1.getM());
        System.out.println(person2.age + person2.name + person2.m);
        person2.name = "zhangfei";
        System.out.println(person2.age + person2.name + person2.m);
    }
}
