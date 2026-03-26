public class Biglietti {
    private String nomePartecipante;
    private String codiceBiglietto;

    public Biglietti(String nomePartecipante, String codiceBiglietto) {
        this.nomePartecipante = nomePartecipante;
        this.codiceBiglietto = codiceBiglietto;
    }

    public String getNomePartecipante() {
        return nomePartecipante;
    }

    public String getCodiceBiglietto() {
        return codiceBiglietto;
    }

    public String toString() {
        return "Biglietto{" +
                "nomePartecipante='" + nomePartecipante + '\'' +
                ", codiceBiglietto='" + codiceBiglietto + '\'' +
                '}';
    }
}