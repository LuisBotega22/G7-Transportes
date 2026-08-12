public class Main {

    public static void main(String[] args) {

   Moto moto = new Moto();
   Carro carro = new Carro();
   Drone drone = new Drone();

   System.out.println("===================DADOS DE ENTREGA===================");
   moto.setPlaca("ABC-1234");
   moto.setModelo("Honda CG 160");
   moto.setCilindradas(160);
   moto.setAno(2018);

   carro.setPlaca("MMI2F49");
   carro.setModelo("Renault Sandero");
   carro.setPortas(4);
   carro.setAno(2015);

   drone.setCodigo("3544");

   moto.exibirDados();
   carro.exibirDados();
    }

}