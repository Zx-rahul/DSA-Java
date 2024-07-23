package Collections.VarArgs;

public class VarArgs {

    public static int sum(int first,int second)
    {
        return first+second;
    }

    public static int sum(int[] arr){
        int sum=0;
        for (int i : arr) {
            sum+=i;
        }
        return sum;
    }

    public static int sum(int first,int second,int third,int... a)
    {
        int sum=first+second+third;
        for (int i : a) {
            sum+=i;
        }
        return sum;
    }
    public static void main(String... args) {
        System.out.println(sum(4,5));
        System.out.println(sum(4,2,2,4));
        System.out.println(sum(new int[]{4,3}));
    }
}
