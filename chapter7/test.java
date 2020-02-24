package chapter7;

public class test {

	public static void main(String[] args) {
		byte b1 = (byte) 3;
		String s1 = String.format("%8s", Integer.toBinaryString(b1 & 0xFF)).replace(' ', '0');
		System.out.println(s1); // 10000001

		byte b2 = (byte) 2;
		String s2 = String.format("%8s", Integer.toBinaryString(b2 & 0xFF)).replace(' ', '0');
		System.out.println(s2); // 00000010
		int i = -1;
		//Integer.toBinaryString(i);
		System.out.println(Integer.toBinaryString(-1));
		System.out.println((char)99);
		
		System.out.println( 1 + 16 );
		System.out.println( "1" + 16 );
		System.out.println( '1' + 16 );
		System.out.println( (char)('1' + 16) );
		System.out.println();
		String text = "1,2,3,4";
		String[] itemArray = text.split(",");
		for (String item : itemArray) {
		 System.out.println(item);
		}


	}

}
