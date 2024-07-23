package Collections.VarArgs;

public class Concatenate {
    public static StringBuilder concatenate(String... strs){
        StringBuilder concat=new StringBuilder();
        for (String str : strs) {
            concat.append(str).append(" ");
        }
        return concat;
    }

    public static void main(String[] args) {
        System.out.println(Concatenate.concatenate("rahul","banerjee"));
        System.out.println(Concatenate.concatenate("zx","rahul"));
        System.out.println(Concatenate.concatenate("ravindra","nath"));
        System.out.println(Concatenate.concatenate("rahul","banerjee","zx","rahul","ravindra","nath"));
    }
}
