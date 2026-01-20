

public class printl {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i < rows; i++) {
            if (i < rows - 1) {
                
                System.out.println("*");
            } else {
                
                for (int j = 0; j < 3; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
