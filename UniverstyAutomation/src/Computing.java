public class Computing extends Officer {
    private String duty;

    public Computing(String nameSurname, String phone, String email, String unit, String shift, String duty) {
        super(nameSurname, phone, email, unit, shift);
        this.duty = duty;
    }

    public String getDuty() {
        return this.duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public void networkSetup() {
        System.out.println(this.getNameSurname() + " network kurulumu yaptı.");
    }


}
