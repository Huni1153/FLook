package cipher;

import iros.pubc.cmm.util.cipher.Cipher;

public class CipherTest {
	
    public String encrypt(String encType, String inData, String secKey) throws Exception{
    	try{
    		return Cipher.encrypt(encType, inData, secKey);
    	}catch(Exception e){
			System.out.println(e.toString());
    		throw e;
    	}
    }

    public String decrypt(String encType, String inData, String secKey) throws Exception{
    	try{
    		return Cipher.decrypt(encType, inData, secKey);
    	}catch(Exception e){
			System.out.println(e.toString());
    		throw e;
    	}
    }

    public static void main(String[] args) {
    	
    	CipherTest cipherTest = new CipherTest();
    	
    	//"ARIA" 와 "SEED" 중 선택
    	String encType = "ARIA";
    	
    	//암복호화시 사용할 키값으로 공유자원포털로부터 부여받은 서비스 인증키를 사용한다.
    	String secKey = "xjdQEawBMtwWRcfHdopIK61TtY6zQ1p3s+M7JORsqdltzSH1ArC3tBR2pfbng3S9Mfh8heYma1eyKLepPnXKAQ==";
    	
    	//암호화할 데이터
    	String inData = "실제 암호활 데이터값입니다.";
    	
    	//복호화할 데이터
    	String outData = "";
    	
    	try {
    		//데이터 암호화
    		outData = cipherTest.encrypt(encType, inData, secKey);
			System.out.println(outData);
			
			//데이터 복호화
			String temp = cipherTest.decrypt("ARIA", outData, secKey);
			System.out.println(temp);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
