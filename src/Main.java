public class Main {
    public static void main(String[] args)  {
       Cliente patricia = new Cliente();
       patricia.setNome("Patricia");
    	Conta cc = new ContaCorrente(patricia); // ao chamar esse construtor já irá gerar agencia e número
       cc.depositar(100);
              
        Conta poupanca = new ContaPoupanca(patricia); 
        
        cc.transferir(50,poupanca);
    
       cc.imprimirExtrato();
       poupanca.imprimirExtrato();
       poupanca.simularRendimento();

    }
}
