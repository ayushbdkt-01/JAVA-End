import java.util.*;


interface shape{
    abstract void volume();
}



class cone implements shape{
    int r,h;
    cone(int r,int h){
        this.r=r;
        this.h=h;
    }
    public void volume(){
        System.out.println("Volume of cone: "+(1/3.0)*3.14*r*r*h);
    }
}



class hemisphere implements shape{
    int r;
    hemisphere(int r){
        this.r=r;
    }
    public void volume(){
        System.out.println("Volume of hemisphere: "+(2/3.0)*3.14*r*r*r);
    }
}



class cylinder implements shape{
    int r,h;
    cylinder(int r,int h){
        this.r=r;
        this.h=h;
    }
    public void volume(){
        System.out.println("Volume of cylinder: "+3.14*r*r*h);
    }
}



public class program36 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        cone maksood1=new cone(2,3);
        hemisphere maksood2=new hemisphere(5);
        cylinder maksood3=new cylinder(3,6);

        maksood1.volume();
        maksood2.volume();
        maksood3.volume();

        sc.close();
    }   
}