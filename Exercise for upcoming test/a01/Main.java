package a01;

public class Main {

	public static void main(String[] args) {
		Message firstMessage = new Message();

		firstMessage.setText("Hello world!");

		System.out.printf("This is the text from class Message: %s ", firstMessage.getText());
	}
}