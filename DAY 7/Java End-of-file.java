import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner (System.in);
        int n = 1;
        while (input.hasNext()){
            System.out.printf("%d %s\n" , n++ , input.nextLine());
        }
    }
}
