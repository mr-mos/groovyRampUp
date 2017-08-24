package gh_04_more

class TestClass implements  SubOne, SubTwo {
}


def testClass = new TestClass()
testClass.writeOne()
testClass.writeTwo()


trait SubOne {

	void writeOne() {
		println "one"
	}

}

trait SubTwo {

	void writeTwo() {
		println "two"
	}

}
