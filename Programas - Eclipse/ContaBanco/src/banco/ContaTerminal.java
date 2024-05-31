package banco;

import java.util.Scanner;
	
public class ContaTerminal {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		System.out.print("Deseja abrir uma conta? Digite '1' para SIM e '2' para NÃO.  ");
		int resposta = Integer.parseInt(ler.nextLine());
		if (resposta == 1) {			
			
			Dados conta1 = new Dados();
			System.out.print("Por favor, digite o número da Agência (xxx-x): ");
			conta1.agencia = ler.nextLine();			
			
			System.out.print("Agora insira o número da sua conta (xxxx): ");
			conta1.numero = ler.nextLine();
			
			System.out.print("Insira seu nome completo: ");
			conta1.nomeCliente = ler.nextLine();
			
			System.out.print("Qual saldo deseja inserir na conta: ");
			conta1.saldo = ler.nextDouble();			
			
			System.out.println(" ");
			System.out.println("Olá " + conta1.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta1.agencia + ", conta " + conta1.numero + " e seu saldo de R$" + conta1.saldo + " já está disponível para saque!");			
			System.out.println(" ");
			System.out.println("O que deseja realizar? ");
			System.out.println(" ");
			System.out.println("1- Fazer depósito");
			System.out.println("2- Fazer transferência");
			System.out.println("3- Fazer saque");
			System.out.println("4- Fechar programa");
			System.out.println(" ");
			System.out.println("Sua escolha é: ");
			int acao = ler.nextInt();
			switch (acao) {
			case 1:
				System.out.println("Que valor deseja depositar: R$");
				double valor = ler.nextDouble();
				conta1.deposito(valor);
				System.out.println(" ");
				System.out.println("Você depositou um valor de R$" + valor);
				System.out.println("Seu novo saldo é de R$" + conta1.saldo);
				System.out.println("Fim do procedimento.");
			break;
			case 2:
				System.out.println("Que valor deseja transferir: R$");
				double valor1 = ler.nextDouble();
				if (conta1.saldo >= valor1) {
					conta1.transferir(valor1);
					System.out.println(" ");
					System.out.println("Você transferiu um valor de R$" + valor1);
					System.out.println("Seu novo saldo é de R$" + conta1.saldo);
					System.out.println("Fim do procedimento.");
				}else{
					System.out.println("Você não possui saldo suficiente para essa transferência, fim do procedimento.");				    
				}				
			break;
			case 3:
				System.out.println("Que valor deseja sacar: R$");
				double valor2 = ler.nextDouble();
				if(conta1.saldo >= valor2) {
					conta1.sacar(valor2);
					System.out.println(" ");
					System.out.println("Você sacou um valor de R$" + valor2);
					System.out.println("Seu novo saldo é de R$" + conta1.saldo);
					System.out.println("Fim do procedimento."); 			
				}else {
					System.out.println("Você não possui saldo suficiente para esse saque, fim do procedimento.");
				}
				
				break;
			case 4:
			System.out.println("Fim da execução!");
			break;
			
			default:
				System.out.println("Essa não é uma opção válida! Reinicie o programa.");
			}
		} else {
			System.out.println("Abertura cancelada!");	
		}
		ler.close();
	}
}
