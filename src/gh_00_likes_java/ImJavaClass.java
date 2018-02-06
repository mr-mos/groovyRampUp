package gh_00_likes_java;

public class ImJavaClass {

	public static void main(String [ ] args) {

		ImGroovyClass groovyClass = new  ImGroovyClass();
		System.out.println(groovyClass.groovyMethod("Mos"));

	}


	public String pleaseCallMe(String name) {
		return "I'm a Java-Method. Your name is: " + name;
	}

}
