package SuperKeyword;

public class MethodUseKey {

    void show() {
        System.out.println("This Is Show Method");
    }
}

class child extends MethodUseKey {

    void show() {
        System.out.println("This Is Display Method");
        super.show(); // calling parent class method
    }

    public static void main(String[] args) {

        child d1 = new child();
        d1.show();
    }
}



    

