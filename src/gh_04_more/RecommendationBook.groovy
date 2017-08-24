package gh_04_more

println "Groovy in Action".toUpperCase()
println "-------------------------------"

println ((new URL("https://www.manning.com/books/groovy-in-action-second-edition").text =~ /(<i>Groovy in Action, Second Edition.+)/)[0][1])