package GradeOOP;

public class Student {
    private String name;
    private int korea;
    private int english;
    private int math;

    private double average;

    public void setName(String name) {
        this.name = name;
    }

    public void setKorea(int korea) {
        this.korea = korea;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public String getName() {
        return this.name;
    }

    public int getKorea() {
        return this.korea;
    }

    public int getEnglish() {
        return this.english;
    }

    public int getMath() {
        return this.math;
    }

    public double getAverage() {
        return this.average;
    }

    public void createAverage() {
        double average = (korea + english + math) / 3;
        this.average = average;
    }
}
