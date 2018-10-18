package lwendel.cipher;

import java.awt.event.*;

public class Controller implements ActionListener {

	//attributes
	private Model m;
	private View v;
	
	//constructor
	public Controller() {
		this.m = new Model();
		this.v = new View(this, this.m);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (this.v.getButtonSelected() == 1) { //Shift
			ShiftCipher cipher = new ShiftCipher(this.v.getSecrAlph());
			if (this.v.isDecrPressed(e)) {
				this.v.setOutText(cipher.decrypt(this.v.getInText()));
			}
			if (this.v.isEncrPressed(e)) {
				this.v.setOutText(cipher.encrypt(this.v.getInText()));
			}
		}
		if (this.v.getButtonSelected() == 2) { //Substitution
			SubstitutionCipher cipher = new SubstitutionCipher(this.v.getSecrAlph());
			if (this.v.isDecrPressed(e)) {
				this.v.setOutText(cipher.decrypt(this.v.getInText()));
			}
			if (this.v.isEncrPressed(e)) {
				this.v.setOutText(cipher.encrypt(this.v.getInText()));
			}
		}
		
		

	}
}
