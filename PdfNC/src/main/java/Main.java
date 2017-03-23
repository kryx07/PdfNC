import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.AccessPermission;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy;

public class Main {

	public static void main(String[] args) throws InvalidPasswordException, IOException {
		
		//String sourceFile="C:\\Users\\RENT\\Downloads\\example\\JSON.pdf";
		String sourceFile="C:\\Users\\RENT\\workspace\\PdfNC\\f1.pdf";
		PDDocument doc = PDDocument.load(new File(sourceFile),"12345");
		
		String targetFile="C:\\Users\\RENT\\workspace\\PdfNC\\f2.pdf";

		// Define the length of the encryption key.
		// Possible values are 40 or 128 (256 will be available in PDFBox 2.0).
		int keyLength = 128;

		AccessPermission ap = new AccessPermission();

		// Disable printing, everything else is allowed
		ap.setCanPrint(false);

		// Owner password (to open the file with all permissions) is "12345"
		// User password (to open the file but with restricted permissions, is empty here) 
		StandardProtectionPolicy spp = new StandardProtectionPolicy("", "", ap);
		spp.setEncryptionKeyLength(keyLength);
		spp.setPermissions(ap);
		doc.protect(spp);
		doc.setAllSecurityToBeRemoved(true);
		doc.save(targetFile);
		doc.close();

	}

}
