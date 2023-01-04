public class Assistant extends Academician {
    private String officeTime;

    public Assistant(String nameSurname, String phone, String email, String department, String title, String officeTime) {
        super(nameSurname, phone, email, department, title);
        this.officeTime = officeTime;
    }

    public String getOfficeTime() {
        return officeTime;
    }

    public void setOfficeTime(String officeTime) {
        this.officeTime = officeTime;
    }
    public void doQuiz(){
        System.out.println(this.getNameSurname()+" quiz yaptı.");
    }
}
