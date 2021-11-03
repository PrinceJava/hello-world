public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.printJenkins();
    }

    public String printJenkins(){
        return "This Works on Jenkins";
    }
}
