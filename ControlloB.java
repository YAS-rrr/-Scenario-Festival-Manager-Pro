import java.util.HashSet;
public class ControlloB{

    private HashSet<String> bigliettiValidati;

    public ControlloB() {
        this.bigliettiValidati = new HashSet<>();
    }

    public String validaBiglietto(Biglietti biglietto) {
        String codiceBiglietto = biglietto.getCodiceBiglietto();
        if (bigliettiValidati.contains(codiceBiglietto)) {
            return "Biglietto già usato, accesso negato"; 
        } else {
            bigliettiValidati.add(codiceBiglietto);
            return "Biglietto valido e ora registrato come validato";
        }
    }

     public int getNumeroPartecipantiUnici() {
        return bigliettiValidati.size();
    }
    
    
    public String stampaCodiciEntrati() {
        StringBuilder sb = new StringBuilder();
        sb.append("Codici dei biglietti validati:\n");
        for (String codice : bigliettiValidati) {
            sb.append(codice).append("\n");
        }
        return sb.toString();
        
    }


}