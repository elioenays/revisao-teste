import java.time.LocalDate;

public class Order {
  private Client client;
  private LocalDate date;
  private Integer quantity;
  private Product product;

  public Order(Client client, LocalDate date, Integer quantity, Product product){
    this.client = client;
    this.date = date;
    this.quantity = quantity;
    this.product = product;
  }

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public String print(){
    return "Data pedido: " + date + "\nProduto: " + product.print()
    + "\nQuantidade: " + quantity + "\nTotal: R$ " + (product.getPrice() * quantity)
    + "\nCliente: " + client.print();
  }

}
