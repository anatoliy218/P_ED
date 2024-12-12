public class Calculadora {

    public static Double logica(String operacion, Integer valor1, Integer valor2) {
        double resultado = 0;

        if (operacion == "suma") {
            return resultado = (valor1 + valor2);
        } else if (operacion == "resta") {
            return resultado = (valor1 - valor2);
        } else if (operacion == "division") {
            Double valor1_1 = (double) valor1;
            Double valor2_1 = (double) valor2;
            return resultado = (valor1 / valor2);
        } else if (operacion == "multiplicacion") {
            return resultado = (valor1 * valor2);
        } else {
            resultado = 0;
        }
        return resultado;

    }

    public static Double porcentaje(Integer total, Integer porcentaje) {
        return (total * (porcentaje / 100.0));
    }

    public static Integer modulo(Integer valor1, Integer valor2) {
        return valor1 % valor2;
    }

    public static Integer factorial(Integer valor) {
        if (valor < 0) {
            throw new ArithmeticException("No se puede calcular el factorial de un número negativo.");
        }
        int resultado = 1;
        for (int i = 1; i <= valor; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {

        Double resultado = logica("suma", 2, 7);

        Double resultadoPorcentaje = porcentaje(30,10);

        Integer resultadoModulo = modulo(2,10);

        Integer resultadoFactorial = factorial(10);


        System.out.println(resultado);
        System.out.println(resultadoPorcentaje);
        System.out.println(resultadoModulo);
        System.out.println(resultadoFactorial);

    }
}