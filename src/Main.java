import com.paveldejimas.bazine.ZmogusImpl;

public class Main {
    public static void main(String[] args) {

        ZmogusImpl zmogus = new ZmogusImpl();
        zmogus.setVardas("Arnas");
        zmogus.setPavarde("Baravykas1");
        zmogus.setAmzius(22);
        zmogus.setLytis("Vyras");
        zmogus.setSvoris(88.2);
        zmogus.setUgis(1.90);
        zmogus.setPlaukuSpalva("Juodi");

        ZmogusImpl zmogus2 = new ZmogusImpl("Vyras",  39206111432L,  "Petras","Slidzius",30,86.3,190.0,"Rudi");
        ZmogusImpl zmogus3 = new ZmogusImpl("Moteris",61206121466L,  "Ona",   "Butke",   53,70.1,175,  "Raudoni" );
        ZmogusImpl zmogus4 = new ZmogusImpl("Vyras",  4562061231466L,"Rodis", "Radzis",  70,95,  190,  "Ryzi");
        ZmogusImpl zmogus5 = new ZmogusImpl("Vyras",  61206121466L,  "Tomas", "Nesvarbu",18,60,  150,  "Juodi" );

        System.out.println(zmogus2+ "\n");
        System.out.println(zmogus);
    }
}
//        1.2. Pervadinti 'Zmogus' klasę į 'ZmogusImpl'.
//        1.3. Sukurti interface 'Zmogus' (su 'Zmogus' klasės get'erių ir set'erių antraštėmis);
//        1.4. Klasė 'ZmogusImpl' turi realizuoti interface 'Zmogus'.