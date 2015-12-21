package cn.edu.bnu.land.common;

import java.io.UnsupportedEncodingException;

public class Encoder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static String encode(String value){
		String value2="";
		try {
			if(value!=null&&!value.equals(""))
			 value2=new String(value.getBytes("ISO8859_1"),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value2; 
	}

}

