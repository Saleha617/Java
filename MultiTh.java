//Multithreading................................
class Worker extends Thread{
    public void run(){
    try{
        System.out.println("Worker");
        Thread.sleep(2000);
    }
    catch(Exception e){
        System.out.println("Exception :"+e);
    }}
}
public class MultiTh extends Thread
{
	public static void main(String[] args) {
        Worker w=new Worker();
        w.start();
       // System.out.println("Worker thread is alive:"+w.isAlive());
        try{
        System.out.println("thread name:"+Thread.currentThread().getName());        
        System.out.println("Worker thread is alive:"+w.isAlive());
        w.join();
        System.out.println("Worker thread is alive:"+w.isAlive());
        }
        catch(Exception e){
            System.out.println("Exception occured");
        }
        System.out.println("Worker thread is alive after try:"+w.isAlive());
        System.out.println(Thread.currentThread().getName()+"thread is alive:"+Thread.currentThread().isAlive());
	}
}