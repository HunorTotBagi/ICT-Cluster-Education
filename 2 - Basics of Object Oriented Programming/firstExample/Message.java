package firstExample;

public class Message {
	private String text;

	public void setText(String input) {
		this.text = input;
	}

	public void displayText() {
		System.out.println(this.getText());
	}
	
	public String getText() {
		return this.text;
	}
}