final  String PI = 3.14

assert PI.class.name == 'java.lang.String'

assert PI.length() == 4

new GroovyTestCase().shouldFail(ClassCastException.class){
    Float areaOfCircleRadiousOne = PI
}

println 'Test has passed?'
