import java.util.HashMap;

public class RegistroPartecipanti {
    private HashMap<String, String> mappaBiglietti;  // codice → nome
    
    public RegistroPartecipanti() {
        mappaBiglietti = new HashMap<>();
    }
    
    
    public void registraBiglietto(String codice, String nome) {
        mappaBiglietti.put(codice, nome);
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
}