import java.util.*;



abstract class temperature{
    double temp;
    void setTemp(double temp){
        this.temp=temp;
    }
    abstract void changeTemp();
}




class farenhite extends temperature{
    void changeTemp(){
        double f=((9/5.0)*this.temp)+32;
        System.out.println("Farenhite: "+f);
    }  
}




public class program35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        farenhite maksood=new farenhite();

        System.out.println("Enter temperatue in celcius: ");
        int c=sc.nextInt();

        maksood.setTemp(c);
        maksood.changeTemp();

        sc.close();
    }
    
}