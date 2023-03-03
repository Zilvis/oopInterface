package com.paveldejimas.bazine;
// Klase ZmogusImpl realizuoja interfeisa Zmogus (Igyvendina visus metodus) suteikia kamienus
public class ZmogusImpl implements Zmogus {
    private String lytis;
    private long asmensKodas;
    private String vardas;
    private String pavarde;
    private int amzius;
    private double svoris;
    private double ugis;
    private String plaukuSpalva;

    public ZmogusImpl() {}

    public ZmogusImpl(String lytis, long asmensKodas, String vardas, String pavarde, int amzius, double svoris, double ugis, String plaukuSpalva){
        this.lytis        = lytis;
        this.asmensKodas  = asmensKodas;
        this.vardas       = vardas;
        this.pavarde      = pavarde;
        this.amzius       = amzius;
        this.svoris       = svoris;
        this.ugis         = ugis;
        this.plaukuSpalva = plaukuSpalva;
    }

    @Override
    public String toString() {
        return "Zmogus{" +
                "lytis='" + lytis + '\'' +
                ", asmensKodas=" + asmensKodas +
                ", vardas='" + vardas + '\'' +
                ", pavarde='" + pavarde + '\'' +
                ", amzius=" + amzius +
                ", svoris=" + svoris +
                ", ugis=" + ugis +
                ", plaukuSpalva='" + plaukuSpalva + '\'' +
                '}';
    }

    public void setLytis (String lytis){
        this.lytis = lytis;
    }

    public String getLytis (){
        return lytis;
    }

    public long getAsmensKodas (){
        return asmensKodas;
    }

    public void setVardas (String vardas){
        this.vardas = vardas;
    }

    public String getVardas (){
        return vardas;
    }

    public void setPavarde (String pavarde){
        this.pavarde = pavarde;
    }

    public String getPavarde (){
        return pavarde;
    }

    public void setAmzius (int amzius){
        this.amzius = amzius;
    }

    public int getAmzius (){
        return amzius;
    }

    public void setSvoris (double svoris){
        this.svoris = svoris;
    }

    public double getSvoris (){
        return svoris;
    }

    public void setUgis (double ugis){
        this.ugis = ugis;
    }

    public double getUgis(){
        return ugis;
    }

    public void setPlaukuSpalva (String plaukuSpalva){
        this.plaukuSpalva = plaukuSpalva;
    }

    public String getPlaukuSpalva () {
        return plaukuSpalva;
    }
}
