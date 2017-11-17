package SOLID.InterfaceSegregationPrinciple;

public class InterfaceSegregationBad {
	
	interface ButtonPressedListener {
		
		public void onButtonClick();
		public void onButtonLongClickListener();
		public void onButtonDoubleClickListener();
		public void showPopOver();
	}
	
	class Button {
		
		ButtonPressedListener mListener;
		
		private String buttonName;
		
		public Button(String btnName) {
			buttonName = btnName;
		}
		
		public void setListener(ButtonPressedListener listener) {
			mListener = listener;
		}
		
		public void onClick() {
			mListener.onButtonClick();
		}

		public void onLongClick() {
			mListener.onButtonLongClickListener();
		}

		public void onDoubleClick() {
			mListener.onButtonDoubleClickListener();
		}

		public void displayPopOver() {
			mListener.showPopOver();
		}

	}
	
	
	public static void main(String[] args ) {
		
		InterfaceSegregationBad instance = new InterfaceSegregationBad();
		
		Button button = instance.new Button("Submit");
		button.setListener( new ButtonPressedListener() {

			@Override
			public void onButtonClick() {
				System.out.println("On Button Single Click");	
			}

			@Override
			public void onButtonLongClickListener() {
				System.out.println("On Button Long Click");
				
			}

			@Override
			public void onButtonDoubleClickListener() {
				System.out.println("On Button Double Click");				
			}

			@Override
			public void showPopOver() {
				System.out.println("On Button Click : Show Popup");
			}
			
		});
		
		
		button.onClick();

		// What if I dont want to call below three API's, Still I need to implement all the callback of 
		// ButtonPressedListener interface. Which is actually not required.
		// button.onDoubleClick();
		// button.displayPopOver();
		// button.onLongClick();
	}
}
