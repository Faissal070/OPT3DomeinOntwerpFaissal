import java.util.ArrayList;
import java.util.Scanner;

public class Werkkracht {
    private String naam;
    private Integer code;
    private static Double uurloon;
    private static Integer newCode = 1999;
    public Long TijdSeconde = Long.valueOf(0);
    Gegevens gegevens;

    Werkkracht(){

    }


    Werkkracht(String naam, Integer code, Double uurloon, Gegevens gegevens) {
        this.naam = naam;
        this.code = code;
        this.gegevens = gegevens;
        this.uurloon = uurloon;

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


