package JAVA.Inheritance;
class selection {

    public  void eng ()
    {
        System.out.println("Great");
    }
}
class worldcup extends  selection{
    public void Ind (){

        worldcup wc = new worldcup();
        System.out.println("zero Team");
    }

}
class winner extends selection {
    public void SL (){
        System.out.println("1996");
    }
}
public class Hirerarchil_inheritance {             //if 1 class is inherited by 2 or more  another classes

    public static void main(String[] args) {

//        worldcup wc = new worldcup();
//
//        wc.Ind();
//        wc.eng();

        winner wr = new winner();

        wr.SL();
        wr.eng();
    }


}
