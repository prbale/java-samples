package DesignPatterns.CreationalDesignPatterns.BuilderPattern;

public class AlertDialog {
	
	// All final Attributes
	private final String title;  // Optional
	private final String subTitle; // Optional
	private final String message; // Optional
	private final String firstButtonText; // Optional
	private final String secondButtonText; // Optional
	
	private AlertDialog(Builder builder) {
	
			this.title = builder.title;
			this.subTitle = builder.subTitle;
			this.message = builder.message;
			this.firstButtonText = builder.firstButtonText;
			this.secondButtonText = builder.secondButtonText;
	}
	
	public String getTitle() {
		return title;
	}
	public String getSubTitle() {
		return subTitle;
	}
	public String getMessage() {
		return message;
	}
	public String getFirstButtonText() {
		return firstButtonText;
	}
	public String getSecondButtonText() {
		return secondButtonText;
	}


	public static class Builder {
		
		// All final Attributes
		private String title = "";  // Optional
		private String subTitle = ""; // Optional
		private String message = ""; // Optional
		private String firstButtonText = ""; // Optional
		private String secondButtonText = ""; // Optional
	
		public Builder setTitle(String title) {
			this.title = title;
			return this;
		}

		public Builder setSubTitle(String subtitle) {
			this.subTitle = subtitle;
			return this;
		}

		public Builder setMessage(String message) {
			this.message = message;
			return this;
		}

		public Builder setFirstButtonText(String text) {
			this.firstButtonText = text;
			return this;
		}

		public Builder setSecondButtonText(String text) {
			this.secondButtonText = text;
			return this;
		}
		
		public AlertDialog Build() {
			AlertDialog dialog = new AlertDialog(this);
			validateInputs(dialog);
			return dialog;
		}
		
		public void validateInputs(AlertDialog dlg) {
			// Do validation heres
		}
	}

	public void show() {

		if(title != null && !title.isEmpty())
			System.out.println("Title 				: " + title);
		if(subTitle != null && subTitle != "")
			System.out.println("Sub Title 		: " + subTitle);
		if(message!= null && message!= "")
			System.out.println("Message 			: " + message);
		if(firstButtonText!= null && firstButtonText!= "")
			System.out.println("First Button 	: " + firstButtonText);
		if(secondButtonText!= null && secondButtonText!= "")
			System.out.println("Second Button : " + secondButtonText);

	}
	
    
}
