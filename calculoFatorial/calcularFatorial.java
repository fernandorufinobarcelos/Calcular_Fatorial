public class calcularFatorial {

    public static int calcularFatorial(int n) {
        if (n < 0) {
            print("O número deve ser inteiro positivo ou zero.");
        }
        else{
            int resultado = 1;
            for (int i = 2; i <= n; i++) {
                resultado *= i;
            }
            return resultado;
        }
    }
}