package memberOOP;

public class Member {
    private String id;
    private String pw;
    private String pwAgain;
    private String name;
    private String personId;
    private String phoneNumber;
    private String address;
    private String job;

    public void setId(String id) {
        this.id = id;
    }
    public void setPw(String pw) {
        this.pw = pw;
    }
    public void setPwAgain(String pwAgain) {
        this.pwAgain = pwAgain;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPersonId(String personId) {
        this.personId = personId;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setJob(String job) {
        this.job = job;
    }

    public String getId(){
        return this.id;
    }

    public String getPw(){
        return this.pw;
    }

    public String getPwAgain(){
        return this.pwAgain;
    }

    public String getName(){
        return this.name;
    }

    public String getPersonId(){
        return this.personId;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getAddress(){
        return this.address;
    }

    public String getJob(){
        return this.job;
    }

}
