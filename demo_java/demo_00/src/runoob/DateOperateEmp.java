package runoob;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by m2lgsb on 02/03/2018
 */
public class DateOperateEmp {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss");
        System.out.println(sdf.format(new Date()));

        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));

        long timeStamp = System.currentTimeMillis();
        System.out.println(sdf.format(new Date(Long.parseLong(String.valueOf(timeStamp)))));
    }
}
