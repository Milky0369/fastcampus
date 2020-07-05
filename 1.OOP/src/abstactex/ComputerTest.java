package abstactex;

public class ComputerTest {

	public static void main(String[] args) {
		
		Computer computer = new DeskTop();
		computer.display();
		computer.turnOff();
		
		Computer myNoteBook = new MyNoteBook();
		myNoteBook.display();
		myNoteBook.turnOff();
		
	}
	
}
