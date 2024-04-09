public class BilBruk3 {
    public static void main(String[] args){
        Bil3 bil = new Bil3("HK45632");
        Person Mathea = new Person(bil.hentNummer());

        Mathea.skrivBilnummer();
    }
    

}
