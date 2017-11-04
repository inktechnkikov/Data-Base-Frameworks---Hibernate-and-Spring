package openclosed.solidprinciples.openclosed.bad;

public class Greeter {
	private String formality;
	private String answer;
	public String greeting() {
		
		if(this.formality == "formal") {
			 this.answer = "Good evening sir";
			 System.out.println(answer);
			 return answer;
			 
		}else if(this.formality == "casual") {
			this.answer = "whats up";
			System.out.println(answer);
			return answer;
		}
		else if(this.formality == "intimate") {
			this.answer = "Hello darling";
			System.out.println(answer);
			return answer;
		}
		else {
			this.answer = "hey bro";
			System.out.println(answer);
			return answer;
		}
	}

	public void setFormality(String formality) {
		this.formality = formality;
	}
}
