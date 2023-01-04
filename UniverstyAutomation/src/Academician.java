public class Academician extends Worker {
    private String department;
    private String title;

    public Academician(String nameSurname, String phone, String email, String department, String title) {
        super(nameSurname, phone, email);
        this.department = department;
        this.title = title;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void attendLesson() {
        System.out.println(this.getNameSurname() + " derse girdi!");
    }

}
