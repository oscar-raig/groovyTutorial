// clousures
cl = { println 'Closures Are Cool' }
3.times cl

//  cluseres with index

cl2 = {index -> println "index is index ${index}"}

4.times cl2

// cluseres have an implicit it argument

cl3 = { println "it is implicit index ${it}"}

2.times cl3

// Multiple arguments

myMap = [name:'Jeff', location: 'St.Louis']
myMap.each{ key, value ->
    println "Key ${key} Value ${value}"
}

println 'Collections'

kids  = ['Zake', 'Jake']
println kids.class

println 'Adding to a List'

albums = ['Rush']
albums << 'Fly by Night'
albums += 'Caress Of Steel'
albums.add 2122

println albums

void printSection(Section) {
    print Section + ': '
    30.times { print('#') }
}

printSection "MyFirstSection"