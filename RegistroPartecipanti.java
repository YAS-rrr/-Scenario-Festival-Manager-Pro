import java.util.HashMap;
import java.util.HashSet;

public class RegistroPartecipanti {
    private HashMap<String, String> mappaBiglietti;  
         private HashSet<String> bigliettiValidati;
    
    public RegistroPartecipanti() {
        mappaBiglietti = new HashMap<>();
          this.bigliettiValidati = new HashSet<>();
    }
    
    
    public void registraBiglietto(String codice, String nome) {
        mappaBiglietti.put(codice, nome);
        bigliettiValidati.add(codice);  
        System.out.println("Registrato: " + codice + " → " + nome);
    }
    
    
    public String cercaPerCodice(String codice) {
        return mappaBiglietti.get(codice);
    }
    
  
    public void accogliPartecipante(String codice) {
        String nome = mappaBiglietti.get(codice);
        if (nome != null) {
            System.out.println(" Benvenuto " + nome + "!");
        } else {
            System.out.println("Accesso Negato! Biglietto non valido.");
        }
    }
    
   
    public void stampaTuttiIBiglietti() {
        System.out.println("=== ELENCO BIGLIETTI ===");
        for (String codice : mappaBiglietti.keySet()) {
            System.out.println(codice + " → " + mappaBiglietti.get(codice));
        }
    }



    public String validaBiglietto(Biglietti biglietto) {
        String codiceBiglietto = biglietto.getCodiceBiglietto();
        if (bigliettiValidati.contains(codiceBiglietto)) {
            return "Biglietto già usato, accesso negato"; 
        } else {
            bigliettiValidati.add(codiceBiglietto);
            return "Biglietto valido, accesso consentito";
        }

    }
}