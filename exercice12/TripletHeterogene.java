package exercice12;

public class TripletHeterogene<P,L,S>{
  private P element1;
  private L element2;
  private S element3;

  public TripletHeterogene(P element1, L element2, S element3){
    this.element1 = element1;
    this.element2 = element2;
    this.element3 = element3;
  }

  public P getPremier(){
    return element1;
  }

  public L getSecond(){
    return element2;
  }

  public S getTroisieme(){
    return element3;
  }

  public void afficher(){
    System.out.println("<premier : " + element1 + ", second : " + element2+ ", troisieme : " + element3 + ">.");
  }
}