public class Main {

    public static void main(String[] args) {

   Moto moto = new Moto();
   Carro carro = new Carro();
   Drone drone = new Drone();

   System.out.println("===================DADOS DOS VEÍCULOS===================");
   moto.setModelo("Honda CG 160");
   moto.setPlaca("ABC-1234");
   moto.setCilindradas(160);
   moto.setAno(2018);

   carro.setModelo("Renault Sandero");
   carro.setPlaca("MMI2F49");
   carro.setPortas(4);
   carro.setAno(2015);

   drone.setCodigo("3544");
   drone.setModelo("DJI Mini 2");

   moto.exibirDados();
   carro.exibirDados();


    System.out.println("===================ENDEREÇOS DE ENTREGA===================");
   moto.realizarEntrega("Tubarão");
   carro.realizarEntrega("Orleans");
   drone.realizarEntrega("Florianópolis");

    }

}