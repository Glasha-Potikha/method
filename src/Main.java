public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        int year = 1900;
        if (isLeapYear(year)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }

    }

    public static void task2() {
        int clientOS = 0;
        int currentYear = 2017;
        whatVersionOfApp(clientOS, currentYear);
    }

    public static void task3() {
        int deliveryDistance = 35;
        int days = howDaysDelivery(deliveryDistance);
        if (days < 1) {
            System.out.println("Мы не сможем осуществить доставку");
        } else {
            System.out.println("Потребуется дней: " + days);
        }
    }

    public static boolean isLeapYear(int year) {
        boolean isLeapYear;
        if (year < 1584 || (year % 100 == 0 && year % 400 != 0)) {//прописываем исключение
            isLeapYear = false;
        } else if (year % 4 == 0) {//прописываем правило
            isLeapYear = true;
        } else {//все остальное
            isLeapYear = true;
        }
        return isLeapYear;
    }

    public static void whatVersionOfApp(int clientOS, int clientDeviceYear) {
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static int howDaysDelivery(int distance) {
        int days;
        if (distance <= 20) {
            days = 1;
        } else if (distance <= 60) {
            days = 2;
        } else if (distance <= 100) {
            days = 3;
        } else {
            days = -1;
        }
        return days;
    }
}