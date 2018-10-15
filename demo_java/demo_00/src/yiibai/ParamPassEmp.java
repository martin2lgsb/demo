package yiibai;

/**
 * Created by m2lgsb on 2018/10/15 17:46
 */
public class ParamPassEmp {
    public static void main(String[] args) {
        Circle a = testCircle();
        System.out.println(a.hashCode());

        System.out.println(a.radius);
        Circle b = changeRadius(a);
        System.out.println(a.radius);
        System.out.println(b.hashCode());
        System.out.println(b.radius);
    }

    public static Circle testCircle() {
        Circle c = new Circle();
        c.setRadius(15);
        System.out.println(c.hashCode());
        return c;
    }

    public static Circle changeRadius(Circle c) {
        c.radius = 100;
        return c;
    }
}

class Circle {
    int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
}
