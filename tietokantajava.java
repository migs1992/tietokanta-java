import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HenkilonHaku {
    public static void main(String[] args) {
        // Luodaan yksinkertainen tietokanta henkilöistä nimen perusteella.
        Map<String, String> tietokanta = new HashMap<>();
        tietokanta.put("Matti", "Mallikas");
        tietokanta.put("Anna", "Esimerkki");
        tietokanta.put("Pekka", "Testaaja");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Syötä etsittävän henkilön nimi: ");
        String nimi = scanner.nextLine();

        if (tietokanta.containsKey(nimi)) {
            String sukunimi = tietokanta.get(nimi);
            System.out.println("Henkilö löytyi: " + nimi + " " + sukunimi);
        } else {
            System.out.println("Henkilöä ei löytynyt tietokannasta.");
        }

        scanner.close();
    }
}
