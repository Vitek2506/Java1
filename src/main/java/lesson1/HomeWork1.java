package lesson1;

public class HomeWork1 {
    public static void main(String[] args){
//        printThreeWords();
//        checkSumSign();
//        printColor();
        compareNumbers();
    }
    static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    static void checkSumSign() {
        int a = 5;
        int b = 11;
        if ((a + b) >= 0) {
            System.out.println("����� �������������");
        }
        else {
            System.out.println("����� ������������");
        }

    }
    static void printColor() {
        int value  = 0;
        if (value <= 0) {
            System.out.println("�������");
        }
        else if (value > 0 && value < 100) {
            System.out.println("������");
        }
        else {
            System.out.println("�������");
        }
    }
    static void compareNumbers() {
        int a = 5;
        int b = 5;
        if (a >= b) {
            System.out.println("a>=b");
        }
        else {
            System.out.println("a<b");
        }
    }
}