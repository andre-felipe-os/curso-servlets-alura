package alura.servlets.gerenciador.modelo;

public class Usuario {
	
	private String login;
	private String senha;
	
	public Usuario(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public boolean verifica(String login, String senha) {
		return (this.login.equals(login) && this.senha.equals(senha)) ? true : false;
	}

}
