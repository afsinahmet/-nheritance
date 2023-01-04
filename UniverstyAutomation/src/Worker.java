public class Worker {
    private String nameSurname;
    private String phone;
    private String email;

    public Worker(String nameSurname, String phone, String email) {
        this.nameSurname = nameSurname;
        this.phone = phone;
        this.email = email;
    }

    public String getNameSurname() {
        return this.nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void login() {
        System.out.println(this.nameSurname + " üniversiteye giriş yaptı!");
    }

    public void exit() {
        System.out.println(this.nameSurname + " üniversiteden çıkış yaptı! ");
    }

    public void refactory() {
        System.out.println(this.nameSurname + " yemekhaneye giriş yaptı!");
    }
}
