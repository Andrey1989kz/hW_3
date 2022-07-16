import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        Scanner os = new Scanner(System.in);
        int clientOS;
        System.out.println("Выбирете свою ОС Ios - 0, Android - 1:  ");
        clientOS = os.nextInt();
        int ios = 0, android = 1;
        if (clientOS == android) {
            System.out.println("Установите версию приложения для Android по ссылке ");
        } else if (clientOS == ios) {
            System.out.println("Установите версию приложения для IOS по ссылке ");
        }
        // Задание 2

        Scanner os2 = new Scanner(System.in);
        int clientOS2;
        System.out.println("Выбирете свою ОС Ios - 0, Android - 1:  ");
        clientOS2 = os2.nextInt();
        int ios2 = 0, android2 = 1;
        Scanner year = new Scanner(System.in);
        int clientDeviceYear;
        System.out.println("Введите год Вашего устройства: ");
        clientDeviceYear = year.nextInt();
        int yearOfTransition = 2015;
        if (clientOS2 == android2 && clientDeviceYear >= yearOfTransition) {
            System.out.println("Установите версию приложения для Android по ссылке ");
        } else if (clientOS2 == android2 && clientDeviceYear <= yearOfTransition) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке ");
        }else if (clientOS2 == ios2 && clientDeviceYear >= yearOfTransition) {
            System.out.println("Установите версию приложения для IOS по ссылке ");
        }else if (clientOS2 == ios2 && clientDeviceYear <= yearOfTransition) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке ");
        } else {
            System.out.println("У Вас скорее всего Windows Phone");
        }
        //Задание 3

        Scanner l = new Scanner(System.in);
        int year3;
        System.out.println("Введите год:  ");
        year3 = l.nextInt();
        int a  = 100;
        int b = 4;
        int c = 400;
        if (year3 % b == 0 || year3 % c > 0 ){
            System.out.println(year + " год является високосным");
        } else if (year3 % a != 0) {
            System. out. println(year + " год не является високосным");}

        //Задание 4

        Scanner bank = new Scanner(System.in);
        int deliveryDistance;
        System.out.println("Введите расстояние до клиента в киллометрах:");
        deliveryDistance = bank.nextInt();
        int distance = 20, distance2 = 60, distance3 = 100;
        int deliveryTime = 1, deliveryTime2 = 2, deliveryTime3 = 3;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryTime );
        }else if(deliveryDistance >=distance && deliveryDistance < distance2){
            System.out.println("Потребуется дней: " + deliveryTime2 );
        } else if (deliveryDistance == distance2 || deliveryDistance == distance3){
            System.out.println( "Потребуется дней: " + deliveryTime3);
        } else {
            System.out. println("Обратитесь в ближайшее отделение банка, слишком большое расстояние))");
        }


        // Задание 5
        //Напишите программу, которая определяет по номеру месяца в году, к какому сезону этот месяц
        // принадлежит. Например, 1 месяц (он же январь) принадлежит к сезону зима.
        //Для написания программы используйте оператор switch. Для обозначения номера
        // месяца используйте переменную monthNumber = 12. Пропишите условие, при котором программа
        // не будет выполняться (номер месяца больше 13)
        Scanner month = new Scanner(System.in);
        int monthNumber;
        System.out.println("Введите номер месяца для определения времени года: ");
        monthNumber = month.nextByte();
        switch (monthNumber)
        {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            case 13:
                System.out.println("В году 12 месяцев. попробуйте еще раз. Все получится))");



        }
    }

}





