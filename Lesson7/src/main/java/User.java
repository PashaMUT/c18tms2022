public class User {
    public String name;
    public String surname;
    public int age;
    public String sex;
    public String city;


    public User(String name , String surname) {
        this.name = name;
        this.surname = surname;
    }

    public User(int age) {
        this.age = age+1;
    }

    public User(String name , String surname , int age , String sex) {
        this(name, surname);
        this.age = age;
        this.sex = sex;
    }

    public User(String city) {
        this.city = city;
    }


    @Override
    public String toString() {
        return age + " " + name + " " + surname + " " + sex;
    }
}