package lessen1;

public record HomeWorkApp() {

    //ЗАДАНИЕ 1
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();


    }



    // зАДАНИЕ 2
    public static void printThreeWords() {

   System.out.println("Orange " );
   System.out.println("Banana");
   System.out.println("Apple");

}
    //ЗАДАНИЕ 3
    public static void checkSumSign() {
        int a = 5;
        int b =- 8;
        int с = a + b;
        if (с >= 0) {
            System.out.print("Сумма положительная");
        } else {
            System.out.print("Сумма отрицательная");
        }

        System.out.println("с  " + с);
    }

    //ЗАДАНИЕ 4
    private static void printColor() {
        int value = 111;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 & value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }

    }
// Задание 5
    private static void compareNumbers() {
        int a = 15;
        int b = 7;

        if (a >= b) {
            System.out.println("a > = b");
        } else {
            System.out.println("a < b");
        }
    }
    }

