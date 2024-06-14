
class calculator{
    public void power(int a,int b) throws  Exception{
        if(a<0 || b<0){
            throw new Exception("Numbers should be non-negative");
        }
        else{
            System.out.println(Math.pow(a,b));
        }
    }
}

public class program38 {
    public static void main(String[] args) {
        calculator ayush=new calculator();
        try{
            ayush.power(-10,2);
        }
        catch(Exception e){
            System.out.println("Exception Found");
        }
    }
}