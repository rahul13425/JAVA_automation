package JAVA;

public class Classes_Objects {
    int age;  //Global variable

    public  void employee(String name, int age) {// Local variable
        this.age=age;
        System.out.println(name);
    }

    public void Display_age(){
        System.out.println("age is displayed "+ age);
    }

    public void student(){
//        age=50;
        System.out.println(age);
    }

    public static void main(String[] args) {

        Classes_Objects so = new Classes_Objects();

         so.employee("Satya",56);
         so.Display_age();

//         so.student();


    }
}
