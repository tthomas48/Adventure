package name.thomas.adventure;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Adventure {

	public char getInput() {
		try {
			System.out.print("\n> ");

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			char output = (char) reader.readLine().charAt(0);
			return output;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public void printOptions(String... options) {
		char[] letters = new char[] { 'a', 'b', 'c', 'd', 'e' };

		StringBuilder output = new StringBuilder();
		for (int i = 0; i < options.length; i++) {
			output.append(letters[i]);
			output.append(") ");
			output.append(options[i]);
			output.append("\n");
		}
		print(output.toString());
	}
	
	public void printQuestion(String output) {
		print(output);
		print("What do you want to do?");
	}

	public void print(String output) {
		System.out.println(output);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Adventure adventure = new Adventure();
		adventure.start();
	}

	private void start() {
		print("This is Stella and Etta's Adventure.");
		printQuestion("Your walking down the street. You see the mystery man. He goes into the store. Your friends are at the park.");
		printOptions("Go to the store", "Go to the park");

		char input = getInput();
		if (input == 'a') {
			store();
		} else if (input == 'b') {
			park();
		}
	}

	private void park() {
		printQuestion("Your friends ask what you are doing.");
		printOptions("you tell about the mystery man", "you ask when is lunch");

		char input = getInput();
		if (input == 'a') {
			tellAboutMysteryMan();
		} else if (input == 'b') {

		}

	}
	
	private void tellAboutMysteryMan() {
		printQuestion("He went in to the store");
		printOptions("go", "");

		char input = getInput();
		if (input == 'a') {
		} else if (input == 'b') {

		}

	}
	
	private void store() {
		printQuestion("You see the man going out the back door in to the alley");
		printOptions("you follow the man", "go to your friends");

		char input = getInput();
		if (input == 'a') {
		} else if (input == 'b') {

		}

	}
	

}
