package modul_4;
public class nomor3 {
    public static void main(String[] args) {
        int A[] = {25,7,9,13,3};
       
        System.out.println("Data sebelum diurutkan : ");
        nomor3.print(A);
        nomor3.selectshort(A); 
        System.out.println("Data setelah diurutkan : ");
        nomor3.print(A);
    }
    public static void selectshort(int[]B){
        int littleindex;
        int pass;
        int j;
        int temp;
        for ( pass = 0; pass < B.length -1; pass++) {
            littleindex = pass;
            for (j = pass + 1; j < B.length; j++) {
                if(B[j]<B[littleindex]){
                    littleindex = j;
                }
                
            }
            temp = B[pass];
            B[pass] = B[littleindex];
            B[littleindex] = temp;
        }
         
        }
    public static void print(int[]data){
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
}
