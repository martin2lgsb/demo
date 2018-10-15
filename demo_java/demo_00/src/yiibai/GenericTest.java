package yiibai;

/**
 * Created by m2lgsb on 2018/10/15 15:58
 */
public class GenericTest {
    public static void main(String[] args) {

        Box<String> b0 = new Box<>("aaa");
        System.out.println("b0: " + b0.getData());

        Box<Number> b1 = new Box<>(111);
        System.out.println("b1: " + b1.getData());

        Box<Integer> b2 = new Box<>(222);
        System.out.println("b2: " + b2.getData());

        System.out.println("class: " + b1.getClass().equals(b2.getClass()));

        getData(b0);
        getData(b1);
        getData(b2);

//        getUpperNumberData(b0); // String
        getUpperNumberData(b1);
        getUpperNumberData(b2);

//        getLowerIntegerData(b0); // String
        getLowerNumberData(b1);
//        getLowerNumberData(b2); // Integer
    }

    public static void getData(Box<?> data) {
        System.out.println("data: " + data.getData());
    }

    public static void getUpperNumberData(Box<? extends Number> data) {
        System.out.println("data: " + data.getData());
    }

    public static void getLowerNumberData(Box<? super Number> data) {
        System.out.println("data: " + data.getData());
    }
}

class Box<T> {

    private T data;

    public Box() {

    }

    public Box(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
