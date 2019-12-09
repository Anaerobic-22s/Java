import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

 class A<T> {
    T value;
    public A(T value){
        this.value = value;
    }
    T get() {
        return value;
    }
}


public class test {
    public static void main(String[] args) {
        A<Integer> a = new A<>(2);
        int b = a.get();
        System.out.println(b);
    }
}
