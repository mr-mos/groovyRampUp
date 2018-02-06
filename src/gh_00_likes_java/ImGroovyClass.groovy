package gh_00_likes_java

class ImGroovyClass {

	static void main(String[] args) {

		ImJavaClass javaObject = new ImJavaClass()
		println javaObject.pleaseCallMe("Otto")

	}


	String groovyMethod(String name) {
		return "I'm a Groovy-Method. Your name is: " + name;
	}

}
