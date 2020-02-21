package leetcode_easy;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
	    //longestCommonPrefix();
		String[] input = {"flower","flow", "flight"}; 
		LongestCommonPrefix fx = new LongestCommonPrefix();
		System.out.println(fx.longestCommonPrefix(input));

	}
	
	public String longestCommonPrefix(String[] str)
	{
		String longestCommonPrefix="";
		if(str==null || str.length<0)
		{
			return longestCommonPrefix;
		}
		int index =0;
		for(Character c: str[0].toCharArray())
		{
			for(int i =1; i<str.length;i++)
			{
				if(index>= str[i].length()|| c!=str[i].charAt(index))
				{
					return longestCommonPrefix;
				}
			}
			longestCommonPrefix +=c;
			index ++;
		}
		return longestCommonPrefix;
		
	}

}
