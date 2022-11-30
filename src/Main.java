public class Main {
    public static void main(String[] args) {
        task1 ();
        task2 ();
        task3 ();
        task4 ();
        task5 ();
        task6 ();
        task7 ();
        task8 ();
    }
    public static void task1() {
        System.out.println("Задача 1");
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
    }
    public static void task2() {
        System.out.println("Задача 2");
        var dog = 8;
        dog = dog + 4;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat + 4;
        System.out.println(cat);
        var paper = 763789;
        paper = paper + 4;
        System.out.println(paper);
    }
    public static void task3() {
        System.out.println("Задача 3");
        var dog = 8.0;
        dog = dog + 4.0;
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat + 4;
        cat =cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        paper = paper + 4;
        paper = paper - 7639;
        System.out.println(paper);
    }
    public static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5() {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6() {
        System.out.println("Задача 6");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeight = boxer1 + boxer2;
        System.out.println("Общий вес двух боксеров составляет "+ totalWeight + " кг.");

        var differenceWeight = boxer2 % boxer1;
        System.out.println("Разница в весе двух боксеров составляет " + differenceWeight + " кг.");
    }
    public static void task7() {
        System.out.println("Задача 7");
        var boxer1 = 78.2;
        var boxer2 = 82.7;

        var differenceWeight1 = boxer2 % boxer1;
        var differenceWeight2 = boxer2 - boxer1;
    }
    public static void task8() {
        System.out.println("Задача 8");
        var totalWorkingTime = 640;
        var workingTime = 8;
        var totalWorkers = totalWorkingTime / workingTime;
        System.out.println("Всего работников в компании - " + totalWorkers + " человек.");

        var newTotalWorkers = totalWorkers + 94;
        var newWorkingTime = totalWorkingTime / newTotalWorkers;
        System.out.println("Если в компании работает " + newTotalWorkers + " человек, то всего " + newWorkingTime + " часов работы может быть поделено между сотрудниками.");
    }
}