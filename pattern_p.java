class main{
    public static void main(String [] args){
        int n=5;
        for(int i=1;i<=n*2;i++){ 
            int column=n < i ? i - n : n-i+1; 
            int space=n < i ? 2*n-i+1 : i;
            for(int j=2;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=column;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}