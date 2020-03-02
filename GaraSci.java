public class GaraSci{
  private String [] nome;
  private int [] naz;

  public GaraSci(int nRag){
    nome=new String [nRag];
    naz=new int [nRag];
  }

  public void riempiArray(int i, String nom, int nazione){
    nome[i]=nom;
    naz[i]=nazione;
  }

  public String classificaGenerale(){
    int i=0, uguale=0;
    String testo="";
    for(i=0;i<naz.length;i++){
      if(naz[i]!=-1){
        uguale=naz[i];
        testo+="\n"+(i+1)+" - "+nome[i]+"\n";
        for(int j=i+1;j<naz.length;j++){
          if(naz[j]==uguale){
            testo+=(j+1)+ " - "+nome[j]+"\n";
            naz[j]=-1;
          } 
        }
      }
    }
    return testo;
  }

  public String podio(){
    String testo="";
    for(int i=0; i<3;i++){
      testo+=(i+1)+ " - " + nome[i]+"\n";
    }
    return testo;
  }
}