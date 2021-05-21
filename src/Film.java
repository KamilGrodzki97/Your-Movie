
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 48725
 */
@XmlRootElement(name="filmy")
public class Film {
    int ID;
    String Tytul;
    String Opis;
    String Rezyser;
    String Premiera;
    String Gatunek;
    List<Aktorzy> listaAktorow = new ArrayList<>();
    int Ilosc;
    int Czas;
    double Cena;

    public Film(){}
    
    public Film(int ID, String Tytul, String Opis, String Rezyser, String Premiera, String Gatunek, int Ilosc, int Czas, double Cena) {
        this.ID = ID;
        this.Tytul = Tytul;
        this.Opis = Opis;
        this.Rezyser = Rezyser;
        this.Premiera = Premiera;
        this.Gatunek = Gatunek;
        this.Ilosc = Ilosc;
        this.Czas = Czas;
        this.Cena = Cena;
        this.listaAktorow = new ArrayList<Aktorzy>();
    }

    

    

    @XmlAttribute(name="id")
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @XmlAttribute(name="tytul")
    public String getTytul() {
        return Tytul;
    }

    public void setTytul(String Tytul) {
        this.Tytul = Tytul;
    }

    @XmlAttribute(name="opis")
    public String getOpis() {
        return Opis;
    }

    public void setOpis(String Opis) {
        this.Opis = Opis;
    }

    @XmlAttribute(name="rezyser")
    public String getRezyser() {
        return Rezyser;
    }

    public void setRezyser(String Rezyser) {
        this.Rezyser = Rezyser;
    }

    @XmlAttribute(name="premiera")
    public String getPremiera() {
        return Premiera;
    }

    public void setPremiera(String Premiera) {
        this.Premiera = Premiera;
    }

    @XmlAttribute(name="gatunek")
    public String getGatunek() {
        return Gatunek;
    }

    public void setGatunek(String Gatunek) {
        this.Gatunek = Gatunek;
    }

    @XmlElements(@XmlElement(name="imieinazwisko"))
    public List<Aktorzy> getListaAktorow() {
        return listaAktorow;
    }

    public void setListaAktorow(List<Aktorzy> listaAktorow) {
        this.listaAktorow = listaAktorow;
    }

    @XmlAttribute(name="iloscsztuk")
    public int getIlosc() {
        return Ilosc;
    }

    public void setIlosc(int Ilosc) {
        this.Ilosc = Ilosc;
    }

    @XmlAttribute(name="czas")
    public int getCzas() {
        return Czas;
    }

    public void setCzas(int Czas) {
        this.Czas = Czas;
    }

    @XmlAttribute(name="cena")
    public double getCena() {
        return Cena;
    }

    public void setCena(double Cena) {
        this.Cena = Cena;
    }

    
    
    
}
