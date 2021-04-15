package modul_4;
public class nomor1 {
    public static void main(String[] args) {
        int X [] = {25,7,9,13,3};
        System.out.println("Data sebelum diurutkan : ");
        for (int i = 0; i < X.length; i++) {
            System.out.print(X[i]+" ");
            
        }
        System.out.println();
        for (int i = 1; i < X.length; i++) {
            int key = X[i];
            int j = i -1 ;
            while((j>=0)&&(X[j]> key)){
                X[j + 1] = X[j];
                j--;
                
            }
            X[j+1]= key;
            
        }
        System.out.println("Data setelah diurutkan : ");
        for (int i = 0; i <X.length; i++) {
            System.out.print(X[i]+" ");
            
        }
    }
      
}
