public class Person {
    private String bilnummer;

    public Person(String bilnummer) {
        this.bilnummer = bilnummer;
    }

    private String hentBilnummer() {
        Bil3 bil = new Bil3(this.bilnummer);
        return bil.hentNummer();
    }

    public void skrivBilnummer() {
        System.out.println("Bilnummer: " + this.hentBilnummer());
    }

}