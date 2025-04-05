import java.util.*;

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
    private static void pattern10(int N) {
        System.out.println("Printing the *-pattern isosceles triangle of size-"+N+"...");
        // For the upward triangle..
        for(int i=1;i<=N;i++) {
            for(int j=0;j<i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // For the downward-triangle..
        for(int i=N-1;i>=1;i--) {
            for(int j=0;j<i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
     private static void pattern11(int N) {
        System.out.println("Printing a binary-triangle of size-"+N+"..");
        int start = 1;
        for(int i=0;i<N;i++) {
            
            if (i%2 ==0) start = 1;

            else start = 0;

            for(int j=0;j<=i;j++) {
                System.out.print(start+" ");
                start = 1 - start;
            }


            System.out.println();

        }
    }
    private static void pattern12(int N) {
        int spaces = 2*(N-1);
        System.out.println("Printing v-stage number pattern of size-"+N+"...");
        for(int i=1;i<=N;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(j);
            }
            
            for(int j=1;j<=spaces;j++) {
                System.out.print(" ");
            }
    
            for(int j=i;j>=1;j--) {
                System.out.print(j);
            }
    
            System.out.println();
            spaces=spaces-2;
        }
    } 
    private static void pattern13(int N) {
        System.out.println("Priting the right-angeled trinangle number size-"+N+"..");
        int count = 1;
    for(int i=1;i<=N;i++) {
        for(int j=1;j<=i;j++) {
            System.out.print(count+" ");
            count++;
        }
        System.out.println();
    }
    }
    private static void pattern14(int N) {
    System.out.println("Priting the right-angeled alphabet trinangle size-"+N+"..");
    for(int i=1;i<=N;i++) {
    char count = 'A';
        for(int j=1;j<=i;j++) {
            System.out.print(count+" ");
            count++;
        }
        System.out.println();
    }
    }
    private static void pattern15(int N) {
        System.out.println("Priting the right-angeled alphabet trinangle size-"+N+"..");
        char count='A';
        for(int i=N;i>=1;i--) {
            for(int j=1;j<=i;j++) {
                System.out.print(count+" ");
                
            } count++;
            System.out.println();
        }
        }
        private static void pattern16(int N) {
            System.out.println("Priting the right-angeled alphabet trinangle size-"+N+"..");
            for(int i=1;i<=N;i++) {
            char count = 'A';
                for(int j=1;j<=i;j++) {
                    System.out.print(count+" ");
                    count++;
                }
                System.out.println();
            }
            }
        private static void pattern17(int N) {
            System.out.println("Printing the breakpoint triangle of size-"+N+"..");
            for(int i=0;i<N;i++) {

                for(int j=0;j<N-i-1;j++) {
                    System.out.print(" ");
                }
                char count='A';
                int breakpoint = (2*i+1) / 2;

                for(int j=1;j<=2*i+1;j++) {

                    System.out.print(count);
                    if(j<=breakpoint) count++;
                    else count--;
                }

                for(int j=0;j<N-i-1;j++) {
                    System.out.print(" ");
                }

                System.out.println();
            }
        }
        private static void pattern18(int N) {
            int iniS = 0;
            System.out.println("Priting the pattern of the Symmetric-Pattern ...");
            for(int i=0;i<N;i++) {
                for(int j=1;j<=N-i;j++) {
                    System.out.print("*");
                } for(int j=0;j<iniS;j++) {
                    System.out.print(" ");
                } for(int j=1;j<=N-i;j++) {
                    System.out.print("*");
                }
                iniS += 2;
                System.out.println();
            }
            iniS = 2*N-2;
            for(int i=1;i<=N;i++) {
                for(int j=1;j<=i;j++) {
                    System.out.print("*");
                } for(int j=0;j<iniS;j++) {
                    System.out.print(" ");
                } for(int j=1;j<=i;j++) {
                    System.out.print("*");
                }
                iniS -= 2;
                System.out.println();
            }
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(5);
        pattern6(5);
        pattern7(5);
        pattern8(5);
        pattern9(5);
        pattern10(5);
        pattern11(5);
        pattern12(5);
        pattern13(5);
        pattern14(5);
        pattern15(5);
        pattern16(5);
        pattern17(5);
        pattern18(5);
        sc.close();
    }
}