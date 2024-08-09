package _06_vault;

public class SecretAgent {
	public int findCode(Vault vault) {
		for(int i = 0; i < 1000001; i++) {
			if (vault.tryCode(i)) {
				return i;
			}
			
		}
		
		return -1;
		
	}
}