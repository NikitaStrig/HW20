public class Hw20 {
    private String name;
    private int age;
    private long check;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCheck() {
        return check;
    }

    public void setCheck(long check) {
        this.check = check;
    }

    public Hw20(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Hw20{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", check=" + check +
                '}';
    }

    public Hw20(String name, int age, long check) {
        this.name = name;
        this.age = age;
        this.check = check;
    }
}
