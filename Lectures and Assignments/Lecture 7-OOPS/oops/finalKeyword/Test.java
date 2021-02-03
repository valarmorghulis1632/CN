package Temp1.oops.finalKeyword;


 class User{
	
	 Encryption e;
	 User(Encryption e){
		 this.e = e;
	 }

	 void passWord(String password){
		e.encrypt(password) ;
	 }
	 
	 void retrievedPassWord(String decryptedPassWord){
		 e.decrypt(decryptedPassWord);
	 }
	
}

public class Test {

	public static void main(String[] args) {
		Encryption e = new HckEncryption();//new Encryption();
		
		User u = new User(e);
		
	}
}
