
public class Demo2 {

	public static void main(String[] args) {
		byte b=10;
		short s=20;
		int i =30;
		long l=40;
		float f=50.0F;
		double d=60.0D;
		char c='a';
		boolean b2=true;
		//autoboxing 
		Byte byteobj=b;
		Short shortobj=s;
		Integer intobj=30;
		Long longobj=l;
		Float floatobj=f;
		Double doubleobj=d;
		Character charobj=c;
		Boolean booleanobj=b2;
		System.out.println("Byte object:"+byteobj);
		System.out.println("Short object:"+shortobj);
		System.out.println("Integer object:"+intobj);
		System.out.println("Long object:"+longobj);
		System.out.println("Float object:"+floatobj);
		System.out.println("Double object:"+doubleobj);
		System.out.println("Character object:"+charobj);
		System.out.println("Boolean object:"+booleanobj);
		//Unboxing
		byte bytevalue=byteobj;
		short shortvalue=shortobj;
		int intvalue=intobj;
		long longvalue=longobj;
		float floatvalue=floatobj;
		double doublevalue=doubleobj;
		char charvalue=charobj;
		boolean booleanvalue=booleanobj;
		System.out.println("Byte value:"+bytevalue);
		System.out.println("Short value:"+shortvalue);
		System.out.println("Integer value:"+intvalue);
		System.out.println("Long value:" +longvalue);
		System.out.println("Float value:"+floatvalue);
		System.out.println("Double value:"+doublevalue);
		System.out.println("Character value:"+charvalue);
		System.out.println("Boolean value:"+booleanvalue);
	}

}
