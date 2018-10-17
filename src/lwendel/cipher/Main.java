package lwendel.cipher;

public class Main {
	public static void main(String[] args) {
		SubstitutionCipher nr1 = new SubstitutionCipher("qw!rtz§iop5äölkjhgfdsayxcvbnmß");
		String x = nr1.encrypt("hällö würld peolplß");
		System.out.println(x);
		System.out.println(nr1.decrypt(x));
		ShiftCipher nr2 = new ShiftCipher(5);
		String y = nr2.encrypt("hällö würld peolplß");
		System.out.println(y);
		System.out.println(nr2.decrypt(y));
		Controller c = new Controller();
	}
}
