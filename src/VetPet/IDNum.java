package VetPet;

public class IDNum {

	private String number;
	boolean isValid;
	
	public IDNum(String number) {
		this.number = number;
		updateValidity();
	}
	
	public String getNumber(){
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
		updateValidity();
	}
	
	public boolean isValid() {
		return isValid;
	}
	
	private void updateValidity() {
		boolean length = number.length() == 6;
		boolean chars = true;
		for (int i = 0; i < number.length() && chars; i++)
			if (!Character.isDigit(number.charAt(i)))
				chars = false;
		isValid = length && chars;
	}
	
}
