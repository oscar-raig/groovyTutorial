def map = [a:[b:[c:1]]]
assert map.a.b.c == 1
println 'Proteting with if'
if (map && map.a && map.a.x){
    assert map.a.x.c == null
}

try {
    assert map.a.x.c == null
} catch (NullPointerException npe){
    println npe
}
println 'protection with ?'
assert map?.a?.x?.c == null