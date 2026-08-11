public class Moto extends Veiculo implements Entrega {
    private int cilindradas;
    public Moto() {
    super();
   }
    public int getCilindradas() {
        return cilindradas;
    }
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
    @Override
    public void realizarEntrega(String destino) {
    System.out.println("A moto está realizando uma entrega para: " + destino);

    }


    
}
