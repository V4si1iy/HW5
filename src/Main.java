public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1(){
        System.out.println("Задание 1");
        byte clientOS = 1;
        if(clientOS==0)
            System.out.println("Установите версию приложения для iOS по ссылке");
        else
            System.out.println("Установите версию приложения для Android по ссылке");
    }
    public static void task2() {
        System.out.println("Задание 2");
        byte clientOS = 1;
        int clientDeviceYear = 2014;
        System.out.print("Установите ");
        if(clientDeviceYear < 2015)
            System.out.print("облегченную ");
        if(clientOS == 0)
            System.out.println("версию приложения для iOS по ссылке");
        else
            System.out.println("версию приложения для Android по ссылке");
    }
    public static void task3() {
        System.out.println("Задание 3");
        int yourYear = 2022;
        if((yourYear % 4 == 0 && yourYear % 100 != 0) || yourYear % 400 == 0)
            System.out.println(yourYear + " год является високосным");
        else
            System.out.println(yourYear + " год не является високосным");
    }
    public static void task4() {
        System.out.println("Задание 4");
        int deliveryDistance = 95;
        int countDays=1;
        if(deliveryDistance > 20)
            countDays++;
        if(deliveryDistance > 60)
           countDays++;
        if(deliveryDistance > 100)
            countDays=0;
        System.out.println("Потребуется дней: " + countDays);
    }
    public static void task5() {
        System.out.println("Задание 5");
        int monthNumber = 12;
        switch (monthNumber)
        {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Такого месяца не существует");
                break;
        }
    }
}