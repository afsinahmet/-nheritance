public class Instructor extends Academician {
    private String doorNumber;

    public Instructor(String nameSurname, String phone, String email, String department, String title, String doorNumber) {
        super(nameSurname, phone, email, department, title);
        this.doorNumber = doorNumber;
    }

    public String getDoorNumber() {
        return this.doorNumber;
    }

    public void setDoorNumber(String doorNumber) {
        this.doorNumber = doorNumber;
    }

    public void meeting(){
        System.out.println(this.getNameSurname()+" toplantıya katıldı.");
    }
    public void doExam(){
        System.out.println(this.getNameSurname()+" sınav yaptı.");
    }
}
