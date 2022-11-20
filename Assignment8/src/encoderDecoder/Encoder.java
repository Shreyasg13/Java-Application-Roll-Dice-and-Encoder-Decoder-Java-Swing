package encoderDecoder;
public class Encoder {


	public static String encodeNumeric(String s) {
		String res="";
		for (int i = 0; i < s.length(); i++){
		    char c = s.charAt(i); 
		    char space=' ';
		    if (c==space)
		    {
		    	res+=space;
		    }
		    else {
		    	res+=(c-'a'+1);
			    res=res+".";
		    }
		    
		}
		//System.out.println(res);
		return res;
	}
	
	public static String encodeROT13(String s) {
		String res="";
		String alphabets="abcdefghijklmnopqrstuvwxyz";
		char sp=' ';
		for (int i = 0; i < s.length(); i++){
		    char c = alphabets.charAt(((s.charAt(i)-'a'+1)+13-1)%26); 
		    if (s.charAt(i)==sp)
		    {
		    	res+=sp;
		    }
		    else
		    {
			    res+=(c);
		    }
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		String x="abc de f";
		String a=encodeNumeric(x);
		String b=encodeROT13(x);
		//checking encoding functions
		System.out.println("Input : " +x );
		System.out.println("Numeric : " + a);
		System.out.println("ROT13 : " + b);
		
	}
}
