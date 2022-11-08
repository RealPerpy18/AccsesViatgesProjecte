package Objects;

public class Localitat {
    int idLocalitat;
    String nom;
    String pais;
    String abreviacio;

    public Localitat() {
    }

    public Localitat(int id_localitat, String nom, String pais, String abreviacio) {
        this.idLocalitat = id_localitat;
        this.nom = nom;
        this.pais = pais;
        this.abreviacio = abreviacio;
    }

    public int getIdLocalitat() {
        return idLocalitat;
    }

    public void setIdLocalitat(int idLocalitat) {
        this.idLocalitat = idLocalitat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getAbreviacio() {
        return abreviacio;
    }

    public void setAbreviacio(String abreviacio) {
        this.abreviacio = abreviacio;
    }
}
