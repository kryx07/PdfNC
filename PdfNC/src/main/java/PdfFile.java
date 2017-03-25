
public class PdfFile {
private String sourcePath;
private String sourcePass;
private String targetPath;
private String targetPass;



public PdfFile(String sourcePath, String sourcePass, String targetPath, String targetPass) {
	this.sourcePath = sourcePath;
	this.sourcePass = sourcePass;
	this.targetPath = targetPath;
	this.targetPass = targetPass;
}
public String getSourcePath() {
	return sourcePath;
}
public void setSourcePath(String sourcePath) {
	this.sourcePath = sourcePath;
}
public String getSourcePass() {
	return sourcePass;
}
public void setSourcePass(String sourcePass) {
	this.sourcePass = sourcePass;
}
public String getTargetPath() {
	return targetPath;
}
public void setTargetPath(String targetPath) {
	this.targetPath = targetPath;
}
public String getTargetPass() {
	return targetPass;
}
public void setTargetPass(String targetPass) {
	this.targetPass = targetPass;
}


}
