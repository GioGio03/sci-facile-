import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("Inserisci il numero di atlete:");
    int nRag=in.nextInt();
    GaraSci miaGara=new GaraSci(nRag);
    for(int i=0;i<nRag;i++){
      System.out.println("Inserisci il nome dell'atleta:");
      String nom=in.next();
      System.out.println("Inserisci la nazione dell'atleta:");
      int nazione=in.nextInt();
      miaGara.riempiArray(i, nom, nazione);
    }
    System.out.println("Classifica generale:" + miaGara.classificaGenerale());
    System.out.println("Podio:"+miaGara.podio());
  }
}