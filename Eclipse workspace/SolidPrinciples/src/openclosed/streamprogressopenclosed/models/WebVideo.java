package openclosed.streamprogressopenclosed.models;

import openclosed.streamprogressopenclosed.asbtraction.BaseStream;

public class WebVideo extends BaseStream{
	
	private String videoName;
	
	public WebVideo(int length, int byteSent,String videoName) {
		super(length, byteSent);
		this.videoName = videoName;
	}
	

}
