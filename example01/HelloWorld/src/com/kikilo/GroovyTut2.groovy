// clousures
cl = { println 'Closures Are Cool' }
3.times cl

//  cluseres with index

cl2 = {index -> println "index is index ${index}"}

4.times cl2

// cluseres have an implicit it argument

cl3 = { println "it is implicit index ${it}"}

2.times cl3