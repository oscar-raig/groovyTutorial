class GroovyTut {
    static void main(String[] args) {
        println("What is your name") // print string

        def fName = System.console().readLine();
        println("Hello " + fName);

        println("Enter a number")
        def num1 = System.console().readLine().toDouble();
        println("Enter a number")
        def num2 = System.console().readLine().toDouble();
        printf("%.2f + %.2f = %.2f ", [num1, num2, (num1 + num2)]);


    }
}