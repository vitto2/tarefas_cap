
public class Main {

	public static void main(String[] args) {

		ValidaSenha userVitor = new ValidaSenha();
	    //userVitor.setPassword("Ya3@");
	    userVitor.setPassword("Ya3");
	    int erros = userVitor.validarSenha();
	    System.out.println("Adicione " + erros + " digito(s) em sua senha.");
	    System.out.println(erros);
	}

}
