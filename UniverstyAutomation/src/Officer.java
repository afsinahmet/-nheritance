public class Officer extends Worker {
    private String unit;
    private String shift;

    public Officer(String nameSurname, String phone, String email, String unit, String shift) {
        super(nameSurname, phone, email);
        this.unit = unit;
        this.shift = shift;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getShift() {
        return this.shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public void work() {
        System.out.println(this.getNameSurname() + " çalışmaya başladı!");
    }
}
