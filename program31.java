import java.util.*;

class bank{
    String name;
    String address;
    int accNo;
    int bal;

    bank(String name,String address,int accNo,int bal){
        this.name=name;
        this.address=address;
        this.bal=bal;
        this.accNo=accNo;
    }
    void setAccNo(int n){
        this.accNo=n;
    }
    void display(){
        System.out.println(this.name);
        System.out.println(this.accNo);
        System.out.println(this.address);
        System.out.println(this.bal);
    }
    void deposit(int amount){
        this.bal+=amount;
        System.out.println("Updated AMount is: "+this.bal);
    }
    void withdraw(int amount){
        bal-=amount;
    }
    void changeAddress(String newAddress){
        this.address=newAddress;
        System.out.println("Updated Address is: "+this.accNo);
    }

}


public class program31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of persons: ");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.println("Enter details of the "+i+"th account holder: ");
            String name=sc.next();
            String address=sc.next();
            int bal=sc.nextInt();
            int accNo=sc.nextInt();
            bank sbi=new bank(name,address,accNo,bal);
            sbi.display();
        }

        sc.close();
    }
    
}