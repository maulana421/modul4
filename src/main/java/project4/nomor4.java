package modul_4;
public class nomor4 {
    public static void main(String[] args) {
        int [] A = {25,7,9,13,3};
        System.out.println("Data yang belum diurutkan : ");
        nomor4.print(A);
        nomor4.shellsort(A);
        System.out.println("Data yang sudah diurutkan : ");
        nomor4.print(A);
        
    }
    public static void shellsort(int[] A){
        int n = A.length;
        int C = 0;
        int M = 0;
        int k,j,jarak;
        boolean sudah = true;
        jarak = n;
        int temp;
        while(jarak>=1){
            jarak = jarak /2;
            sudah = true;
            while(sudah){
                sudah = false;
                for (j = 0; j < n-jarak; j++) {
                    k = j + jarak;
                    C++;
                    if(A[j]>A[k]){
                        temp = A[j];
                        A[j] = A[k];
                        A[k] = temp;
                        sudah = true;
                    }
                    
                }
            }
        }
        
    }
    public static void print(int[]data){
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
            
        }
        System.out.println();
    }
}
