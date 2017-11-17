package SOLID.InterfaceSegregationPrinciple;

import SOLID.InterfaceSegregationPrinciple.InterfaceSegregationGood.Button;

public class InterfaceSegregationGood {
	
	interface ButtonClickListener {
		
	}
	interface ButtonSingleClickListener extends ButtonClickListener {
		public void onButtonClick();
	}
	interface ButtonLongClickListener extends ButtonClickListener {
		public void onButtonLongClickListener();
	}
	interface ButtonDoubleClickListener extends ButtonClickListener {
		public void onButtonDoubleClickListener();
	}
	interface ButtonShowPopOverListener extends ButtonClickListener {
		public void showPopOver();
	}
	
	class Button {
		
		ButtonClickListener mListener;
		
		private String buttonName;
		
		public Button(String btnName) {
			buttonName = btnName;
		}
		
		public void setListener(ButtonClickListener listener) {
			mListener = listener;
		}
		
		public void onClick() {
			((ButtonSingleClickListener)mListener).onButtonClick();
		}

		public void onLongClick() {
			((ButtonLongClickListener)mListener).onButtonLongClickListener();
		}

		public void onDoubleClick() {
			((ButtonDoubleClickListener)mListener).onButtonDoubleClickListener();
		}

		public void displayPopOver() {
			((ButtonShowPopOverListener)mListener).showPopOver();
		}

	}
	
	
	public static void main(String[] args ) {
		
		InterfaceSegregationGood instance = new InterfaceSegregationGood();
		
		Button button = instance.new Button("Submit");
		button.setListener( new ButtonSingleClickListener() {

			@Override
			public void onButtonClick() {
			
				System.out.println("Button Single Click Perfomed...");
			}
			
		});
		
		button.onClick();

	}
}
