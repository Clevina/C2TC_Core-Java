
public class Cast {

	public static void main(String[] args) {
		int mint=0;
		float mfloat=4.125f;
		
		mint=(int)mfloat;//narrowing
		
		mfloat=(float)mint;//widening
		
		System.out.println(mint);
		System.out.println(mfloat);

	}

}
