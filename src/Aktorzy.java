
import javax.xml.bind.annotation.XmlAttribute;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 48725
 */
public class Aktorzy {
    String imieINazwisko;

    public Aktorzy(String imieINazwisko) {
        this.imieINazwisko = imieINazwisko;
    }

    @XmlAttribute(name="imieinazwisko")
    public String getImieINazwisko() {
        return imieINazwisko;
    }

    public void setImieINazwisko(String imieINazwisko) {
        this.imieINazwisko = imieINazwisko;
    }
    
    
}
