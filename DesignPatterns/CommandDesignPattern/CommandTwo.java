class CommandTwo implements ICommand{


Receiver reciever = new Receiver(); // bad Idea  

public void execute(){
  reciever.commandTwo();
}

public void unexecute(){
  System.out.println("Command Two Unexecuted");

}

}
