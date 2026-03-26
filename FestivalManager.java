import java.util.ArrayList;

public class FestivalManager {
    private ArrayList<String> artisti;
    
    public FestivalManager() {
        artisti = new ArrayList<>();
    }
    
  
    public void aggiungiArtista(String nome) {
        artisti.add(nome);
    }
    
   
    public void rimuoviArtista(String nome) {
        artisti.remove(nome);
    }
    
    
    public void inserisciInPosizione(int posizione, String nome) {
        artisti.add(posizione+1, nome);
    }
    

    public String stampaScalettaartisti() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== SCALETTA ARTISTI ===\n");
        for (int i = 0; i < artisti.size(); i++) {
            sb.append((i+1) + ". " + artisti.get(i) + "\n");
        }
        return sb.toString();
    }
    
    
    public ArrayList<String> getArtisti() {
        return artisti;
    }

}