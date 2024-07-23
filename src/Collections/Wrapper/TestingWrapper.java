package Collections.Wrapper;

public class TestingWrapper {
    public static void main(String[] args) {
//        Integer exp=new Integer(65);
        //deprecated in version 9 instead we can use value of
        Integer exp=Integer.valueOf(65);
        //other data type can also be passed
        //it automatically converts to int type
        System.out.println(exp);
        //or simply by autoboxing
        Integer first=55;//autoboxing
        System.out.println(first);
        int second=first;//unboxing
        System.out.println(second);
    }
}
