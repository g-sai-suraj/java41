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
        private static void pattern5(int N) {
            System.out.println("Printing '*'-pattern reversed right-traingle of size-"+N+"..");
            for(int i=N-1;i>=0;i--) {
                for(int j=0;j<=i;j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    private static void pattern6(int N) {
        System.out.println("Printing Number-Pattern reversed right-triangle of size-"+N+"..");
        for(int i=N;i>=1;i--) {
            for(int j=1;j<=i;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    private static void pattern7(int N) {
        System.out.println("Printing *-Pattern triangle of size-"+N+"..");
        for(int i=0;i<N;i++) {
            for(int j=0;j<N-i-1;j++) {
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++) {
                System.out.print("*");
            }
            for(int j=0;j<N-i-1;j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
    private static void pattern8(int N) {
        System.out.println("Printing *-Pattern reversed triangle of size-"+N+"..");
        // For Triangle-rows
        for(int i=0;i<N;i++) {
            // For Spaces
            for(int j=0;j<i;j++) {
                System.out.print(" ");
            }
            //For Stars
            for(int j=0;j<2*N-(2*i+1);j++) {
                System.out.print("*");
            }
            //For Spaces
            for(int j=0;j<i;j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
    private static void pattern9(int N) {
        System.out.println("Printing *-Pattern upward-reversed triangles of size-"+N+"..");
        // For the upward-triangle
        for(int i=0;i<N;i++)  {
            for(int j=0;j<N-i-1;j++) {
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++) {
                System.out.print("*");
            }
            for(int j=0;j<N-i-1;j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        // For the downward-triangle
        for(int i=0;i<N;i++) {
            for(int j=0;j<i;j++) {
                System.out.print(" ");
            }
            for(int j=0;j<2*N-(2*i+1);j++) {
                System.out.print("*");
            }
            for(int j=0;j<i;j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(5);
        pattern6(5);
        pattern7(5);
        pattern8(5);
        pattern9(5);
    }
}