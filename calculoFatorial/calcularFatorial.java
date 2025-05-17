public class calcularFatorial {

    public static long calculoFatorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O número deve ser inteiro positivo ou zero.");
        }
        else{
            long resultado = 1;
            for (int i = 2; i <= n; i++) {
                resultado *= i;
            }
            return resultado;
        }
    }
}