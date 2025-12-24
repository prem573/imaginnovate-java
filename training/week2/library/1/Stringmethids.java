public class Stringmethids{
    public static void main (String [] args){
        String str = "Hello, World!";
        System.out.println("Length of the string: " + str.length());
        System.out.println("Character at index 7: " + str.charAt(7));
        System.out.println("Substring from index 7 to 12: " + str.substring(7, 12));
        System.out.println("Index of 'World': " + str.indexOf("World"));
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));
        System.out.println(str);
    }
}