package pattern;

import java.util.Scanner;

public class CharacterPattern {
    public static void characterPattern(int n){
        int tnol = n;
        int cnol = 1;
        char ch = 'A';
        int num = 1;
        while(cnol<=tnol){
            for(int i=1; i<=num; i++){
                System.out.print(ch++);
            }
            // prepare for next line
            cnol++;
            System.out.println();
            num++;
        }

    }


    public static void character_Pattern(int n){
        char ch = 'A';
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch++);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
        character_Pattern(n);
}
}

