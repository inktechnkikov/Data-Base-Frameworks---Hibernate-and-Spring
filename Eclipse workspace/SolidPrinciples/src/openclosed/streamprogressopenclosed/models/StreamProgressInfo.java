package openclosed.streamprogressopenclosed.models;

import openclosed.streamprogressopenclosed.interfaces.Streamable;

public class StreamProgressInfo {
	
	private Streamable file;
	
	public StreamProgressInfo(Streamable file) {
		this.file = file;
	}
	
	public int calculateCurrentPercent() {
		return (this.file.getLenght() * 100) / this.file.getByteSent();
	}

}
