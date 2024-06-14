class program40{
    public static void main(String[] args) {
        Runnable cs=new MyRunnable("CS");
        Runnable it=new MyRunnable("IT");

        Thread csThread=new Thread(cs);
        Thread itThread=new Thread(it);

        csThread.start();
        itThread.start();
    }
}


class MyRunnable implements Runnable{
    String name;
    int count=0;

    MyRunnable(String name){
        this.name=name;
    }

    @Override
    public void run(){
        try{
            while(true){
                Thread.sleep(500);
                count++;
                System.out.println("COunt is: "+count);
            }
        }
        catch(Exception e){
            System.out.println("Exception Found");
        }
    }
}