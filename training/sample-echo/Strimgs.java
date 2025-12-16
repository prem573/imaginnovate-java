public class Strimgs{
    public static void main (String[] args){
        // System.out.println("This is Strimgs class");
        String[] fruits = {"apple", "banana", "cherry", "date"};
        System.out.println("Fruits array length: " + fruits.length);
        for(String fuitr : fruits){
            System.out.println(fuitr);
        }
        prem();
        int sum = add(5, 10);
        System.out.println("Sum: " + sum);
    }
    static void prem(){
        System.out.println("This is prem method in Strimgs class");
    }
    static int add(int a, int b){
        return a + b;
    }
    
}    
