
public class Cast {

	public static void main(String[] args) {
		int mInt=0;
		float mFloat=4.125f;
		
		mInt=(int)mFloat;//narrowing
		
		mFloat=(float)mInt;//widening
		
		System.out.println(mInt);
		System.out.println(mFloat);

	}

}
