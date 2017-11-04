package openclosed.streamprogressopenclosed.asbtraction;

import openclosed.streamprogressopenclosed.interfaces.Streamable;

public abstract class BaseStream implements Streamable{
	private int length;
	private int byteSent;
	
	protected BaseStream(int length, int byteSent) {
		this.length = length;
		this.byteSent = byteSent;
	}

	@Override
	public int getLenght() {
		return this.length;
	}

	@Override
	public int getByteSent() {
	return this.byteSent;
	}
	
	
}
