public class Drone implements Entrega {

    private String codigo;
    public Drone() {
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
     @Override
      public void realizarEntrega(String destino) {
    System.out.println("O Drone está realizando uma entrega para: " + destino);

      }
    
}

