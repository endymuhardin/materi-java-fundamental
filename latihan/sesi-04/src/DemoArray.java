public class DemoArray{
    public static void main(String[] xx){
        int[] nilai = new int[5];
        
        nilai[0] = 7;
        nilai[1] = 9;
        nilai[4] = 6;
        
        for(int x=0; x<nilai.length; x++){
            System.out.println("Index ke "+x+" isinya "+nilai[x]);
        }
        
        // array dua dimensi
        int[][] perkalian = new int[5][5];
        
        // mengisi data
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                perkalian[i][j] = i * j;
            }
        }
        
        // menampilkan data
        
        System.out.print("  | \t");
        for(int i=0; i<5; i++){
            System.out.print(i+"\t");
        }
        System.out.println();
        System.out.println("--+-------------------------------------------");
        
        for(int i=0; i<5; i++){
            System.out.print(i + " | \t");
            for(int j=0; j<5; j++){
                System.out.print(perkalian[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}
