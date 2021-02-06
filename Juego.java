public class Juego {
  private int puntos;
  private int puntosAcumulados;

  public void CalcularPuntos(Dado dado1, Dado dado2) {
    puntos=dado1.getDado()+dado2.getDado();
    puntosAcumulados+=puntos;
  }

  public int getPuntos(){
    return puntos;
  } 

  public int getPuntosAcumulados(){
    return puntosAcumulados;
  }
  
} 