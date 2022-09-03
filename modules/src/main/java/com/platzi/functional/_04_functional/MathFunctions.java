package com.platzi.functional._04_functional;

import java.util.function.Function;
import java.util.function.Predicate;

public class MathFunctions {
    public static void main(String[] args) {
        Function<Integer, Integer> squareFun = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x*x;
            }
        };

        Function<Integer, Boolean> isOdd = x -> x % 2 == 1;

        // Predicate es una Funcion que trabaja sobre un tipo y genera un boolean en retorno.
        Predicate<Integer> isEven = x -> x % 2 == 0;

        Predicate<Student> isApproved = s -> s.getCalification() > 6.0;

        Student david = new Student(5.5);
        System.out.println(isApproved.test(david));
    }

    static int square(int num) {
        return num * num;
    }

    static class Student {
        private double calification;

        public Student(double cal) {
            this.calification = cal;
        }

        public double getCalification() {
            return calification;
        }
    }
}
