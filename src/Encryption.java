import org.jasypt.util.text.BasicTextEncryptor;

public class Encryption {
	public String encrypt(String key, String toEncrypt) throws Exception {
		BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
		textEncryptor.setPassword(key);
		return textEncryptor.encrypt(toEncrypt);
	    }
	public String decrypt(String key, String toEncrypt) throws Exception {
		BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
		textEncryptor.setPassword(key);
		return textEncryptor.decrypt(toEncrypt);
	  }
}