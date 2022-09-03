package com.platzi.functional._05_sam;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public class AgeUtils {
    public static void main(String[] args) {
        Function<Integer, String> addCeros = x -> x < 10 ? "0" + x : String.valueOf(x);

        TriFunction<Integer, Integer, Integer, LocalDate> parseDate = (day, month, year) -> {
            return LocalDate.parse(year + "-" + addCeros.apply(month) + "-" + addCeros.apply(day));
        };

        TriFunction<Integer, Integer, Integer, Integer> calcAge = (year, month, day) -> {
            return Period.between(parseDate.apply(year, month, day), LocalDate.now()).getYears();
        };

        System.out.println(calcAge.apply(10, 10, 1992));
    }

    @FunctionalInterface
    interface TriFunction<T, U, V, R> {
        R apply(T t, U u, V v);
    }
}
