package com.skypro.lyambdalion.introducing;

import java.beans.Expression;
import java.util.Scanner;
import java.util.function.Predicate;

public class LambdaApp {
//    static int x = 10;
//    static int y = 20;

    public static void main(String[] args) {
//        Operationable operation;
//        operation = (x, y) -> x + y;
//
//        int result = operation.calculate(10, 20);
//        System.out.println(result);
//
//        operation = (x, y) -> x * y;
//
//        result = operation.calculate(5, 50);
//        System.out.println(result);
//
//        Operationable operationable;
//        operationable = (x, y) -> x - y;
//
//        int result3 = operationable.calculate(100, 33);
//        System.out.println(result3);

//        Operationable test;
//        test = (a, b, c) -> a + b * c;
//
//        Operationable test2;
//        test2 = (int a, int b, int c) -> a * b / c;

//        int result = test.cool(5, 10, 15);
//        System.out.println(result);
//
//        int result1 = test2.cool(5, 10, 15);
//        System.out.println(result1);
//
//        int result2 = test.cool(15, 10, 5);
//        System.out.println(result2);
//
//        int result3 = test2.cool(15, 10, 5);
//        System.out.println(result3);
//
//        System.out.println(test2.cool(5,2,3));
//        System.out.println((double) test2.cool(5,2,3));

//        Operationable test3;
//        test3 = () -> 50 - 40;
//
//        System.out.println(test3.calc());
//    Operationable testClass = new Operationable() {
//    @Override
//        public int calcul(int n) {
//        return n*n;
//        }
//    };
//
//        int z = testClass.calcul(25);
//        System.out.println(z);
//
//
//        Operationable test4;
//        test4 = n -> (n + n) * n - n;
//        System.out.println(test4.calcul(12));


//        Printable printer = s -> System.out.println(s);
//        printer.print("Hello, world!");
//
//
//        Operation oper = () -> {
//            x = 30;        // Переменные x и y объявлены на уровне класса, и в лямбда-выражении мы их можем получить и даже изменить.
//            return x + y;
//        };
//        System.out.println(oper.calculate());
//
//        int m = 70;
//        int n = 30;
//        Operation operation = () -> {
//            return m + n; //Локальные переменные m и n уровня метода мы также можем использовать в лямбдах, но изменять их значение нельзя.
//        };
//        System.out.println(operation.calculate());
//
//        Operationable operation5 = (int x1, int y1) -> {
//            if(y1==0)
//                return 0;
//            else
//                return x1/y1;
//        };
//        System.out.println(operation5.calculate(20,10));
//        System.out.println(operation5.calculate(20,0));
//
//        Operationable oper5;
//        oper5 = (x1, y1) -> {
//            if (x1 == y1) {
//                return x1 * y1;
//            }
//            return x1+y1;
//        };
//        System.out.println(oper5.calculate(30,30));
//        System.out.println(oper5.calculate(20,30));
//
//        Operationable test = (x1, y1) -> {
//            if(x1 > y1)
//                return x1 / y1;
//            else
//                return x1 * y1;
//        };
//        System.out.println(test.calculate(30,30));
//        System.out.println(test.calculate(20,30));
//
//
//        // Функциональный интерфейс может быть обобщенным, однако в лямбда-выражении использование обобщений не допускается.
//        // В этом случае нам надо типизировать объект интерфейса определенным типом, который потом будет применяться в лямбда-выражении.
//        OperationableType<Integer> opInt = (x1, y1) -> x1 + y1;
//        OperationableType<String> opStr = (x1, y1) -> x1 + y1;
//
//        System.out.println(opInt.calculate(10, 20));
//        System.out.println(opStr.calculate("20", "10"));

//        Expression func = (n)->n%2 == 0;
//        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        System.out.println(sum(nums, func));
//
//        int x = sum(nums, n -> n > 5);
//        System.out.println(x);

//        int[] nums = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
//
//        //Ссылка на метод передается в виде имя_класса::имя_статического_метода (если метод статический)
//        // или объект_класса::имя_метода (если метод нестатический).
//        System.out.println(sum(nums, ExpressionHelper::isEven));
//
//        Expression expr = ExpressionHelper::isPositive;
//        System.out.println(sum(nums, expr));
//
//        ExpressionHelper exprNeg = new ExpressionHelper();
//        System.out.println(sum(nums, exprNeg::isNegative));
//
//        //можем использовать конструкторы: название_класса::new. При использовании конструкторов
//        // методы функциональных интерфейсов должны принимать тот же список параметров, что и конструкторы класса,
//        // и должны возвращать объект данного класса.
//        UserBuilder userBuilder = User::new;
//        User user = userBuilder.create("Tom");
//        System.out.println(user.getName());
//
//
//        //Также метод в Java может возвращать лямбда-выражение.
//        Operation func = action(1);
//        int a = func.execute(6, 5);
//        System.out.println(a);
//
//        int b = action(2).execute(8, 2);
//        System.out.println(b);

        // Predicate<T> проверяет соблюдение некоторого условия. Если оно соблюдается,
        // то возвращается значение true. В качестве параметра лямбда-выражение принимает объект типа T
        Predicate<Integer> isPositive = x -> x > 0;
        System.out.println(isPositive.test(5));
        System.out.println(isPositive.test(-7));

        // BinaryOperator<T> принимает в качестве параметра два объекта типа T,
        // выполняет над ними бинарную операцию и возвращает ее результат также в виде объекта типа T
        BinaryOperator<Integer> multiply = (x, y) -> x*y;
        System.out.println(multiply.apply(3, 5));
        System.out.println(multiply.apply(10, -2));

        // UnaryOperator<T> принимает в качестве параметра объект типа T,
        // выполняет над ними операции и возвращает результат операций в виде объекта типа T
        UnaryOperator<Integer> square = x -> x*x;
        System.out.println(square.apply(5));

        // Function<T,R> представляет функцию перехода от объекта типа T к объекту типа R
        Function<Integer, String> convert = x -> String.valueOf(x) + " dollars";
        System.out.println(convert.apply(50));

        // Consumer<T> выполняет некоторое действие над объектом типа T, при этом ничего не возвращая:
        Consumer<Integer> printer = x -> System.out.printf("%d dollars \n", x);
        printer.accept(600);

        // Supplier<T> не принимает никаких аргументов, но должен возвращать объект типа T
        Supplier<User> userFactory = () -> {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите имя: ");
            String name = in.nextLine();
            return new User(name);
        };

        User user1 = userFactory.get();
        User user2 = userFactory.get();

        System.out.println("Имя user1: " + user1);
        System.out.println(user2);
    }

    public interface Predicate<T> {
        boolean test(T t);
    }

    public interface BinaryOperator<T>{
        T apply(T t1, T t2);
    }

    public interface UnaryOperator<T>{
        T apply(T t);
    }

    public interface Function<T, R>{
        R apply(T t);
    }

    public interface Consumer<T>{
        void accept(T t);
    }

    public interface Supplier<T>{
        T get();
    }

    private static Operation action(int number) {
        switch (number) {
            case 1: return (x,y) -> x + y;
            case 2: return (x,y) -> x - y;
            case 3: return (x,y) -> x * y;
            default: return (x, y) -> 0;
        }
    }


    private static int sum(int[] numbers, Expression func) {
        int result = 0;
        for (int i : numbers) {
            if (func.isEqual(i))
                result += i;
        }
        return result;
    }
    interface Expression{
        boolean isEqual(int n);
    }

}
