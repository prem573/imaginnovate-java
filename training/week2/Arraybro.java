public class Arraybro {
    public static void main (String[] args){
        int prem[]= new  int [100];
        System.out.println(prem.length);
        int a[]={1,2,3,4,5,6,7,8,9,10};
        for (int boom =1; boom < a.length +1; boom++){
            System.out.println(a[boom-1]);
        }
    }
}