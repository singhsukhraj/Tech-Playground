interface ITarget
{
void request();
}

class Adaptee{

public void specificRequest(){
  System.out.println("This is a specific request");
}

}

class Adapter implements ITarget{

Adaptee adaptee;

public Adapter(Adaptee a){

this.adaptee = a;

}

public void request(){
this.adaptee.specificRequest();
}

}


class Client{

ITarget target;

Client(ITarget target){
this.target=target;
}

void executeMethod(){
target.request();
}

}



class AdapterDesignPattern{

public static void main(String... a ){
Client client =new Client(new Adapter(new Adaptee()));
client.executeMethod();
}
}
