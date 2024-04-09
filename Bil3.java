public class Bil3 {
    private String bilnummer;

    public Bil3(String bilnummer) {
        this.bilnummer = bilnummer;
    }

    public String hentNummer() {
        return this.bilnummer;
    }

    public void skrivUt() {
        System.out.println("Jeg er en bil, og har bilnummer: " + this.bilnummer);
    }
}
