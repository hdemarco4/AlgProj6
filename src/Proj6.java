import java.io.*;
import java.util.*;

public class Proj6 {

    public static void main(String[] args) throws Exception{
        int capac = 0;
        int numitems = 0;
        int[][] data;
        int k = 0;
        int l = 0;


        Scanner input = new Scanner( new File( args[0] ) );
        capac = Integer.parseInt(input.nextLine());
        numitems = Integer.parseInt(input.nextLine());

        data = new int[numitems][3];

        for(int i = 0; i < numitems-1; i++)
        {
            data[i][0] = Integer.parseInt(input.next());
            data[i][1] = Integer.parseInt(input.next());
            data[i][2] = data[i][0]/data[i][1];
            input.nextLine();
        }
        data[numitems-1][0] = Integer.parseInt(input.next());
        data[numitems-1][1] = Integer.parseInt(input.next());
        data[numitems-1][2] = data[numitems-1][0]/data[numitems-1][1];

        System.out.println("Capacity is: " + capac);
        System.out.println("Items are: ");
        for(int j = 0; j < numitems; j++){
            System.out.println(j+1 + ": " + data[j][0] + " " + data[j][1] + " " + data[j][2]);

        }

        Node root = new Node();
        root.num = 1;
        root.items = "[]";
        root.level = 0;
        root.profit = 0;
        root.weight = 0;


        for(int m = 0; ; m++) {
            k = 0;

            while (k <= data[m][1]) {
                root.bound = root.bound + data[m][2];

            }


        }






    }



}
