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

public class callback{

 OnClickEventListerner listen;

 void OnClickEventRegister(OnClickEventListerner listen)
    { 
        this.listen = listen; 
    } 
  
 void doStuff(){
    System.out.println("Performing callback before synchronous Task");

     if (this.listen != null) {
      listen.clickAction();
      }

  }

public static void main(String[] arg){

  callback c= new callback();
  OnClickEventListerner l = new LoginButtonListerner();
  c.OnClickEventRegister(l);
  c.doStuff();
}

}
