package JAVA.Inheritance;
//polymorphism
public class Method_overloading {      // if class has 2 or more methods with the same name but differnet argumnets/ parmaeters (type of args, no of arg , sequences of arg must be different)

    public int Apple (int age , int id){

        return age+ id;

    }

    public int Banana ( int roll , int phone , int Dial)
    {
        return roll + phone;
    }

    public static void main(String[] args) {

        Method_overloading mo = new Method_overloading();

        System.out.println(mo.Apple(10, 20));

        System.out.println(mo.Banana(99,34, 76));
    }}
