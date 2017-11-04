package openclosed.streamprogressopenclosed.models;



public class Starter {
	public static void main(String[] args) {
		StreamProgressInfo musStreamProgressInfo = new StreamProgressInfo(new File(4500, 254, "Java advance"));
		System.out.println(musStreamProgressInfo.calculateCurrentPercent());
	}

}
