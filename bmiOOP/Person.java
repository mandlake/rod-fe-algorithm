package bmiOOP;

public class Person {
    private String name;
    private double height;
    private double weight;
    private double bmi;

    private String bodyMass;

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWeight() {
        return this.weight;
    }

    public double getBmi() {
        return this.bmi;
    }

    public String getBodyMass() {
        return this.bodyMass;
    }

    public void createBmi() {
        double bmi = weight/((height/100) * (height/100));
        this.bmi = bmi;
    }

    public void createBodyMass() {
        String bodyMass = "";
        if(bmi >= 150) {
            bodyMass = "초고도비만";
        } else if(bmi >= 99.1) {
            bodyMass = "비만";
        } else if(bmi >= 70.3) {
            bodyMass = "과체중";
        } else if(bmi >= 30) {
            bodyMass = "정상";
        } else {
            bodyMass = "저체중";
        }
        this.bodyMass = bodyMass;
    }
}
