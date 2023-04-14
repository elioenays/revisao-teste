public class App {
  public static void main(String[] args) {
    OrdersUseCase ordersUseCase = new OrdersUseCase();

    ordersUseCase.createOrder();
    System.out.println(OrdersUseCase.print());
  }
}
