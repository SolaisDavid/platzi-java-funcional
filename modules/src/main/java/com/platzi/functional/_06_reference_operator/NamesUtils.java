package com.platzi.functional._06_reference_operator;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class NamesUtils {
    public static void main(String[] args) {
        List<String> profesores = getList("David", "Guadalupe", "Jesus");

        // Imprimir los nombres usando un consumer predefinido.
        Consumer<String> printer = nombre -> System.out.println(nombre);
        profesores.forEach(printer);

        // Imprimir los nombres usando el operador de referencia '::'.
        // Este operador se usa para hacer referencia a metodos (funciones)
        // definidos dentro de alguna clase u objeto. Debemos tener en cuanta que
        // el iterador debe proveer de los parametros y sus tipos correctos
        // para que la referencia funcione.
        profesores.forEach(System.out::println);

    }

    static <T>List<T> getList(T... elementos) {
        return Arrays.asList(elementos);
    }
}
