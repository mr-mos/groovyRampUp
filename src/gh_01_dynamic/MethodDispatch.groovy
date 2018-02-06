package gh_01_dynamic

import groovy.transform.CompileStatic

// @CompileStatic
class MyClass {

	private void myMethod(String s) { println "String: '$s'" }
	private void myMethod(Number n) { println "Number: $n" }
	private void myMethod(Object o) { println "Object: $o" }

	void doIt(Object o) {
		myMethod(o)
	}

}

def methodDispatch = new MyClass()

methodDispatch.doIt("Mos")
methodDispatch.doIt(123)
methodDispatch.doIt(['groovy','stuff'])
