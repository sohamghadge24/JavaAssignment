class StarPattern{
    public static void main(String[] args) {
        int a=5;
        for(int  i=1;i<=a;i++){
            for( int j=1;j<=a;j++){
               if(j==i || j==a-i+1)
                  System.out.print("*");
                  System.out.print(" ");
            }
            
            System.out.println();
          }
    }
}

/*


output:
*    * 
 *  *  
  *   
 *  *  
*    * 


 */