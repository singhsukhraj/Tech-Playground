class CommandThree implements ICommand{

Receiver reciever = new Receiver(); // bad Idea  

public void execute(){
  reciever.commandThree();
}

public void unexecute(){
  System.out.println("Command Three Unexecuted");

}

}
