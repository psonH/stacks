import java.util.*;
public class InfixToPostfix extends Stack{
	public int priority(String token){
		if(token.equals("/") || token.equals("*")) return 2;
		if(token.equals("-") || token.equals("+")) return 1;
		return 0;
	}
	public static void main(String args[]){
		InfixToPostfix ip = new InfixToPostfix();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the expression:");
		String exp = sc.next();
		
		for(int i=0;i<exp.length();i++){
			String token = Character.toString(exp.charAt(i));
			//System.out.println("Next token:"+token);
			if(token.equals("(")){
				//System.out.println("Operator pushed:"+token);
				ip.push(token);
			}
			else if(token.equals(")")){
				String x=ip.pop();
				while(true){
					//ip.display();
					System.out.print(x);
					x=ip.pop();
					if(x.equals("(")){
						//System.out.println("Inside break");
						break;
					}
				}
			}
			else if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
				if(ip.emptyCheck() == true){
					ip.push(token);
					//System.out.println("Operator pushed:"+token);
				}
				else{
						while(!ip.emptyCheck() && (ip.priority(token) <= ip.priority(ip.topItem()))){
					      System.out.print(ip.pop());
					}
					/*System.out.println("Operator pushed:"+token);*/
					ip.push(token);
				}
			}
			else{
				System.out.print(token);
			}
		}
		while(ip.emptyCheck() == false){
			System.out.print(ip.pop());
		}				
	}
}
	
	
			
		
	