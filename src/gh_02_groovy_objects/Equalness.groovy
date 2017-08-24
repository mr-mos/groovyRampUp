package gh_02_groovy_objects

String one = 'hello again'
String two = "hello ${'again'}"

println "'${one}' vs. '${two}'"

println "equals: "+(one.equals(two))
println "==: "+(one == two)
println "is: "+(one.is(two))

