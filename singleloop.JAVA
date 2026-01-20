public class singleloop {
    public static void main(String[] args) {
        int rows = 5; 
        int columns = 3; 

        for (int i = 0; i < rows; i++) {
            if (i < rows - 1) {
               
                System.out.println("*");
            } else {
              
                System.out.println("***");
            }
        }
    }
}
