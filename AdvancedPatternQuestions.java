public class AdvancedPatternQuestions {
    public static void main(String[] args) {
        
        //BUTTERFLY PATTERN
        //upper half
        int rows = 5;
        for (int i=1;i<=rows;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            int spaces = 2*(rows -i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
        //upper half right side
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        //lower half
        for (int i=rows;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            int spaces = 2*(rows -i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
        //upper half right side
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }


        //SOLID RHOMBUS
        for (int i =1;i<=rows;i++){
            //spaces
            for(int j=1;j<=(rows-i);j++){
                System.out.print(" ");
            }
        //stars
           for(int j=1;j<=rows;j++){
            System.out.print("*");
           }
           System.out.println();

        }

        //NUMBERS PYRAMID
        for (int i=1;i<=rows;i++){
            //spaces
            for(int j=1;j<=(rows-i);j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        //PALINDROMIC PATTERN
        for (int i = 1; i <= rows; i++) {
            // spaces
            for (int j = 1; j <= (rows - i); j++) {
                System.out.print(" ");
            }
        
            // first half numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
        
            // second half, right side
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        //DIAMOND PATTERN
        for(int i=1; i<=rows; i++) {
            //spaces
            for(int j=1; j<=rows-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
 
 
        //lower part
        for(int i=rows; i>=1; i--) {
            //spaces
            for(int j=1; j<=rows-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
 

        
        }

        
        



    }
    

