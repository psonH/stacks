package summers;

import java.util.*;
import java.io.*;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Character> brackets = new ArrayList<Character>(); /*to store the brackets,functions like a stack*/
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the expression:");
		String str = sc.next();
		/*Converts the string to character array*/
		char[] str_arr = str.toCharArray();
        
		/*scan the expression*/
		int valid = 0;
		char pop;
		for(int i=0; i<str_arr.length;i++){
			
			if(str_arr[i] == '{' || str_arr[i] == '(' || str_arr[i] == '['){
				if( i == str_arr.length -1){
					valid = 0;
					break;
				}
				brackets.add(str_arr[i]);
			}
			if(str_arr[i] == ']' || str_arr[i] == ')' || str_arr[i] == '}'){
				if(brackets.size() == 0){
					valid = 0;
					break;
				}
				else{
					pop=brackets.remove(brackets.size() - 1);
					if(str_arr[i] == ']' && (pop == '{' || pop == '(')){
						valid = 0;
					}else if(str_arr[i] == '}' && (pop == '[' || pop == '(')){
						valid = 0;
					}else if(str_arr[i] == ')' && (pop == '[' || pop == '{')){
						valid = 0; 
					}else{
						valid = 1;
					}
				}
			}
		}
		if(valid == 0){
			System.out.println("The brackets are not balanced");
		}else{
			if(brackets.size() == 0){
				System.out.println("The brackets are balanced.");
			}
			else{
				System.out.println("The brakets are not balanced");
			}
		}
	}
}
