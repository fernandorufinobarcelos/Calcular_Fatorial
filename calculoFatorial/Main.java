// Classe principal que executa os testes manuais da função fatorial.
// commit type: test
public class Main {
    public static void main(String[] args) {
        // Testes positivos válidos
        testeFatorial.testarFatorial(0, 1);               // Teste básico fatorial de 0
        testeFatorial.testarFatorial(1, 2);               // Teste propositalmente errado para demonstrar falha
        testeFatorial.testarFatorial(1, 1);               // Teste correto para fatorial de 1
        testeFatorial.testarFatorial(3, 6);               // Teste fatorial de 3
        testeFatorial.testarFatorial(5, 120);             // Teste fatorial de 5
        testeFatorial.testarFatorial(10, 3628800);        // Teste fatorial de 10
        testeFatorial.testarFatorial(15, 1307674368000L); // Teste fatorial de 15

        // Teste de caso inválido (número negativo)
        // Atualmente, este caso lança exceção que não é capturada, o que causará erro em tempo de execução.
        testeFatorial.testarFatorial(-5, 1);
    }
}