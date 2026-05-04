import java.util.Scanner;

public class SistemaTrocoPaiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o valor total da compra: R$ ");
        double valorCompra = scanner.nextDouble();

        System.out.print("Digite o valor pago pelo cliente: R$ ");
        double valorPago = scanner.nextDouble();

        System.out.println("\n--- Resumo da Operação ---");
        System.out.println("Cliente: " + nome);
        System.out.println("Valor da Compra: R$ " + valorCompra);
        System.out.println("Valor Pago: R$ " + valorPago);

        if (valorPago < valorCompra) {
            System.out.println("Erro: Valor insuficiente para realizar suas compras!");
        } else {
            double trocoTotal = valorPago - valorCompra;
            System.out.println("Troco Total: R$ " + trocoTotal);
            
            int valorTroco = (int) trocoTotal;
            
            System.out.println("Cédulas para o troco:");

            int[] notas = {200, 100, 50, 20, 10, 5, 2, 1};
            
            for (int nota : notas) {
                int quantidadeNotas = valorTroco / nota;
                if (quantidadeNotas > 0) {
                    System.out.println(quantidadeNotas + "x R$" + nota);
                    valorTroco %= nota; // Atualiza o valor restante do troco
                }
            }
        }

        scanner.close();
    }
}
