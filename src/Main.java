import SwitchPackage.SwitchClass;
import WhilePackage.WhileClass;

import java.util.Scanner;

import static ForPackage.ForClass.contoAllaRovescia;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------Ex1--------------------------");

        System.out.println("Stringa pari o dispari");
        String cityString = stringaPariDispari("Bologna");
        System.out.println(cityString);

        System.out.println("Anno bisestile o non bisestile");
        int anno = 2024;
        System.out.println(anno + " è un anno " + (annoBisestile(anno) ? "bisestile" : "non bisestile"));


        System.out.println("-------------------------Ex2--------------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero da 0 a 3: ");
        int numero = scanner.nextInt();
        String switchResult = SwitchClass.switchMethod(numero);
        System.out.println("Il numero è " + switchResult);


        System.out.println("-------------------------Ex3---------------------------");

        WhileClass.insertString();

        System.out.println("-------------------------Ex4---------------------------");

       System.out.println("Inserisci un numero per il conto alla rovescia: ");
       int myNum = scanner.nextInt();
        contoAllaRovescia(myNum);

    }

    //--------------------------Ex1-if-else if-------------------------------
    //--------------------------Stringa pari o dispari-----------------------
    public static String stringaPariDispari(String city){
        if(city.length() % 2 == 0 ){
            return city + " è " + true;
        }else{
            return city+ " è " + false;
        }
    }

    //-------------------------Anno Bisestile--------------------------------
    public static boolean annoBisestile(int anno) {
        if (anno % 4 == 0) {
            if (anno % 100 == 0) {
                if (anno % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
            }else{
                return false;
            }
        }
    }

