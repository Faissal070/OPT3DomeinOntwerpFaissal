import java.util.ArrayList;
import java.util.Scanner;

public class Werkkracht {
    private String naam;
    private Integer code;
    private  Double uurloon;
    private static Integer newCode = 1999;
    public Long TijdSeconde = Long.valueOf(0);
    Gegevens gegevens;

    public void setGegevens(Gegevens gegevens) {
        this.gegevens = gegevens;
    }

    public void setUurloon(Double uurloon){
        this.uurloon = uurloon;
    }

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

    public  Double getUurloon(){
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


