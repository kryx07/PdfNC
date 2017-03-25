import java.io.IOException;
import java.util.Scanner;

import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;

public class Main {
	
	static Encryptor encryptor;
	static Decryptor decryptor;

	public static void main(String[] args) throws InvalidPasswordException, IOException {
		encryptor = new Encryptor();
		decryptor = new Decryptor();
		String[] inputArr = new String[4];
		inputArr = getInputArr(new Scanner(System.in).nextLine());
//		encryptor.encrypt(inputArr[0], inputArr[1], inputArr[2], inputArr[3]);
		decryptor.decrypt(inputArr[0], inputArr[1], inputArr[2], inputArr[3]);
		
	}
	
	public static String[] getInputArr (String input){
		return input.split(" ");
	}

}
