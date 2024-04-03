import java.util.*;
public class PatternQuestions {

//THIS QUESTION IS FOR A HOLLOW RECTANGLE
    public static void main(String[] args) {
        System.out.println("What will be the number of rows:");
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        System.out.println("What will be the number of columns:");
        int columns = input.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                if (i == 1 || i == rows || j == 1 || j == columns){
                    System.out.print("*");}
                else{
                    System.out.print(" ");}
                }
            System.out.println();
        }
//RIGHT ANGLED TRAINGLE
        for (int i = 1; i <= rows; i++) {
            for(int j=1;j<=i;j++){
                System.out.print("*");}
            System.out.println();}

    //INVERTED RIGHT ANGLED TRAINGLE
        //invert the outer loop
        for(int i=rows;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");}
            System.out.println();}

        //REFLECTED RIGHT ANGLED TRIANGLE
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //RIGHT ANGLED TRIANGLE BUT WITH NUMBERS
        for (int i =1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");//this space is not necessary
            }
            System.out.println();
        }
        //INVERTED RIGHT ANGLED TRIANGLE WITH NUMBERS
        for (int i=rows;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        //FLOYD'S TRIANGLE
        int number =1;
        for (int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }




        }    
    }
    
