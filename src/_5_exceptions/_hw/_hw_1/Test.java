package _5_exceptions._hw._hw_1;

import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Double> list = new ScannerDoubleFromConsole().readValues();
        System.out.println(list);
        System.out.println(ScannerDoubleFromConsole.sumOfValues(list));

    }
}
