package package1;
import java.util.ArrayList;
import java.util.Scanner;

public class VowelThread extends Thread{
	String word;
	public int v=0;
	public int c=0;
	static Scanner inp = new Scanner(System.in);
	static ArrayList<Character> vowels = new ArrayList<>();
	void buildVowels(){
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		vowels.add('A');
		vowels.add('E');
		vowels.add('I');
		vowels.add('O');
		vowels.add('U');
	}
	VowelThread()	{
		buildVowels();
	}
	public void run()	{
		System.out.println("Enter a word: ");
		word = inp.next();
		
		for(int i=0;i<word.length();i++){
			char ch = word.charAt(i);
			if(vowels.contains(ch))
				v++;
			else
				c++;
		}
		System.out.println("Vowels: "+v);
		System.out.println("Consonants: "+c);
	}

}

