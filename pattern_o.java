class main{
    public static void main(String [] args){
       int n=5;
       for(int i=1;i<n*2;i++){
        int space = n < i ? i-n :n-i;
        int column = n < i ? 2*(2*n-i)-1: i*2-1;
        for(int j=1;j<=space;j++){
            System.out.print(" ");
        }  
        for(int j=1;j<=column;j++){
            System.out.print("*");
        }
        System.out.println();
       }
    }
}