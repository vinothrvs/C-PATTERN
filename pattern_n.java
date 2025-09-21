class main{
    public static void main(String [] args){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int space=1;space<i;space++){
                System.out.print(" ");
            }
            for(int j=i;j<=n*2-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}