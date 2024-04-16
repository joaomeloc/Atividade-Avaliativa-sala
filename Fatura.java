public class Fatura {
  private int numero;
  private String descricao;
  private int quantidade;
  private double preco;

  public Fatura(int numero, String descricao, int quantidade, double preco) {
    this.numero = numero;
    this.descricao = descricao;
    this.quantidade = quantidade;
    this.preco = preco;
  }

  public int getNumero() {
    return numero;
  }

  public String getDescricao() {
    return descricao;
  }

  public int getQuantidade() {
    if (quantidade <= 0) {
      return 0;
    }else{
      return quantidade;
    }
  }

  public double getPreco() {
    if (preco <= 0) {
      return 0.0;
    }else{
      return preco;
    }
  }

  public double calcularValorFatura() {
    if (preco <= 0 || quantidade <= 0) {
      return 0.0;
    }else{
      return quantidade * preco;
    }
  }

  
}