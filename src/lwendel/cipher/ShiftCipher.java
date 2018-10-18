package lwendel.cipher;

public class ShiftCipher extends MonoAlphabeticCipher {

	//constructor
	public ShiftCipher(String value) {
		this.setShiftValue(value);
	}
	
	//set-method(s)
	public void setShiftValue(String v) {
		int value;
		try {
			value = Integer.parseInt(v);
		} catch (NumberFormatException exc) {
			value = 0;
		}
		value = value % 30;
		String alphabet = "abcdefghijklmnopqrstuvwxyzßäöü";
		String secrAlphabet = "";
		for (int i = value ; i < 30 ; i++) {
			secrAlphabet += alphabet.charAt(i);
		}
		for (int i = 0 ; i < value ; i++) {
			secrAlphabet += alphabet.charAt(i);
		}
		super.setSecretAlphabet(secrAlphabet);
	}
}
