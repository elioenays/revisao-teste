import java.time.LocalDate;
import java.util.ArrayList;

public class OrdersUseCase {
  private static ArrayList<Order> orders = new ArrayList<>();

  public void createOrder(){

    Client client = new Client("Eli", "12345678910", "Rua 407");
    Product product = new Product("Skol Lata",3.75);

    Order order = new Order(client, LocalDate.now(), 1, product);
    Order order1 = new Order(client, LocalDate.now(), 2, product);

    orders.add(order);
    orders.add(order1);
  }

  static public String print(){
    String list = "";
    int i = 0;

    for (Order order : orders) {
      list += "\n========== Pedido N° " + (i++) + " =======\n";
      list += order.print() + "\n";
    }

    return list;
  }
}
