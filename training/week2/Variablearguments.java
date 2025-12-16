public class Variablearguments {
    
    public static void main (String[] args){
        fun(1);
        fun(1, 2, 3);
        fun(4, 5, 6, 7, 8);
    }

    public  static void fun(int... n){
        System.out.println("Number of arguments: " + n.length);
        for(int x : n){
            System.out.print(x + " ");
        }
    }
}