public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            total = total + salary;
            i = i + 1;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей ");
        }
        System.out.println("Задача 2");
        int g = 0;
        while (g < 10) {
            g = g + 1;
            System.out.print(g + " ");
        }
        System.out.println();
        int h = 11;
        for (; h > 1; ) {
            h = h - 1;
            System.out.print(h + " ");
        }
        System.out.println();

        System.out.println("Задание 3");
        int people = 12_000_000;
        for (int i1 = 1; i1 <= 10; i1++) {
            int birthPeople = 17 * people / 1000;
            int deathPeople = 8 * people / 1000;
            people = people + birthPeople - deathPeople;
            System.out.println("Год " + i1 + " численность населения составляет " + people);
        }
        System.out.println("Задание 4");
        int cash = 15000;
        int zero = 0;
        int r = 0;
        while (cash < 12_000_000) {
            r = r + 1;
            zero = zero + cash;
            zero = zero / 100;
            zero = zero * 7;
            cash = cash + zero;
            System.out.println("Месяц " + r + " сумма накоплений равна " + cash + " рублей ");
        }
        System.out.println("Задание 5");
        int cash1 = 15000;
        int zero1 = 0;
        int r1 = 0;
        while (zero1 < 12_000_000) {
            zero1 = zero1 + (zero1 / 100) * 7;
            zero1 = zero1 + cash1;
            r1++;
            if (r1 % 6 == 0) {
                System.out.println("Месяц " + r1 + " сумма накоплений равна " + zero1 + " рублей ");
            }
        }
        System.out.println("Задание 6");
        int cash2 = 15000;
        int zero2 = 0;
        int r2 = 0;
         while (r2 < 9*12) {
             zero2 = zero2 + (zero2 / 100) * 7;
             zero2 = zero2 + cash2;
             r2++;
            if (r2 % 6 == 0) {
                System.out.println("Месяц " + r2 + " сумма накоплений равна " + zero2 + " рублей ");
            }
        }
        System.out.println("Задание 7");
         int days = 5;
         while (days <= 31) {
             System.out.println("Сегодня пятница " + days + "е число. Необходимо подготовить отчет");
             days += 7;
         }
        System.out.println("Задание 8");
         int yearPast = 2024 - 200;
         int yearFuture = 2024 + 100;
         for (int year = yearPast; year < yearFuture; year++) {
           if (year % 79 == 0) {
               System.out.println(year);
           }
         }
    }
}