class Overload {
    int num;
    Overload() {
        num = 1;
        System.out.println(num);
    }
    Overload(int n) {
        num = n;
        System.out.println(num);
    }
    Overload(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        Overload obj1 = new Overload();
        Overload obj2 = new Overload(5);
        Overload obj3 = new Overload("usrr");
    }
}
