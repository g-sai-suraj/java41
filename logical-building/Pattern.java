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
            System.out.println("Printing a Right-Triangle-Number-Pattern-1 of size-"+N+"....");
            for(int i=1;i<=N;i++) {
                for(int j=1;j<=i;j++) {
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        }
        private static void pattern4(int N) {
            System.out.println("Printing a Right-Triangle-Number-Pattern-2 of size-"+N+"....");
            for(int i=1;i<=N;i++) {
                for(int j=0;j<i;j++) {
                    System.out.print(i+" ");
                }
                System.out.println();
            }
        }
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
    }
}