public class DemoOperator {
    public static void main(String[] xx){
        demoAssignment();
        demoRelasi();
        demoAritmatika();
        demoLogika();
    }
    
    private static void demoLogika(){
        boolean a = true;
        boolean b = false;
        
        boolean c = periksa(a) && periksa(b);
        System.out.println("a && b = "+c);
        
        boolean d = periksa(a) & periksa(b);
        System.out.println("a & b = "+d);
        
        boolean e = periksa(a) || periksa(b);
        System.out.println("a || b = "+e);
        
        boolean f = periksa(a) | periksa(b);
        System.out.println("a | b = "+f);
        
        System.out.println("a ^ b = "+ (a ^ b));
    }
    
    private static boolean periksa(boolean input){
        System.out.println("Memeriksa input : "+input);
        return input;
    }
    
    private static void demoAritmatika(){
        int a = 10; 
        int b = 4;
        
        System.out.println("a + b = "+ (a + b));
        System.out.println("a - b = "+ (a - b));
        System.out.println("a * b = "+ (a * b));
        System.out.println("a / b = "+ ((float)a / (float)b));
        System.out.println("a % b = "+ (a % b));
    }
    
    private static void demoRelasi(){
        int x = 5; 
        int y = 7;
        
        System.out.println("x < y : " + (x < y) );
        System.out.println("x > y : " + (x > y) );
        System.out.println("x <= y : " + (x <= y) );
        System.out.println("x >= y : " + (x >= y) );
        System.out.println("x != y : " + (x != y) );
        System.out.println("x == y : " + (x == y) );
    }
    
    private static void demoAssignment(){
        int x = 10;
        System.out.println("Nilai x : "+x);
        
        x = x + 2;
        System.out.println("Nilai x : "+x);
        
        x += 2;
        System.out.println("Nilai x : "+x);
        
        x++;
        System.out.println("Nilai x : "+x);
    }
}
