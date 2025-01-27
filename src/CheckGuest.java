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

    //Ciclo per trovare il nome nella lista
    for (int i = 0; i < nomiPartecipanti.length; i++) {
      if(nomeOspite.equals(nomiPartecipanti[i])){
        trovato = true;
        break;
      }
    } 
    
    if(trovato){
      System.out.println(String.format("E' nella lista, si diverta %s!", nomeOspite));
    } else {
      System.out.println(String.format("Non è nella lista %s!",  nomeOspite ));
    }
  }
}
