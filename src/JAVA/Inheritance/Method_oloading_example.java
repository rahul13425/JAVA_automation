package JAVA.Inheritance;

public class Method_oloading_example {

    public String Mobile (String Iphone , String vivo){

        return vivo + Iphone;
    }

    public  String Laptop ( String Dell , String HP, String Lenovo)
    {
        return Dell+ HP+ Lenovo;
    }

    public static void main(String[] args) {

        Method_oloading_example moe= new Method_oloading_example();

        System.out.println(moe.Laptop("yes", "no", "ypp" ));
        System.out.println(moe.Mobile("buy","no"));
    }
}
