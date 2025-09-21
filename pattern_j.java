class main{
    public static void main(String [] args){ 
        int n=10;
        for(int i=1;i<=n*2-1;i++){
            int rowchange= n < i ? n*2-i: i;
            for(int j=1;j<=rowchange;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}