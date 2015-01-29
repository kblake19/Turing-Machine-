
public class Machine {
	
	private int state;
	private Tape tape;
	private Instructions instructions;
	private IOSystem myIO;
	
	public Machine() {
		state = 0;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	} 
	public void changeState(int newState) {
		state = newState;
	}

}
