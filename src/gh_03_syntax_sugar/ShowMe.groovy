package gh_03_syntax_sugar


String name = 'Mos'
println "GString is readable: ${name.toUpperCase()}"

String regex = /"hallo"/
println (('I say "hallo"' =~ regex)  as Boolean)

// true or false
assert 1
assert "something"
assert [1]
assert !0
assert !""
assert ![:]


println "---------------------------------------"

println  name ?: 'no name'

name = null
println name?.toUpperCase()

println  name ?: 'no name'


println "---------------------------------------"

name = 'Müller'

switch (name) {
	case "Müller":
	    println "yes"
}


// ........... many more