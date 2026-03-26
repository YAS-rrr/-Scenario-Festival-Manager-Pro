import java.util.*;

public class FestivalApp {
    public static void main(String[] args) {
   
        
        // 1. CREO GLI OGGETTI
        FestivalManager scaletta = new FestivalManager();
        RegistroPartecipanti registro = new RegistroPartecipanti();
        ControlloB controllo = new ControlloB();
        
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
        
        
        // 5. STATISTICHE FINALI
        System.out.println("\n=== STATISTICHE ===");
        System.out.println("Partecipanti unici entrati: " + controllo.getNumeroPartecipantiUnici());
        registro.stampaTuttiIBiglietti();
    }
}
       
       
        
       
