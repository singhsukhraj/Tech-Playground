import java.util.*;

interface OnClickEventListerner
{
   void clickAction();
}

class LoginButtonListerner implements OnClickEventListerner{

  @Override
  public void clickAction(){
   System.out.println("I am SherLocked :P"); 
  }

}

public class AsynCallBack{

 OnClickEventListerner listen;

 void OnClickEventRegister(OnClickEventListerner listen)
    { 
        this.listen = listen; 
    } 
  
 void doStuff(){
  new Thread(new Runnable() { 
            public void run() 
            { 
  
                System.out.println("Performing operation in Asynchronous Task"); 
  
                if (listen != null) { 
  
                    listen.clickAction(); 
                } 
            } 
        }).start(); 
  }

public static void main(String[] arg){

  AsynCallBack c= new AsynCallBack();
  OnClickEventListerner l = new LoginButtonListerner();
  c.OnClickEventRegister(l);
  c.doStuff();
}

}
