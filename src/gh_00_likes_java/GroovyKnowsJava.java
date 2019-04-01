package gh_00_likes_java;

import java.util.Random;

// Copy this into a Groovy-Class
public class GroovyKnowsJava {

	Random random = new Random();

	public static void main(String[] args) {
		GroovyKnowsJava groovyKnowsJava = new GroovyKnowsJava();
		groovyKnowsJava.paintSomething();
	}


	public void paintSomething() {
		for (int i = 1; i <= 300; i++) {
			System.out.print(randomChar());
			if (i % 30 == 0) {
				System.out.print('\n');
			}
		}
	}

	private Character randomChar() {
		String chars = "+-.!\"§%&/_?;~+*#^°";
		return chars.charAt(random.nextInt(chars.length()));
	}

}
