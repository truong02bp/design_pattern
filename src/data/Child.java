package data;

public class Child {
    private double age;
    private String sex;
    private double height;
    private double weight;
    private String status;

    public Child(double height, double weight, String status) {
        this.height = height;
        this.weight = weight;
        this.status = status;
    }

    public Child(double age, String sex, double height, double weight, String status) {
        this.age = age;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
        this.status = status;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return sex + "," + age + "," + height + "," + weight + "," + status;
    }
}
