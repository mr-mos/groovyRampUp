package gh_00_likes_java


groovyLikeJava()
//or
groovyLikeGroovy()


public void groovyLikeJava() {
	ArrayList<String> values = new ArrayList<String>();
	values.add("one");
	values.add(null);
	values.add("three");
	values.add("4");
	values.add("five");
	for (String value : values) {
		if (value != null) {
			System.out.println(value.toUpperCase());
		} else {
			System.out.println("-- no value --");
		}
	}
}

void groovyLikeGroovy() {
	['one', null, 'three', '4', 'five']*.toUpperCase().each { println it?:'-- no value --' }
}

