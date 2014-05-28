package algrithm;

import java.util.Stack;

/***
 * 
 * @author Chen Feng
 *
 */
public class ReverseWords {
	
	//push the string into stack, then reverse it
	public String Solution(String s){
		int len = s.length();
		int i=0;
		Stack<String> st = new Stack<String>();
		while(i<len){
			while(i<len && s.charAt(i)==' '){
				st.push(" ");
				i++;
			}
			String strtmp="";
			while(i<len && s.charAt(i)!=' '){
				strtmp+=s.charAt(i);
				i++;
			}
			if(strtmp.length()>0){
				st.push(strtmp);
			}
		}
		
		String res = "";
		while(st.size()>0){
			res+=st.pop();
		}
		
		return res;
	}

}
