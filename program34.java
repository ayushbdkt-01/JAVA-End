abstract class shape{
    abstract void rectangleArea(int l,int b);
    abstract void squareArea(int side);
    abstract void circleArea(int r);
}

class area extends shape{
    void rectangleArea(int l,int b){
        System.out.println("Area of rectangele: "+l*b);
    }
    void squareArea(int side){
        System.out.println("Area of square: "+side*side);
    }
    void circleArea(int r){
        System.out.println("Area of circle: "+3.14*r*r);
    }
}


public class program34 {
    public static void main(String[] args) {
        area maksood=new area();
        maksood.rectangleArea(10, 9);
        maksood.squareArea(5);
        maksood.circleArea(2);
    }
    
}