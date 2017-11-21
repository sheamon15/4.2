class even {
    public static void main(String [] args){

            for (int n=2; n<=100; n+=2){
                System.out.print(n + " ");
                if ((n + 1) % 10 == 0){
                    System.out.println();
                }
        }
    }
}

