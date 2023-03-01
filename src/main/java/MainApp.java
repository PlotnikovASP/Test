public class MainApp {
    public static void main(String[] args) {
        printColor();

    }

    public static void printColor() {
        int value = 110;
        if (value <= 0){
            System.out.println("Красный");
        }if (value > 0 && value < 100){
            System.out.println("Желтый");
        }if (value > 101 ){
            System.out.println("Зеленый");
    }
}

    //2hw
/*
    public static void checkSumSign(){
        int a = 2;
        int b = 3;
        if ( a + b >= 0){
            System.out.println(" Сумма положительная");

        }else {
            System.out.println("Сумма отрицательная");
        }*/
//1 hw
    /* public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");*/
}
