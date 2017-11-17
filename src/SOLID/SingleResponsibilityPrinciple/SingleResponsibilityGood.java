package SOLID.SingleResponsibilityPrinciple;

import java.io.File;

/**
 * @author Prashant
 *
 */
public class SingleResponsibilityGood {

	enum FileType {

		CSV(".csv"), XML(".xml"), JSON(".json"), PDF(".pdf"), RICHTEXT(".rtf"), TXT(".txt");

		private String extension;

		private FileType(String extension) {
			this.extension = extension;
		}

		public String getExtension() {
			return this.extension;
		}
	}

	/**
	 * This class has multiple responsibilities which violates Single
	 * Responsibility principle. 1) Check whether provided file has
	 * valid/supported extension 2) Parse the file and display Result.
	 *
	 * Issue : Resolved
	 */
	class FileParser {

		private Parser mParser;

		public FileParser(Parser parser) {
			mParser = parser;
		}

		public void parseFile(File file) {
			if (FileValidatorUtils.isValidFile(file, mParser.getFileType())) {
				mParser.parse(file);
			} else {
				System.out.println("File not supported...");
			}
		}

	}

	interface Parser {

		void parse(File file);

		FileType getFileType();
	}

	class JsonFileParser implements Parser {

		@Override
		public void parse(File file) {
			System.out.println("JSON file parsed successfully...");
		}

		@Override
		public FileType getFileType() {
			return FileType.JSON;
		}

	}

	class XMLFileParser implements Parser {

		@Override
		public void parse(File file) {
			System.out.println("XML file parsed successfully...");

		}

		@Override
		public FileType getFileType() {
			return FileType.XML;
		}

	}

	static class FileValidatorUtils {

		private FileValidatorUtils() {
		}

		public static boolean isValidFile(File file, FileType... types) {

			if (file == null || types == null || types.length == 0)
				return false;

			String fileName = file.getName().toLowerCase();
			for (FileType type : types) {
				if (fileName.endsWith(type.getExtension()))
					return true;
			}

			return false;
		}

		public static boolean isValidFile(File file, FileType type) {

			if (file == null || type == null)
				return false;

			String fileName = file.getName().toLowerCase();
			if (fileName.endsWith(type.getExtension()))
				return true;

			return false;
		}
	}

	public static void main(String[] args) {

		SingleResponsibilityGood instance = new SingleResponsibilityGood();

		FileParser jParser = instance.new FileParser(instance.new JsonFileParser());
		jParser.parseFile(new File("C:\\prashant\\abc.JSON"));

		FileParser xParser = instance.new FileParser(instance.new XMLFileParser());
		xParser.parseFile(new File("C:\\prashant\\abc.Xml"));

		FileParser errParser = instance.new FileParser(instance.new XMLFileParser());
		errParser.parseFile(new File("C:\\prashant\\abc.JSON"));

	}
}