package gh_01_dynamic

import groovy.transform.CompileStatic
import groovy.transform.TypeChecked


myMethod('myOtherMethod')


//@TypeChecked
//@CompileStatic
void myMethod(String methodName) {
	this."$methodName"()
	// myWhateverMethod()
}

void myOtherMethod() {
	println "succeeded!"
}