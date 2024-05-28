package JAVA.Inheritance;
 class BCCI {                  //class define

    public void IPL (){         // method define

        System.out.println("Fixing is going on");
    }
}
 class AUS extends BCCI {              //code re-usability
     public void Champ (){
         System.out.println("legend");
     }
}
public class multilevel2 extends AUS{

     public void  Trophy (){

         System.out.println("Winner is :  ");
     }

    public static void main(String[] args) {

//        BCCI bc = new BCCI();
//        bc.IPL();

//        AUS as = new AUS();
//         as.IPL();
//         as.Champ();

       multilevel2 ml = new multilevel2();

       ml.Champ();
       ml.IPL();
       ml.Trophy();



    }
}
