import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.AccessPermission;
import org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy;

public class Decryptor {
	public void decrypt(String sourceFilePath, String sourceFilePass, String targetFilePath, String targetFilePass)
			throws IOException {

		PDDocument doc = PDDocument.load(new File(sourceFilePath), sourceFilePass);

		/*int keyLength = 128;

		AccessPermission ap = new AccessPermission();

		StandardProtectionPolicy spp = new StandardProtectionPolicy("", "", ap);
		
		
		
		spp.setEncryptionKeyLength(keyLength);
		spp.setPermissions(ap);

		doc.protect(spp);*/
		doc.setAllSecurityToBeRemoved(true);
		doc.save(targetFilePath);
		doc.close();
	}
}
