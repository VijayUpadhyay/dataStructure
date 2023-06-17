package com.vijay.bitwise;

public class AddOneToNumber {

	public static void main(String[] args) {
		int n = 11;
		int p= addOne(n);
		System.out.println(p);
	}

	public static int addOne(int n){
		int m=2;
		char[] t = Integer.toBinaryString(n).toCharArray(); 
		char[] c = Integer.toBinaryString(m).toCharArray();
		int cLength = c.length-1;
		int tLength = t.length-1;
		byte[] remainder = {0};
		char[] result = new char[tLength+1];
		while(cLength >= 0 && tLength >= cLength){// Allowed in C --  n&m at bit level
			if(remainder[0] == 1){
				
				if(t[cLength] == '0' && c[cLength] == '0'){
					result[tLength] = (char)remainder[0];
				}
				if((t[tLength]== '1' && c[cLength] == '0') ||(t[tLength]=='0' && c[cLength] =='1')){
					result[tLength] = '0';
					remainder[0] = 1;
				}
				
				if(t[tLength] == '1' && c[cLength] =='1'){
					 result[tLength]='1';
					 remainder[0]=1;
				}
			}
			else{
				if((t[tLength]=='1' && c[cLength] =='0') ||(t[tLength]== '0' && c[cLength] == '1')){
					result[tLength] = '1';
				}
				
				if(t[tLength] == '1' && c[cLength] =='1'){
					 result[tLength]='0';
					 remainder[0]=1;
				}
			}
			cLength--;
			tLength--;
		}
		if(tLength>cLength){
			for(int i = tLength;i>=0;i--){
				if(remainder[0] == 1){
					// To compute for numbers greater than 1. 
					if(t[tLength] == '1'){
						result[tLength] = '0';
						remainder[0]=1;
						tLength--;
					}else{
						result[tLength] = '1';
						remainder[0]=0;
						tLength--;
					}
				}else{
					result[tLength] = t[tLength];
					tLength--;
				}
			}
		}else{
			for(int i = cLength;i>=0;i--){

				if(remainder[0] == 1){
					// To compute for numbers greater than 1. 
					if(c[cLength] == '1'){
						result[cLength] = '0';
						remainder[0]=1;
						cLength--;
					}else{
						result[cLength] = '1';
						remainder[0]=0;
						cLength--;
					}
				}else{
					result[cLength] = c[cLength];
					cLength--;
				}
			}
		}
		// Change byte array into number;
		String p= new String(result);
		if(!p.isEmpty())
		System.out.println("P is: "+p);
		Integer k = Integer.parseInt(p,2);
		return k;
	}
}
