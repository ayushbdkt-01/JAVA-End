class employee{
    String name;
    int id;
    int dep;
    employee(String name,int id,int dep){
        if(!(name.charAt(0)>='A' && name.charAt(0)<='Z')){
            System.out.println("Invalid name");
            System.exit(0);
        }
        else{
            this.name=name;
        }

        if(!(id>=2001 && id<=5001)){
            System.out.println("Invalid Id");
            System.exit(0);
        }
        else{
            this.id=id;
        }
        if(!(dep>=1 && dep<=5)){
            System.out.println("Invalid Department Id");
            System.exit(0);
        }
        else {
            this.dep = dep;
        }
    }
    public void display(){
        System.out.println(this.name);
        System.out.println(this.id);
        System.out.println(this.dep);
    }
}
public class program37 {
    public static void main(String[] args) {
        employee ayush=new employee("Ayush", 5000,3);
        ayush.display();
    }

}