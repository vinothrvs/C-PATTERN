class main{
    public static void main(String [] args){
        int n=5;
       for(int i=1;i<=n*2;i++){
        int rowchange= i > n ? (n*2)-(i-1) : i;
        for(int j=1;j<=n*2;j++){
            if(j <= n - rowchange + 1 || j > n + rowchange - 1){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
            System.out.println();
    }
}
}