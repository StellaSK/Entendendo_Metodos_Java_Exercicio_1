public class Emprestimo {
    public static void getParcelas(int quantidadeParcelas) {
        if (quantidadeParcelas <= 12 && quantidadeParcelas > 0) {
            System.out.println("Voce ira parcelar em " + quantidadeParcelas + " vezes.");
        } else {
            System.out.println("Quantidade invalida de parcelas!");
        }
    }

    public static double taxaParcela(int quantidadeParcelas) {
        double taxa = 0.15;
        return quantidadeParcelas * taxa;
    }

    public static void calcular(double valor, int quantidadeParcelas) {
        double totalFinal = valor + (valor * taxaParcela(quantidadeParcelas));
        double parcela = totalFinal / quantidadeParcelas;
        int contador = 1;
        while (contador <= quantidadeParcelas){
            System.out.printf("Parcela: %d, valor de: R$%2.2f \n" ,contador,parcela);
            contador += 1;
        }
        System.out.println("Valor final do empréstimo para " + quantidadeParcelas + " parcelas: R$ " + totalFinal);
    }
}
