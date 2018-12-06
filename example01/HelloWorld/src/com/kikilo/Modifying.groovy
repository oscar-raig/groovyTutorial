import org.apache.ivy.core.module.descriptor.OverrideDependencyDescriptorMediator

class ClassWithElement {
    String element

    @Override
    String toString() {
        return element;
    }
}

class ClassWithClass {
    ClassWithElement classWithElement

    String toString() {
        return classWithElement.toString();
    }
}



def classWithElement = new ClassWithElement()
println classWithElement

classWithElement.element  = 'hola'

println classWithElement

def classWithClass = new ClassWithClass()

println classWithClass


