public class Gegevens {
    private Integer bsn;
    private Long telefoonnummer;

    Gegevens( Integer bsn, int telefoonnummer) {
        this.bsn = bsn;
        this.telefoonnummer = (long) telefoonnummer;

    }
    public Long getTelefoonnummer() {
        return this.telefoonnummer;
    }

    public Integer getBsn() {
        return this.bsn;
    }
}
