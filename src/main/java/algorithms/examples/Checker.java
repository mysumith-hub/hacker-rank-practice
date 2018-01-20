package algorithms.examples;

public class Checker {

	public static void main(String args[]){
		new Checker().check("([[]])");
	}
	public void check(String str){
		Stack stack = new Stack(str.length());
		
		for(int i=0;i<str.length();i++){
			int peek = stack.peek();
			if(peek != 0){
				int ch = str.charAt(i);
				if(ch == '(' ){
					
				}
			}else{
				stack.push(str.charAt(i));
			}
			
		}
	}
}
class Stack{
	
	int array[];
	int size = -1;
	public Stack(int size){
		array = new int[size];
	}
	public void push(int data){
		array[++size] = data;
	}
	public void pop(){
		if(size == 0){
			return;
		}
		array[size] = 0;
		--size;
	}
	public int peek(){
		if(size == 0){
			return 0;
		}
		return array[size];
	}
}
