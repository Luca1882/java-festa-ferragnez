import java.util.Scanner;

public class CheckGuest {
  public static void main(String[] args) {
    String[] nomiPartecipanti = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti",
        "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

    //Leggere imput utente
    Scanner scan = new Scanner(System.in);
    System.out.println("Inserisci il tuo nome: ");
    String nomeOspite = scan.nextLine();

    //Variabile di verifica
    Boolean trovato = false ;
    int i = 0;

    //Ciclo per trovare il nome nella lista
    //for (int i = 0; i < nomiPartecipanti.length; i++) {
     /*
      if(nomeOspite.equals(nomiPartecipanti[i])){
        trovato = true;
        break;
      }
    } 
    */ 


    //Ciclo While per trovare il nome nella lista
    while(i < nomiPartecipanti.length){
      if(nomeOspite.equals(nomiPartecipanti[i])){
        trovato = true;
        break;
      }
      i++;
    }
    
    // Condizione e messaggio
    if(trovato){
      System.out.println("Benvenuto alla festa " + nomeOspite);
    } else {
      System.out.println("Non sei nella lista " + nomeOspite );
    }
  }
}
