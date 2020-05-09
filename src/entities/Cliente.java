package entities;

public class Cliente {

	private int numConta;
	private String nomeTitular;
	private double saldo;

	public Cliente(int numConta, String nomeTitular, double valor) {
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
		deposito(valor);
	}

	public Cliente(int numConta, String nomeTitular) {
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public int getNumConta() {
		return numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double valor) {
		this.saldo += valor;
	}

	public void saque(double valor) {
		this.saldo -= 5.0 + valor;
	}

	public String toString() {
		return "Account " + numConta + ", Holder: " + nomeTitular + ", Balance: $ " + saldo;
	}
}
