public abstract class Fibonacci {
    private static boolean eFibonacciRecursivo(int numero, int primeiroTermoAnterior, int SegundoTermoAnterior) {
        if (SegundoTermoAnterior == numero) {
            return true;
        } else if (SegundoTermoAnterior > numero) {
            return false;
        } else {
            return eFibonacciRecursivo(numero, SegundoTermoAnterior,
                    primeiroTermoAnterior + SegundoTermoAnterior);
        }
    }

    public static boolean eFibonacci(int numero) {
        if (numero == 0 || numero == 1) {
            return true;
        }

        return eFibonacciRecursivo(numero, 0, 1);
    }
}
