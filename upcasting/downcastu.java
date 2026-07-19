package upcasting;

public class downcastu extends upcastu {
    public static void main(String[] args) {
        upcastu up = new downcastu();
        downcastu shreyababy = (downcastu) up;
        //downcastu dp = new downcastu();
       shreyababy.task();
        
    }

    
    public static  void task(){
        System.out.println("task of child class");
    }
}

