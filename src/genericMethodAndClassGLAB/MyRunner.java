package genericMethodAndClassGLAB;

public class MyRunner {
    public static void main(String[] args) {
        DemoClass dObj = new DemoClass();
        // generic methods can take in any type of data
//        dObj.genericsMethod(25);
//        dObj.genericsMethod("Per Scholas");
//        dObj.genericsMethod(2563.5);
//        dObj.genericsMethod('H');

        GMultipleDatatype<String, Integer> mObj = new GMultipleDatatype<>("Per Scholas", 11025);
        System.out.println(mObj.getValueOne());
        System.out.println(mObj.getValueTwo());

        GMultipleDatatype<String, String> mObj2 = new GMultipleDatatype<>("Per Scholas", "Non Profit");
        System.out.println(mObj2.getValueOne());
        System.out.println(mObj2.getValueTwo());
    }
}
