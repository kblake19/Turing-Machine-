/**
 * This class includes all aspects the Tape takes on.
 * It contains the chars that the machine will be reading
 * and also changes the char and position.
 * @author kblake
 *
 */
public class Tape {
	
	int position = 0;
	char character = ' ';
	public final int MAXSIZE = 2000;
	public final int LEFT = -1;
	public final int RIGHT = 1;
	public final int STAY = 0;
	private final char OFFTAPE = '*';
	char[] tapeArray;
	
	public Tape(String initialTape) {
		tapeArray = new char[MAXSIZE + 2];
		tapeArray[0] = OFFTAPE;
		tapeArray[tapeArray.length - 1] = OFFTAPE;
		tapeArray = initialTape.toCharArray();
		position = 1000;
		//TODO What happens when the tape is longer than the input string?
		//Maybe center the string's array on top of the middle of tapeArray?
	}
	public char getCurrentChar() {	
		return character;
	}
	public void writeCurrentChar(char newChar) {
		tapeArray[position] = newChar;
	}
	public void moveLeft() {
		position = position + LEFT;
	}
	public void moveRight() {
		position = position + RIGHT;
	}
	public void stay() {
		position = position + STAY;
	}
}
