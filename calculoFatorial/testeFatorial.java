// Classe auxiliar para executar testes manuais comparando resultado esperado e obtido.
// commit type: test
public class testeFatorial {
    public static void testarFatorial(int entrada, long esperado) {
        // Atualmente não trata exceções, o que pode causar falha em casos de entrada inválida
        long resultado = calcularFatorial.calculoFatorial(entrada);

        if (resultado == esperado) {
            System.out.println("Teste passou para fatorial(" + entrada + ")");
        } else {
            System.out.println("Teste FALHOU para fatorial(" + entrada + ") - Esperado: " + esperado + ", Obtido: " + resultado);
        }
    }
}