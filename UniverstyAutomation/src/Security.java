public class Security extends Officer {
    private String certificate;

    public Security(String nameSurname, String phone, String email, String unit, String shift, String certificate) {
        super(nameSurname, phone, email, unit, shift);
        this.certificate = certificate;
    }

    public String getCertificate() {
        return this.certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public void guard() {
        System.out.println(this.getNameSurname() + " nöbetine başladı.");
    }
}
