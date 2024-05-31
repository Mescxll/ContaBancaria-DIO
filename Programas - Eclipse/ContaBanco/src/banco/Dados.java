package banco;

public class Dados {
	double saldo;
	String agencia;
	String numero;
	String nomeCliente;
	
	
	public void deposito(double valor){
		saldo = saldo + valor;
	}

	public void transferir (double valor) {
		if (saldo >= valor) {
			saldo = saldo - valor;
		}
	}
	
	public void sacar (double valor) {
		if(saldo >= valor) {
			saldo = saldo - valor; 			
		}
	}
}
