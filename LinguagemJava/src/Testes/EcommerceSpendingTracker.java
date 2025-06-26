package Testes;

import java.util.Scanner;
import java.util.Locale;

public class EcommerceSpendingTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int purchaseCount = scanner.nextInt();

        if (purchaseCount == 0) {
            System.out.println("Nenhuma compra registrada.");
        } else {
            double totalSpent = 0.0;

            // Leitura dos valores das compras
            for (int i = 0; i < purchaseCount; i++) {
                double valorCompra = scanner.nextDouble();
                totalSpent += valorCompra;
            }

            // Cálculo da média
            double media = totalSpent / purchaseCount;

            // Impressão com duas casas decimais
            System.out.printf("%.2f%n", totalSpent);
            System.out.printf("%.2f%n", media);
        }

        scanner.close();
    }
}

