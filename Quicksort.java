import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;


/** Class for buffered reading int and double values */
class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    /** call this method to initialize reader for InputStream */
    static void init(InputStream input) {
        reader = new BufferedReader(
                     new InputStreamReader(input) );
        tokenizer = new StringTokenizer("");
    }

    /** get next word */
    static String next() throws IOException {
        while ( ! tokenizer.hasMoreTokens() ) {
            //TODO add check for eof if necessary
            tokenizer = new StringTokenizer(
                   reader.readLine() );
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt( next() );
    }
	
    static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    }
}

public class Quicksort{

    int arr[];
    int n;
    public static void main(String[] args) throws IOException{
        int a[] = { 45, 25, 7 ,82 ,13 ,60 ,40, 80, 9, 92};
        //System.out.println("hii");
        Quicksort ob = new Quicksort();
        ob.sort(a);

    }
    public void sort(int[] A){
        this.arr = A;
        this.n = A.length;
        quicksort(0,n-1);
    }

    public void quicksort(int l, int h){
        for(int ij=0;ij<n;ij++){
            System.out.print(arr[ij] + "  ");

        }
        System.out.println();
        int pivot = arr[l];
        int i=l+1;
        int j=h;
        //System.out.println(i  + " " + j);

        while(i<=j){
            while(pivot>arr[i] && i<=j){
                i++;
            }
            while(pivot<arr[j] && i<=j){
                j--;
            }
           
            if(i<=j){
                System.out.println(i  + " " + j);
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                for(int ij=0;ij<n;ij++){
                    System.out.print(arr[ij] + "  ");

                }
                System.out.println();//
            }
        }
        arr[l] = arr[j];
        arr[j] = pivot;
        System.out.println();


        for(int ij=0;ij<n;ij++){
            System.out.print(arr[ij] + "  ");
        }
        System.out.println();

        System.out.println(i  + " " + j);
        if(l<j-1){
            quicksort(l,j);}
        if(h>j+1){
            quicksort(j+1,h);}
    }
}