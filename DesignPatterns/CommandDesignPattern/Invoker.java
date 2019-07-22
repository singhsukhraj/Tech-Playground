class Invoker {

ICommand one;
ICommand two;
ICommand three;

public Invoker (ICommand one,ICommand two , ICommand three){

this.one=one;
this.two=two;
this.three=three;

}


void runAllCommand(){
one.execute();
two.execute();
three.execute();

} 


public static void main(String... a){
Invoker i=new Invoker(new CommandOne(),new CommandTwo(), new CommandThree() );
i.runAllCommand();

}



}
