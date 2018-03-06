package demo;

/**
 * Created by m2lgsb on 06/03/2018
 */
public class CaseTestEmp {
    public static void main(String[] args) {
        CaseTestEmp caseTestEmp = new CaseTestEmp();
        caseTestEmp.caseTest('b');
    }

    public void caseTest(char ch) {
        switch (ch) {
            case 'a':
            case 'b':
            case 'c':
                System.out.println("case c");
//                break;
            case 'd':
            case 'e':
                System.out.println("case e");
                break;
            default:
                System.out.println("case default");
                break;
        }
    }
}
