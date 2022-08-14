public class Main {
    public static void main(String[] args) {
        // Работа над материалом из видео-урока
        for (int i = 2020; i < 2070; i = i + 4) {
            System.out.println("Високосный год " + i);
        }
        int salary = 65_535;
        int total = 0;
        int i = 0;
        for (; total < 1_000_000; i++) {
            total = total + total / 100;
            total = total + salary;
            if (i % 5 == 0) {
                System.out.println("Месяц " + i + " Итого " + total);
            }
        }
        // Задание 1
        int start = 1;
        while (start <= 10) {
            System.out.print(start + " ");
            start++;
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        // Задание 2
        for (int friday = 1; friday <= 31; friday += 7) {
            System.out.println("Сегодня пятница. " + friday + "-е число. Необходимо подготовить отчет.");
        }

        // Задание 3
        int year = 0;
        int passed = 1822;
        int future = 2122;
        for (; year <= future; year += 79) {
            if (year >= passed) {
                System.out.println(year);
            }
        }
    }
}
