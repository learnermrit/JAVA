// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Bus{
    int regdno, model, capacity;
    Bus(){
    System.out.println("Bus class constructor called");
    }
    void showbusdetails(){
        System.out.println("registration no= "+ regdno);
        System.out.println("Model= "+ model);
        System.out.println("Capicity= " +capacity);
    }
}
class PublicBus extends Bus{
    String owner, from, to;
    String depttime,arrivaltime;
    PublicBus(){
     System.out.println("PublicBus class constructor called");
    }
  void  showbusdetails(){
        System.out.println("registration no= "+ regdno);
        System.out.println("Model= "+ model);
        System.out.println("Capicity" +capacity);
        System.out.println("Owner ="+ owner);
        System.out.println("From= "+ from);
        System.out.println("to= "+to);
        System.out.println("depttime= "+ depttime);
        System.out.println("arrivaltime= "+ arrivaltime);
        
    }
     
}
class LuxuryPublicBus extends PublicBus{
    boolean isAC,isWifi, noofsleeperseat;
    LuxuryPublicBus(){
     System.out.println("LuxuryPublicBus class constructor called");
    }
    void Show(){
        //showbusdetails();//this will  call its own method
        super.showbusdetails();//this will call its base class showbusdetails()
    }
     void showbusdetails(){
        System.out.println("registration no= "+ regdno);
        System.out.println("Model= "+ model);
        System.out.println("Capicity= " +capacity);
        System.out.println("Owner= "+ owner);
        System.out.println("From= "+ from);
        System.out.println("to= "+to);
        System.out.println("depttime= "+ depttime);
        System.out.println("arrivaltime= "+ arrivaltime);
        System.out.println("is AC is there= "+ isAC);
        System.out.println("is Wifi is there= "+isWifi);
        System.out.println("noofsleeperseat= "+ noofsleeperseat);
        
    }
    
}
class HelloWorld {
    public static void main(String[] args) {
      
        LuxuryPublicBus lxb=new  LuxuryPublicBus();
        lxb.Show();
          System.out.println();
        System.out.println("_____________________________________________");
        System.out.println();
        //we can see the use of super class in this method
        
        Bus b=new Bus();
        
        b.showbusdetails();//its own method called;
         System.out.println();
        System.out.println("_____________________________________________");
        System.out.println();
        
        b=lxb;
        b.showbusdetails();//its derived class method called
        //here Dynamic Method Dispatch or Runtime Polymorphism  is observed
    
    }
}