public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1(){
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println(" Установите версию приложения для ios по ссылке. ");
        } else if (clientOS == 1) {
            System.out.println(" Установите версию приложения для Android по ссылке. ");
        } else {
            System.out.println(" Ошибка!");
        }
    }
    public static void task2(){
        int clientsOS = 0;
        int deviceYear = 2014;
        if (clientsOS == 0) {
            if (deviceYear < 2015) {
                System.out.println(" Установите облегченную версию приложения для ios по ссылке.");
            } else {
                System.out.println(" Установите версию приложения для ios по ссылке. ");
            }
        }else if (clientsOS == 1) {
            if (deviceYear < 2015) {
                System.out.println(" Установите облегченную версию приложения для Android по ссылке. ");
            } else {
                System.out.println(" Установите версию приложения для Android по ссылке. ");
            }
        }

    }
    public static void task3() {
        int year = 1862;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(" Год является високосны! ");
        } else {
            System.out.println(" Год не является високосным! ");
        }
    }
    public static void task4() {
        int distanse = 87;
        int time = -1;
        if (distanse <= 20) {
            time = 1;
        } else if (distanse > 20 && distanse <= 60) {
            time = 2;
        } else if (distanse > 60 && distanse <= 100) {
            time = 3;
        }
        System.out.println(time);
    }
    public static void task5() {
        int month = 7;

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println(" Зима ");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(" Весна ");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(" Лето ");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(" Осень ");
                break;
            default:
                System.out.println(" Такого месяца нет! ");
        }
    }

}