import java.util.Scanner;

public class FCP022{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int E = scanner.nextInt();

        int countA = 1;
        if(A == B) countA++;
       else if(A == C) countA++;
        else if(A == D) countA++;
       else if(A == E) countA++;
        System.out.println(A + " = " + countA);

        if(B != A) {
            int countB = 1;
            if (B == C) countB++;
           else if (B == D) countB++;
           else if (B == E) countB++;
            System.out.println(B + " = " + countB);
}
       else if(C != A && C != B) {
            int countC = 1;
            if (C == D) countC++;
            else if (C == E) countC++;
            System.out.println(C + " = " + countC);
}
        else if(D != A && D != B && D != C) {
            int countD = 1;
            if (D == E) countD++;
            System.out.println(D + " = " + countD);
}
         if(E != A && E != B && E != C && E != D) {
            System.out.println(E + " = 1");
}
}
}
