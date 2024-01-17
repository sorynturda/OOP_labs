class Multithred extends Thread{
    public void run(){
        try{
            System.out.println("Thread " + this.threadId());
        }catch (Exception e){
            System.out.println("Ecpetie");
        }
    }
}

public class Main {
    public static void main(String[] args){
        int n=8;
        for(int i=0;i<n;i++){
            Multithred obj = new Multithred();
            obj.start();
        }
    }
}