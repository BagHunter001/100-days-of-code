public class Day5 {
    public static void main(String[] args) {
        // for (int y = 1; y <= 10; y++) {
        // System.out.print(y);
        // }
        // for (int p = 10; p >= 1; p--) {
        // int i = p*3;
        // int t = p*4;
        // System.out.print(i t);
        // }
        int x = 10;
        int y = 20;
        x++;
        System.out.println("After incrementing, x = " + x);
        x--;
        System.out.println("After decrementing, x = " + x);
        
        y += 10;
        System.out.println("After += 10, y = " + y);
        y -= 5;
        System.out.println("After -= 5, y = " + y); 
        y *= 2;
        System.out.println("After *= 2, y = " + y);      
        y /= 3;
        System.out.println("After /= 3, y = " + y); 
        y %= 4;
        System.out.println("After %= 4, y = " + y);


    }
}
