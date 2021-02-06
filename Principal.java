import java.util.Scanner;
public class Principal{
  static Scanner entrada = new Scanner(System.in);
  public static void main(String[] args) {
    int retornar;

    Dado dado1 = new Dado();
    Dado dado2 = new Dado();
    Juego juego = new Juego();

    do{
      solicitarDatos(dado1, dado2, juego);
      juego.CalcularPuntos(dado1, dado2);
      retornar=mostrarDatos(juego);
    }while(retornar==1);
    
  }
  
  public static void solicitarDatos(Dado dado1, Dado dado2, Juego juego) {

    do{
        System.out.println("\nIngresa el valor de los dados\nDado 1: ");
        dado1.setDado(entrada.nextInt());
      } while (dado1.getDado()<1 || dado1.getDado()>6);
      do{
        System.out.println("Dado 2: ");
        dado2.setDado(entrada.nextInt());
      } while (dado2.getDado()<1 || dado2.getDado()>6);
  }
  
  public static int mostrarDatos(Juego juego) {
    int respuesta=0;

    if(juego.getPuntos()==7 || juego.getPuntos()==11){
       System.out.println("Has ganado");
    }
    if(juego.getPuntos()==2 || juego.getPuntos()==3 || juego.getPuntos()==12){
       System.out.println("Has perdido");
    }
    if (juego.getPuntos()>3 && juego.getPuntos()<11 && juego.getPuntos()!=7){
       do{
          System.out.println("\nHas acumulado " + juego.getPuntosAcumulados()+" puntos");
          System.out.println("¿Quiere seguir jugando?\n1=Si     2=No");
          respuesta=entrada.nextInt();
        } while(respuesta<1 || respuesta>2);
    }
    return respuesta;
  }
  
}