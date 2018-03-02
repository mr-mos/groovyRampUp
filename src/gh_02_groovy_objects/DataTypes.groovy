package gh_02_groovy_objects

// No primitive datatypes

int myNumber = 123
println myNumber.toString()
println "There are no primitive data-types: " + myNumber.class

println "----------------------------"

// Class properties in Groovy

class MyBean {

	String prop1
	Integer prop2

	String getProp1() {
		"Changed property using a GString:  ${prop1}"
	}
}

def myBean = new MyBean()
myBean.prop1 = "Hello"
myBean.setProp2(22)
println myBean.prop1
println myBean.getProp2()

println new MyBean(prop1:'Named Argument').prop1

println "----------------------------"

// Nice List and Map syntax

def myList = ['a','b','c','d','e','f']
Map myMap = ['key1':'value1', 'key2':'value2']

println myList[2] + '  ' +myMap.key2
