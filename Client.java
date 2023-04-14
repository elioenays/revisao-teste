class Client {
  private String name;
  private String cpf;
  private String address;

  public Client(String name, String cpf, String address){
    this.name = name;
    this.cpf = cpf;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String print(){
    return name + "\nCPF: " + cpf;
  }
}
