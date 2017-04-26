/**
 * 테스트 코드를 보고, 아래 두 method 를 작성해주세요.
 */
class Questing {
	static int quest1(double d)  {
		
		int value = (int)Math.floor(d);
		
		if(value < 0 )
		{
			return -1;
		}
		
		if(value == 0)
		{
			return value;
		}
		
		if(value % 2 == 0)
		{
			return value / 2;
		}
		
		// FIXME
		return -1;
	}

	static boolean quest2(String s) {
		
		
		if(s == null)
		{
			return false;
		}
		
		Stack stack = new Stack(s.length());
		char cArr[] = s.toCharArray();
		boolean bool = false;
		
		int count = 0;
		for(Character c : cArr)
		{
			switch (c) {
			case '(':
			case '[':
			case '{':
				stack.Push(c);
				break;
			case ')':
				bool = validStack(stack, c, '(');
				break;
			case ']':
				bool = validStack(stack, c, '[');
				break;
			case '}':
				bool = validStack(stack, c, '{');
				break;
			}
			
			if(bool)
			{
				break;
			}
			count ++;
		}
		
		if(stack.isEmpty() && count == s.length())
		{
			return true;
		}
		
		// FIXME
		return false;
	}
	
	public static boolean validStack(Stack stack, char inputValue, char checkValue)
	{
		boolean bool = false;
		
		if(stack.isEmpty() || (inputValue = stack.pop()) != checkValue)
		{
			bool = true;
		}
		
		return bool;
	}
	
}


class  Stack {
	char[] stackArr;
	int top;
	
	public Stack(int size){
		stackArr = new char[size];
		this.top = -1;
	}
	
	public void Push(char c){
		stackArr[++top] = c;
	}
	
	public char pop(){
		return stackArr[top--];
	}
	
	public boolean isEmpty(){
		if(top == -1)
		{
			return true;
		}
		
		return false;
	}
}
