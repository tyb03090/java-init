package p08;

class Computer {
	
}

class Calculator {
	
}

class Desktop extends Computer{
	
}

class Laptop {
	
}

public class CastingAndConvert {
	
	public static void main(String[] args) {
		
		byte b = 1;
		short s = b;
		int i = s;
		long l = i;
		
		i = (int)l;
		
		Computer c = new Desktop();
		Desktop d = (Desktop)c;
	}
}
