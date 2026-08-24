package day5training;

public class rebark {
	public static void main(String[] args) {
		String text ="I love java proramming :";
		String pattern =" java";
		int position = search(text,pattern);
		if (position!=-1) {
			System.out.println("pattran founf at the index"+ position);
		}else 
		{
			System.out.println("pattern not found");
		}
	}
		static int search(String text, String Pattern) {
			int n=text.length();
			int m=Pattern.length();
			int patternHash=getHash(Pattern);
			for(int i=0;i<=n-m;i++) {
				int partHash =getHash(part);
				if(patternHash==partHash) {
					if(part.equals(Pattern)) {
						return i;
					}
				}
			}
			return -1;
			
		
	}
		static int getHash(String str)
		{
			int hash=0;
			for(int i=0;i<=str.length();i++) {
				hash=hash+str.charAt(i);
			}
			return hash;
		}

}
