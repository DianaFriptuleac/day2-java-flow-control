package WhilePackage;

import java.util.Scanner;

public class WhileClass {

    public static void insertString(){
        Scanner scanner = new Scanner(System.in);
        String mystring;

        //while
        while(true){
            System.out.println("Inserisci una stringa oppure :q per uscire dal loop.");
            mystring=scanner.nextLine();

            //Controllo del :q

            if(mystring.equals(":q")){
                System.out.println("Sei uscito dal loop!");
                break;
            }


         // Suddivido la stringa in caratteri
            // StringBuilder classe di java che consente di modificare il contenuto senza creare nuovi oggetti

           StringBuilder result = new StringBuilder(); // Inizializzo una stringa vuota
           for (int i = 0; i < mystring.length(); i++) {
             result.append(mystring.charAt(i)); // Concateno ogni carattere alla stringa result
              if (i < mystring.length() - 1) {
                result.append(", "); // Aggiungo la virgola se non è l'ultimo carattere
                }
            }
            System.out.println("La stringa suddivisa è " + result);
        }
    }
}
