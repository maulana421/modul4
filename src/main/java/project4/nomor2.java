package modul_4;
public class nomor2 {
    public static void main(String[] args) {
        int [] A = {25,7,9,13,3};
        System.out.println("Data Sebelum diurutkan : ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+" ");
        }
        System.out.println();
        int B = 1;
        int C;
        int temp;
        while(B<A.length){
            C = A.length - 1;
            while(C>=B){
                if(A[C-1]>A[C]){
                    temp = A[C];
                    A[C] = A[C-1];
                    A[C-1] = temp;
                }
                C = C-1;
                
            }
            B = B+1;
            
        }
        System.out.println("Data Setelah diurutkan : ");
         for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+" ");
        }
        
        
    }
}
