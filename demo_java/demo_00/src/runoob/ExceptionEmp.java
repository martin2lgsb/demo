package runoob;

/**
 * Created by m2lgsb on 05/03/2018
 */
public class ExceptionEmp {
    public static void main(String[] args) {
        try {
            new Input().method();
        } catch (WrongInputException e) {
            e.printStackTrace();
        }
    }
}

class WrongInputException extends Exception {
    WrongInputException(String s) {
        super(s);
    }
}

class Input {
    void method() throws WrongInputException {
        throw new WrongInputException("fxck wrong...");
    }
}