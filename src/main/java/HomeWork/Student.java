package HomeWork;

public class Student {

    protected String name = "Mete";
    protected String surname = "Han";
    protected int age = 25;

    public Student(int age) {
        this.age = age;

    }

    public Student() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        char firsIndex = this.name.charAt(0);
        String allCharc = this.name.replaceAll(this.name, "*");
        String full = String.valueOf(firsIndex).concat(allCharc);
        name = full;
        return name;

    }

    public void setName(String name) {
        this.name = name;

    }

    public String getSurname() {
        char firsIndex = this.surname.charAt(0);
        String allCharc = this.surname.replaceAll(this.surname, "*");
        String full = String.valueOf(firsIndex).concat(allCharc);
        surname = full;
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;

    }

    public void setAge(int age) {

        while (true) {
            if (age < 0) {
                age = 9999;
            } else {
                break;
            }
        }
        this.age = age;
    }
}
