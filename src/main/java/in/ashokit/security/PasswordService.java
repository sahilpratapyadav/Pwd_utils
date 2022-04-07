package in.ashokit.security;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PasswordService {
	
	public static String encode(String txt) {
		
   		Encoder encode = Base64.getEncoder();
   		String encodeToString = encode.encodeToString(txt.getBytes());
   		//System.out.println(encodeToString);
		
		return encodeToString;
	}
	
	     
	
	public static String decode(String encodeTxt) {
		Decoder decoder = Base64.getDecoder();
		byte[]  decode=decoder.decode(encodeTxt);
		
		//System.out.println(decode);
		return new String(decode);
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
	}
	
	
 
} 
      
                                         
       

                      
  
              


        


                              
                               

                                                   