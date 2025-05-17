// Classe que implementa o cálculo do fatorial de forma iterativa.
// commit type: feat
public class calcularFatorial {

    public static long calculoFatorial(int n) {
        if (n < 0) {
            // commit type: fix (tratamento de erro)
            // Lança exceção caso o número seja negativo, garantindo que entradas inválidas sejam tratadas adequadamente.
            throw new IllegalArgumentException("O número deve ser inteiro positivo ou zero.");
        } else {
            // Cálculo do fatorial com acumulação em variável long para evitar overflow até 20!
            long resultado = 1;
            for (int i = 2; i <= n; i++) {
                resultado *= i;
            }
            return resultado;
        }
    }
}