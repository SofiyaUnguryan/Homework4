public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int age = 40;
        if (age >= 18) {
            System.out.println("Вы совершеннолетний");
        } else {
            System.out.println("Вы пока несовершеннолетний, нужно немного подождать");
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int temperature = 14;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int speed = 67;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int age = 25;
        if (age < 2) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора спать");
        } else if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        } else if (age > 24 && age <= 60) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он может отдохнуть");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int ageOfAChild = 16;
        if (ageOfAChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageOfAChild + ", то ему нельзя кататься на аттракционе");
        } else if (ageOfAChild >= 5 && ageOfAChild <= 14) {
            System.out.println("Если возраст ребенка равен " + ageOfAChild + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст человека равен " + ageOfAChild + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int vanCapacity = 102;
        int seating = 60;
        int seatsTaken = 60;
        if (seatsTaken < seating) {
            System.out.println("Остались свободные сидячие и стоячие места");
        } else if (seatsTaken >= seating && seatsTaken < vanCapacity) {
            System.out.println("Остались свободные стоячие места");
        } else {
            System.out.println("Вагон полностью забит");
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int one = 2;
        int two = 11;
        int three = 5;
        if (one > two && one > three) {
            System.out.println("Наибольшее число one со значением " + one);
        } else if (two > three) {
            System.out.println("Наибольшее число two со значением " + two);
        } else {
            System.out.println("Наибольшее число three со значением " + three);
        }
    }
}