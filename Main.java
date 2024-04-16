import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    

    System.out.print("Digite o número do item faturado: ");
    int numero = scanner.nextInt();

    System.out.print("Digite a descrição do item: ");
    String descricao = scanner.next();

    System.out.print("Digite a quantidade comprada do item: ");
    int quantidade = scanner.nextInt();

    System.out.print("Digite o preço unitário do item: ");
    double preco = scanner.nextDouble();

    Fatura fatura = new Fatura(numero, descricao, quantidade, preco);

    System.out.println("Número do item: " + fatura.getNumero());
    System.out.println("\nDescrição do item: " + fatura.getDescricao());
    System.out.println("\nQuantidade comprada: " + fatura.getQuantidade());
    System.out.println("\nPreço unitário: " + fatura.getPreco());
    System.out.println("\nValor da fatura: " + fatura.calcularValorFatura());
    scanner.close();
  }
}