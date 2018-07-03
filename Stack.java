import java.util.*;
interface Stack_Interface{
	public String pop();
	public void push(String str);
	public void display();
	public void cleanStack();
	public boolean emptyCheck();
	public String topItem();
}
class Stack implements Stack_Interface{
	ArrayList<String> s = new ArrayList<String>();
	public String pop(){
		return s.remove(s.size()-1);
	}
	public void push(String str){
		s.add(str);
	}
	public void display(){
		for(String exp:s){
			System.out.print(exp);
		}
	}
	public void cleanStack(){
		s.clear();
	}
	public boolean emptyCheck(){
		if(s.isEmpty()){
			return true;
		}
		return false;
	}
	public String topItem(){
		return s.get(s.size()-1);
	}
}
	
