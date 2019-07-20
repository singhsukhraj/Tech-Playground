pragma solidity ^0.5.0;

contract TodoList {

	// Like a static variable in java
	uint public taskCount=0;

	//Custom object
	struct Task {
		uint id;
		string content;
		bool completed;
	}

	//Sort of storage
	 mapping(uint => Task) public tasks;

	constructor() public{
		createTask("My default task");
	}

	

	function createTask( string memory _content) public {
		taskCount++;
		tasks[taskCount] = Task(taskCount,_content,false);

	}
}