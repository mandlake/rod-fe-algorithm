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
    private double height;
    private double weight;

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

    public void setHeight(double height){
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
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

    public double getHeight() {
        return this.height;
    }

    public double getWeight() {
        return this.weight;
    }

    // 회원가입 시 생성
    public Member(String id, String pw, String pwAgain,
                  String name, String personId, String phoneNumber,
                  String address, String job)
    {
        this.id = id;
        this.pw = pw;
        this.pwAgain = pwAgain;
        this.name = name;
        this.personId = personId;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.job = job;
    }

    // bmi 계산 시 이용
    public Member(double height, double weight)
    {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", personId='" + personId + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
