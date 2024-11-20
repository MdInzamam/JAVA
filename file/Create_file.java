package file;

import java.io.*;
import java.util.Scanner;

public class Create_file {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\New folder\\test.txt");
		f.createNewFile();
		
		FileWriter fw = new FileWriter("D:\\\\New folder\\\\test.txt ");
		fw.write("My name is mohan");
		fw.close();
		
		Scanner sc = new Scanner(f);
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}

	}

}
