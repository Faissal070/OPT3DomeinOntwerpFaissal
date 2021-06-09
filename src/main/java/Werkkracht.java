import java.util.ArrayList;
import java.util.Scanner;

public class Werkkracht {
    private String naam;
    private Integer code;
    private static Double uurloon;
    private Integer bsn;
    private static Integer newCode = 1999;
    private Long telefoonnummer;
    public  Long TijdSeconde = Long.valueOf(0);




    Werkkracht(String naam, Integer code, Double uurloon, Integer bsn, int telefoonnummer) {
        this.naam = naam;
        this.code = code;
        this.uurloon = uurloon;
        this.bsn = bsn;
        this.telefoonnummer = (long) telefoonnummer;



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

    public static double getUurloon() {
        return uurloon;

    }

    public Long getTelefoonnummer() {
        return this.telefoonnummer;
    }

    public Integer getNewCode() {
        newCode += 89;
        return newCode;
    }

    public  Long getTijdSeconde() {
        return TijdSeconde;
    }

    public Integer getBsn() {
        return this.bsn;
    }

    public  Long setTijdSeconde(long seconden) {
        TijdSeconde += seconden;
        return TijdSeconde;
    }


}


