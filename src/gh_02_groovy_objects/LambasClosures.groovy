package gh_02_groovy_objects

import java.util.stream.Stream

import static java.util.stream.Collectors.*

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

//println Stream.of("abcd","1234").map{ v -> v.toUpperCase() }.collect(toList());

println "-------- Closures a kings on collections --------------"

println someList.findAll { it % 2 == 0}.collect { it * 10 }
println someList.collectEntries{ [ "${it}${it}" : it ] }