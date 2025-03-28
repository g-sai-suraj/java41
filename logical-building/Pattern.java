public class Pattern
{
    private static void pattern1(int N) {
        System.out.println("Printing a Square-Pattern of size-"+N+"....");
        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                System.out.print("* ");
            }
        System.out.println();    
        }
    }
        private static void pattern2(int N) {
            System.out.println("Printing a Right-Triangle-Pattern of size-"+N+"....");
            for(int i=1;i<=N;i++) {
                for(int j=0;j<i;j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        private static void pattern3(int N) {
            System.out.println("Printing a Right-Triangle-Number-Pattern of size-"+N+"....");
            for(int i=1;i<=N;i++) {
                for(int j=1;j<=i;j++) {
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        }
    public static void main(String[] args) {
        new Pattern().pattern1(5);
        new Pattern().pattern2(5);
        new Pattern().pattern3(5);
    }
}