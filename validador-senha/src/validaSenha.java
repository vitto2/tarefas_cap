
public class validaSenha {

	private String senha;
	private int digitosFaltantes;

	// Seta senha
	public void setPassword(String password) {

		this.senha = password;

	}

	// Retorna senha
	public String getSenha() {

		return this.senha;
	}

	// Retorna a quantidade de caracteres da senha
	public int passwordLength(String senha) {

		char[] senhaArray = senha.toCharArray();

		return senhaArray.length;

	}

	// Encontra numero
	public Boolean searchNumber(String senha) {

		String senhaModificada = senha.replaceAll("[\\D]", "");

		if (senha == senhaModificada) {
			return false;
		}

		return true;

	}

	// Valida se possui caracter especial
	public Boolean searchChar(String senha) {

		String senhaModificada = senha.replaceAll("[/[^a-zA-Z0-9]+/g\r\n" + "]", "");

		if (senha == senhaModificada) {
			return false;

		}
		return true;
	}

	// Valida se tem letras maiusculas
	public Boolean searchUpperCase(String senha) {

		String senhaModificada = senha.replaceAll("[A-Z]", "");

		if (senha == senhaModificada) {
			return false;

		}
		return true;
	}

	// valida se tem letras minusculas
	public Boolean searchLowerCase(String senha) {

		String senhaModificada = senha.replaceAll("[a-z]", "");

		if (senha == senhaModificada) {
			return false;

		}
		return true;
	}
}
