import java.util.*;

public class FestivalApp {
    public static void main(String[] args) {
   
        
        // 1. CREO GLI OGGETTI
        FestivalManager scaletta = new FestivalManager();
        RegistroPartecipanti registro = new RegistroPartecipanti();
       // ControlloB controllo = new ControlloB();
        
        // 2. PREPARO LA SCALETTA
        scaletta.aggiungiArtista("Laura Pausini");
        scaletta.aggiungiArtista("Tiziano Ferro");
        scaletta.aggiungiArtista("Jovanotti");
        scaletta.rimuoviArtista("Tiziano Ferro");  // annulla
        scaletta.inserisciInPosizione(1, "Ospite Sorpresa");
        System.out.println("ARTISTI IN PRIMA SERTATA:");
        scaletta.stampaScalettaartisti();
        
        // 3. VENDO I BIGLIETTI (li registro)
        registro.registraBiglietto("TICK-001", "Marco Rossi");
        registro.registraBiglietto("TICK-002", "Giulia Bianchi");
        registro.registraBiglietto("TICK-003", "Luca Verdi");

        // 4. SIMULO L'ACCESSO DEI PARTECIPANTI
        Biglietti b1 = new Biglietti("Marco Rossi", "TICK-001");
        Biglietti b2 = new Biglietti("Giulia Bianchi", "TICK-002");
        Biglietti b3 = new Biglietti("Luca Verdi", "TICK-003");
        Biglietti b4 = new Biglietti("Mario Neri", "TICK-004");  // biglietto non registrato    
        Biglietti b5 = new Biglietti("Marco Rossi", "TICK-001");  // biglietto già usato    
        System.out.println("\nACCESSO PARTECIPANTI:");
        System.out.println(registro.validaBiglietto(b1));  // valido
        System.out.println(registro.validaBiglietto(b2));  // valido
        System.out.println(registro.validaBiglietto(b3));  // valido
        System.out.println(registro.validaBiglietto(b4));  // non valido
        System.out.println(registro.validaBiglietto(b5));  // già usato
        
        
        // 5. ACCOGLI I PARTECIPANTI (solo quelli con biglietto valido)
        registro.stampaTuttiIBiglietti();
    }
}
       
       
        
       
