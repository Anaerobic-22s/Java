class Address1  {
    private String add;
    public String getAdd() {
        return add;
    }
    public void setAdd(String add) {
        this.add = add;
    }

}

class Student1 implements Cloneable{
    private int number;
    private Address1 addr;
    public Address1 getAddr() {
        return addr;
    }
    public void setAddr(Address1 addr) {
        this.addr = addr;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    @Override
    public Object clone() {
        Student stu = null;
        try{
            stu = (Student)super.clone();
        }catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return stu;
    }
}
public class test3{

    public static void main(String args[]) {
        Address addr = new Address();
        addr.setAdd("杭州市");
        Student stu1 = new Student();
        stu1.setNumber(123);
        stu1.setAddr(addr);
        Student stu2 = (Student)stu1.clone();
        System.out.println("学生1:" + stu1.getNumber() + ",地址:" + stu1.getAddr().getAdd());
        System.out.println("学生2:" + stu2.getNumber() + ",地址:" + stu2.getAddr().getAdd());
    }
}