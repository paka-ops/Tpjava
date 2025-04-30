public abstract class  User {

    private long id;
    private String name;
    private  String mail;
    private String password;

    public User(long id, String name, String mail,String password){
        this.id=id;
        this.name=name;
        this.mail=mail;
        this.password=password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}