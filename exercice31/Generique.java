package exercice31;

public class Generique{
  public static <T> T retournerTab(T[] tableau){
    return tableau[(int)(Math.random() + tableau.length)];
  }

  public static <T> T alea(T a, T b){
    return Math.random() > 0.5 ? a : b;
  }
}