public class LabAssistant extends Assistant {

    public LabAssistant(String nameSurname, String phone, String email, String department, String title, String officeTime) {
        super(nameSurname, phone, email, department, title, officeTime);
    }

    public void attendLab() {
        System.out.println(this.getNameSurname() + " labaratuvara katıldı.");
    }
}
