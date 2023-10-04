class AccessModifiersDemo {
    private int privateVar;
    double defaultVar;
    protected boolean protectedVar;
    public String publicVar;


    public AccessModifiersDemo() {
        privateVar = 1;
        defaultVar = 2.0;
        protectedVar = true;
        publicVar = "Hello, World!";
    }


    public int getPrivateVar() {
        return privateVar;
    }


    double getDefaultVar() {
        return defaultVar;
    }


    protected boolean getProtectedVar() {
        return protectedVar;
    }


    public String getPublicVar() {
        return publicVar;
    }
}

class SubclassDemo extends AccessModifiersDemo {

    void displayProtectedVar() {
        System.out.println("Protected Variable in SubclassDemo: " + getProtectedVar());
    }
}