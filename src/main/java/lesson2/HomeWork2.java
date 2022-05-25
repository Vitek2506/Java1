package lesson2;

public class HomeWork2 {
    public static void main(String[] args){
//        summa(12, 10);
//        positive(-5);
//        negative(5);
//        string("??????", 5);
        System.out.println(gradeYear(2022));
        System.out.println(summa(12, 10));
        System.out.println(negative(5));
    }
    private static boolean summa(int a, int b){
        if (((a + b) >= 10) && ((a + b) <= 20)) {
            return true;
        }
        return false;
    }
    private static void positive(int a){
        if (a >= 0) {
            System.out.println("????????????? ?????");
        }
        else {
            System.out.println("????????????? ?????");
        }
    }
    private static boolean negative(int a){
        if (a < 0){
            return true;
        }
        else {
            return false;
        }

    }
    private static void string(String a, int b){
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }
    private static boolean gradeYear(int a){
        if (a % 400 == 0){
            return true;
        }
        else if (a % 100 == 0){
            return false;
        }
        else if (a % 4 == 0){
            return true;
        }
        else {
            return false;
        }
    }
}
