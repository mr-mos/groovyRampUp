package gh_02_groovy_objects

def myClosure = { name ->
	println "Hello ${name}"
}

myClosure('Mos')
10.times myClosure

println "-------- Groovy Closures as Java Lamdas --------------"

def someList = [1,2,3,4,5,6,7]
// Java-Syntax not allowed  someList.forEach((s) -> System.out.println(s));
// instead
someList.forEach { s -> println s}
someList.each {  s -> println s }


println "-------- Closures a kings on collections --------------"

println someList.findAll { it % 2 == 0}.collect { it * 10 }
println someList.collectEntries{ ["${it}${it}": it] }