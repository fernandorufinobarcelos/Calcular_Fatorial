public class testeFatorial {
    public static void testarFatorial(int entrada, long esperado) {
        long resultado = calcularFatorial.calculoFatorial(entrada);
        if (resultado == esperado) {
            System.out.println("Teste passou para fatorial(" + entrada + ")");
        } else {
            System.out.println("Teste FALHOU para fatorial(" + entrada + ") - Esperado: " + esperado + ", Obtido: " + resultado);
        }
    }
}