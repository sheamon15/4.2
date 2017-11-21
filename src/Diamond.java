 class Diamond {
    public static void main (String []args){
        for (int i = 3; i < 5; i +=2) {
            for (int n = 0; n < 5 - i / 2; n++) ;
            System.out.print(" ");

            for (int n = 0; n < i; n++)
                System.out.print("*");
            System.out.print("\n");
        }

        for (int i = 5 ; i > 0 ; i-= 2){
            for(int n = 0; n < 5 - i / 2; n++)
                System.out.print(" ");

            for (int n=0 ; n < i ; n++)
            System.out.print(" * ");
            System.out.print("\n");

        }
    }
}
