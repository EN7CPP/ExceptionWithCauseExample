import java.util.*;
class MyException extends Exception{
    public MyException(){
        super("Nothing here");
    }
    public MyException(String s){
        super(s);
    }
    
    public String getMessage(){
        return super.getMessage();
    }
    
    
}

public class MyClass {
    public static void main(String args[]) {
     
     try{
         Throwable t=new Throwable("Here");
         Throwable other =new Throwable("Done",t);
         throw other;
        
     }
     catch(Throwable e){
         System.out.println(e.getCause());
     }
    }
}
