public class testeFatorial {
    public static void testarFatorial(int entrada, int esperado) {
        int resultado = Fatorial.calcularFatorial(entrada);
        if (resultado == esperado) {
            System.out.println("Teste passou para fatorial(" + entrada + ")");
        } else {
            System.out.println("Teste FALHOU para fatorial(" + entrada + ") - Esperado: " + esperado + ", Obtido: " + resultado);
        }
    }
}