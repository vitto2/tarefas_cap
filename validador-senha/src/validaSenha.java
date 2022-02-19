
class ValidaSenha {

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

	public int validarSenha() {
		if (!this.searchNumber(this.senha)) {
			digitosFaltantes++;
		}
		if (!this.searchChar(this.senha)) {
			digitosFaltantes++;
		}
		if (!this.searchUpperCase(this.senha)) {
			digitosFaltantes++;
		}
		if (!this.searchLowerCase(this.senha)) {
			digitosFaltantes++;
		}
		int tamanhoMinimo = 6;
		int tamanho = this.senha.length();
		
		if (tamanho >= tamanhoMinimo) {
			return digitosFaltantes;
		} else {
			return digitosFaltantes + (tamanhoMinimo - tamanho - digitosFaltantes);
		}
	}

	// Encontra numero
	public Boolean searchNumber(String senha) {
		String senhaModificada = senha.replaceAll("[\\d]", "");
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