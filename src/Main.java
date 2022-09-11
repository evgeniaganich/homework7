public class Main {
    public static void main(String[] args) {

        System.out.println("Домашнее задание 1");
        System.out.println();
        System.out.println("Задание 1");

        int salary = 29000;
        int total = 0;

        for (int i = 0; total <= 2_459_000; i++) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Конец задания 1");
        System.out.println();

        System.out.println("Домашнее задание 2");

                int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        for (i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println("Конец задания 2");
        System.out.println();

        System.out.println("Домашнее задание 3");


        int numberOfCitizens = 12_000_000;
        int birth = 17;
        int death = 8;
        int year = 0;
        for (year = 0; year <= 10; year++) {
            numberOfCitizens = numberOfCitizens + numberOfCitizens / 1000 * birth - numberOfCitizens / 1000 * death;
            System.out.println("Год " + year + ", численность населения составляет " + numberOfCitizens);
        }
        System.out.println("  ");

        System.out.println("Домашнее задание 2");
        System.out.println();

        System.out.println("Задание 1");

        int money = 15000;
        int monthlyPercent = 7;
        for (i = 2; money <= 12_000_000; i++) {
            money = money + money / 100 * monthlyPercent;
            System.out.println("Месяц " + i + ", сумма накоплений " + money);
        }
        System.out.println("Конец задания 1");


        System.out.println();
        System.out.println("Задание 2");

        i=1;
        int money1 = 15000;
        while (money1 <= 12_000_000) {
            money1 = money1 + money1 / 100 * monthlyPercent;
            i++;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений " + money1);

            }
        }
        System.out.println("Конец задания 2");
        System.out.println();
        System.out.println("Задание 3");

        int money2 = 15000;
        int yearofGaining = 1;
        int m = 1;

        while (yearofGaining <= 9) {
            System.out.println("Год " + yearofGaining);
            m=1;
            while (m <= 12) {
                money2 = money2 + money2 / 100 * monthlyPercent;
                m++;
                if (m % 6 == 0) {
                    System.out.println("Месяц " + m + ", сумма накоплений " + money2);}
            }
                yearofGaining++;

        }

        System.out.println("Конец задания 3");

        System.out.println();
        System.out.println("Задание 4");

        int day = 1;
        int friday = 3;
        for (day =1; day <= 31; day++) {
            if (day % friday == 0) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
                friday = friday + 7;
            }

        }
        System.out.println("Конец задания 4");

        System.out.println();

        System.out.println("Домашнее задание 3");
        System.out.println();
        System.out.println("Задание 1");

        int ourYear = 2022;
        int firstYear = ourYear - 200;
        int lastYear = ourYear + 100;
        int currentYear = 0;
        for (currentYear = 0; currentYear <= lastYear; currentYear++) {
            if (currentYear >= firstYear && currentYear % 79 == 0) {
                System.out.println(currentYear);}
        }
        System.out.println("Конец задания 1");
        System.out.println();
        System.out.println("Задание 2");

        int firstNumber = 2;
        int secondNumber = 1;
        int thirdNumber = firstNumber * secondNumber;
        for (firstNumber = 2; secondNumber <= 10; secondNumber++) {
            System.out.println("2*" + secondNumber + "=" + thirdNumber);
        }
        System.out.println("Конец задания 2");


        }


    }