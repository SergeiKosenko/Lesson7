package ru.kosenko;


public class Testing {
    public static  void method1() {
        System.out.println("Не тестируем");
    }

    @BeforeSuite
    public static void start() {
        System.out.println("Старт");
    }

    @Test(priority = 4)
    public static  void method2() {
        System.out.println("Метод 2 Приоритет 4");
    }

    @Test(priority = 3)
    public static  void method3() {
        System.out.println("Метод 3 Приоритет 3");
    }

    @Test(priority = 2)
    public static  void method4() {
        System.out.println("Метод 4 Приоритет 2");
    }

    @AfterSuite
    public static void shutdown() {
        System.out.println("Стоп");
    }

    @Test(priority = 10)
    public static  void method5() {
        System.out.println("Метод 5 Приоритет 10");
    }

}
