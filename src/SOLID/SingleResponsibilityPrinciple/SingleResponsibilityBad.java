package SOLID.SingleResponsibilityPrinciple;

import java.io.File;

/**
 * @author Prashant
 *
 */
public class SingleResponsibilityBad {

	enum FileType { 
		 
		 CSV(".csv"), XML(".xml"), JSON(".json"), PDF(".pdf"), RICHTEXT(".rtf"), TXT(".txt");
		 
		 private String extension;
		 
		 private FileType (String extension) {
		  this.extension = extension;
		 }
		 
		 public String getExtension() {
		  return this.extension;
		 }
	}
	
	/**
	 * This class has multiple responsibilities which violates Single Responsibility principle.
	 * 1) Check whether provided file has valid/supported extension
	 * 2) Parse the file and display Result.
	 */
	class FileParser {

		public void parseFile(File file) {
			// parse file logic for xml, csv, json data in files
			if (isValidFile(file, FileType.CSV, FileType.XML, FileType.JSON)) {
				System.out.println("File Parsed Successfully..");
			}
			else {
				System.out.println("Provided file format not supported..");
			}
		}

		private boolean isValidFile(File file, FileType... types) {
			if (file == null || types == null || types.length == 0)
				return false;

			String fileName = file.getName().toLowerCase();
			for (FileType type : types) {
				if (fileName.endsWith(type.getExtension()))
					return true;
			}

			return false;
		}

	}
	
	
	public static void main(String[] args) {
		
		SingleResponsibilityBad instance = new SingleResponsibilityBad();
		
		FileParser fParser = instance.new FileParser();
		fParser.parseFile( new File("C:\\prashant\\abc.JSONw"));
		
		
	}
}