public class Bil2 {

    private String bilnummer;

    public Bil2(String bilnummer) {
        this.bilnummer = bilnummer;
    }

    public void skrivUt() {
        System.out.println("Jeg er en bil, og har bilnummer: " + this.bilnummer);
    }
}
