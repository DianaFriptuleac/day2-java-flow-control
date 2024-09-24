package SwitchPackage;

public class SwitchClass {

    public static String switchMethod (int nr) {
        String result;
        switch (nr) {
            case 0:
                result = "Zero";
                break;
            case 1:
                result = "Uno";
                break;
            case 2:
                result = "Due";
                break;
            case 3:
                result = "Tre";
                break;
            default:
                result = "Il numero non è valido";
        }
        return result;
    }
}
