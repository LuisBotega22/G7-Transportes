public class Drone implements Entrega {


    private String codigo;
    private String modelo;

    public Drone() {
    }
     public String getCodigo() {
        return codigo;
    }
    public String getModelo() {
        return modelo;
    }
     public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
     @Override
      public void realizarEntrega(String destino) {
    System.out.println("O Drone está realizando em rota para: " + destino);

      }
    
}

