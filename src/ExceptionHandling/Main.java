package ExceptionHandling;

import java.util.Scanner;

class CustomException extends Exception {
    public CustomException(String msg) {
        super(msg);
    }
}

public class Main {
    public static void someMethod() throws CustomException {
        throw new CustomException("Custom Exception");
    }
    public static void main(String[] args) throws CustomException {
        method1();
        someMethod();

    }

    public static void method1() {
        try {
//            String s = null;
//            System.out.println(s.length());
//            int[] arr = {1,2,3};
//            System.out.println(arr[4]);
            throw new NoSuchMethodException("No Such Method");
        }catch (NullPointerException | NoSuchMethodException ex) {
            System.out.println("Null Pointer Exception");
            
            ex.printStackTrace();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }finally {
            System.out.println("Completed");
        }

    }
}
