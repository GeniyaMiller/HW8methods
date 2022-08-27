public class Main {

        public static void main(String[] args) {
            int year = 2100;
            checkLeapYear(year);
            int OS = 0;
            int clientDeviseYear = 2014;
            installTheOS(OS, clientDeviseYear);
            int deliveryDistance = 19;
            int quantytiDeliveryDays = calculationOfDelivery(deliveryDistance);
            System.out.println("Потребуется дней " + quantytiDeliveryDays);


        }
        public static void checkLeapYear(int year) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " — високосный год");
            } else { System.out.println(year + " — не високосный год");
            }
        }
        public static void installTheOS (int OS , int clientDeviseYear) {
            if (clientDeviseYear >= 2015) {
                System.out.print("Установите версию приложения для ");
            } else {
                System.out.print("Установите облегченную версию приложения для ");
            }
            if (OS == 0) {
                System.out.println("iOS");
            } else {
                System.out.println("Android");
            }
        }
        public static int calculationOfDelivery (int deliveryDistance) {
            int deliveryTime = 1;
            for (int i = 20; i < deliveryDistance; i = i + 40) {
                deliveryTime++;
            }
            return deliveryTime;
        }

    }
