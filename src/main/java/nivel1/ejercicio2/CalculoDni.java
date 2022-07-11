package nivel1.ejercicio2;

/*
Crea una clase llamada CalculoDni que calcule la letra del DNI al recibir el número como parámetro.
Crea una clase jUnit que verifique su correcto funcionamiento, parametrizándola para que el test reciba
        un espectro de datos amplio y valide si el cálculo es correcto para 10 números de DNI predefinidos.
*/

public class CalculoDni {
    public static String Letra(int dniNumbers){
        int restoDni = 0;
        restoDni = dniNumbers % 23;
        String letraEncontrada="";
        String[] letters = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        letraEncontrada = letters[restoDni];
        return letraEncontrada;
    }
}
