public class Automobil {

    private int km;

    private int anProducere;

    private String denumire;

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        if(km < 0) {
            System.out.println("Nu putem seta km negativ");
        } else {
            this.km = km;
        }
    }

    public int getAnProducere() {
        return anProducere;
    }

    public void setAnProducere(int anProducere) {
        if(anProducere < 0) {
            System.out.println("Nu putem seta anProducere negativ");
        } else {
            this.anProducere = anProducere;
        }
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        if(denumire.contains("BMW") || denumire.contains("Mercedes")) {
            this.denumire = denumire;
        }  else {
            System.out.println("nu este bmw sau Mercedes");
        }

    }
}
