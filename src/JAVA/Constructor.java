package JAVA;

public class Constructor {
    String name;
    int age;

    public Constructor(String name, int age) {      // Parameterized constructor
        this.name = name;
        this.age = age;

    }

    public void Displaying() {
        System.out.println("Name " + name + " Age " + age);


    }

    public static void main(String[] args) {
        Constructor con=new Constructor("rahul",15);
        con.Displaying();
    }

}

