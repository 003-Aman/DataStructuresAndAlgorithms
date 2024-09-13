//1. public class RecursionPractice {
//     public static void printNum(int n){
//         if(n==0){
//             return;
//         }
//         System.out.println(n);
//         printNum(n-1);
//     }
    


// public static void main(String[] args){
//     printNum(10);

// }
// }

// public class RecursionPractice{
//     public static void AscendingPrintNum(int n){
//         int t=5;;
//         if(n==t){
//             return;
//         }
//         System.out.println(n);
//         AscendingPrintNum(n+1);
//     }
    



// public static void main(String args[]){
    
//     AscendingPrintNum(1);


// }
// }
public class RecursionPractice{
    public static int Sum(int n){
        int sum =0;
        int m =1;
        if(m==n){
            return sum;
        }
        sum = sum +m;
        m=m+1;
        Sum(n);
        return sum;
        
    }




    public static void main(String[] args) {
        System.out.println(Sum(5));
        
    }
}