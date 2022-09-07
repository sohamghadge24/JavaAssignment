class MethodTest {
    public static void main(String[] args) {
        int a=5;
        for(int i=0;i<=10;i++){
            System.out.print(a*i+ 2);  //int + int ( result int )
        }
        System.out.println();
        for(int i=0;i<=10;i++){
            System.out.print(a*i+" 2"); /// result  append (int + String)
        }
    }
}
