class CommandOne implements ICommand{

Receiver reciever = new Receiver(); // bad Idea  

public void execute(){
  reciever.commandOne();
}

public void unexecute(){
  System.out.println("Command One Unexecuted");

}

}
