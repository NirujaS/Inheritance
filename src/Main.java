public class Main {
    public static void main(String[] args) {

        AccessModifiersDemo demo = new AccessModifiersDemo();


        System.out.println("Private Variable: " + demo.getPrivateVar());
        System.out.println("Default Variable: " + demo.getDefaultVar());
        System.out.println("Protected Variable: " + demo.getProtectedVar());
        System.out.println("Public Variable: " + demo.getPublicVar());


        SubclassDemo subclassDemo = new SubclassDemo();


        subclassDemo.displayProtectedVar();
    }
}