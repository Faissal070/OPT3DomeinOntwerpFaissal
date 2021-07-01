import java.util.ArrayList;
import java.util.Scanner;

public class Werkkracht {
    private String naam;
    private Integer code;

    public void setUurloon(Double uurloon) {
        Werkkracht.uurloon = uurloon;
    }

    private static Double uurloon;
    private static Integer newCode = 1999;
    public Long TijdSeconde = Long.valueOf(0);

    public void setGegevens(Gegevens gegevens) {
        this.gegevens = gegevens;
    }

    Gegevens gegevens;

    Werkkracht(){

    }


    Werkkracht(String naam, Integer code) {
        this.naam = naam;
        this.code = code;

    }

    public String getNaam() {
        return this.naam;
    }

    public Integer getCode() {
        return this.code;
    }

    public String toString() {
        return naam + " " + code;
    }

    public static Double getUurloon(){
        return uurloon;
    }
    public static Integer getNewCode() {
        newCode += 89;
        return newCode;
    }
    public  Long getTijdSeconde() {
        return TijdSeconde;
    }

    public  Long setTijdSeconde(long seconden) {
        TijdSeconde += seconden;
        return TijdSeconde;
    }


}


