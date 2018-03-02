package runoob;

/**
 * Created by m2lgsb on 02/03/2018
 */
public class FuncOverloadingEmp {
    public static void main(String[] args) {
        HouseClass h = new HouseClass(3);
        h.info();
        h.info("重载");
        new HouseClass();
    }

}

class HouseClass {
    int height;

    HouseClass() {
        System.out.println("无参构造函数");
        height = 4;
    }

    HouseClass(int i) {
        System.out.println("房子高度为" + i + "米");
        height = i;
    }

    void info() {
        System.out.println("房子高度为" + height + "米");
    }

    void info(String s) {
        System.out.println(s + "房子高度为" + height + "米");
    }
}