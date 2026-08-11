public class Carro extends Veiculo implements Entrega {

   private int portas;
   public Carro() {
    super();  
   }
   public int getPortas() {
    return portas;
   }
   public void setPortas(int portas) {
    this.portas = portas;
   }

    @Override
    public void realizarEntrega(String destino) {
    System.out.println("O carro está realizando uma entrega para: " + destino);

    }

}

