package Part2_B;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Part2_B {
    public static void lines(){

    }

    public static void read(File f) throws FileNotFoundException {
        Scanner reader = new Scanner(f);
        Stack<String> stack = new Stack<>();
        int num_datasets_M = reader.nextInt()+1;

        Stack [] stack_arr = new Stack[num_datasets_M];

        for (int i = 0; i< num_datasets_M;i++){
            String s = reader.nextLine();       //input each line into a string
            if (s == ""){                       //Skips the first line
                continue;
            }
            stack_arr[i] = new Stack<String>();  //
            String [] split = s.split(" ");

            for(int j = 0;j<split.length;j++){
                stack_arr[i].push(split[j]);
            }

            System.out.println(stack_arr[i]);

        }




    }

    public static void main(String[] args) throws IOException {

        try{
            //src/Part2_A/in.txt
            File in = new File(args[0]);
            File out = new File(args[1]);
            if (in.createNewFile()) {
                System.out.println("File created: " + in.getName());
            }

            else {
                System.out.println("Input File already exists.");
            }

            if (out.createNewFile()) {
                System.out.println("File created: " + out.getName());
            }
            else {
                System.out.println("Output File already exists.");
            }
            read(in);
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
