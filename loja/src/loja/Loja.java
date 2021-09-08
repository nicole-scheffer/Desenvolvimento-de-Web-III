package loja;

import java.time.LocalDate;

public class Loja {
	public static void main(String[] args) {
		Vendedores vend1 = new Vendedores();
		Vendedores vend2 = new Vendedores();
		Clientes clie1 = new Clientes();
		Clientes clie2 = new Clientes();
		Fornecedores for1 = new Fornecedores();
		Fornecedores for2 = new Fornecedores();
		Produtos prod1 = new Produtos();
		Produtos prod2 = new Produtos();
		Transportadora tran1 = new Transportadora();
		Vendas vendas = new Vendas();
		Estoque est = new Estoque();
		
		vend1.localDeTrabalho = "rua 321";
		vend1.salario = "123 bonoros";
		vend1.nomeCompleto = "bernardo de pinto";
		
		vend2.localDeTrabalho = "rua 321";
		vend2.salario = "124 bonoros";
		vend2.nomeCompleto = "giuseppe cadura";
		
		clie1.cpf = "190903232";
		clie1.dinheiro = "12 bonoros";
		clie1.enderecoDeEntrega = "rua 2";
		clie1.idade = "321 anos";
		clie1.numerodoCartaoCromado = "4002";
		clie1.pedido = "ampulheta";
		clie1.telefone = "190";
		clie1.nomeCompleto = "pedrim do pneu";
		
		clie2.cpf = "00000009";
		clie2.dinheiro = "22 bonoros";
		clie2.enderecoDeEntrega = "rua 57";
		clie2.idade = "2 anos";
		clie2.numerodoCartaoCromado = "8922";
		clie2.pedido = "peppa verde blindada";
		clie2.telefone = "30265";
		clie2.nomeCompleto = "paula";
		
		for1.cnpj = "584";
		for1.dataDeEntrega = LocalDate.of(2012, 12, 12);
		for1.dataDeSaida = LocalDate.now();
		for1.produto = "ampulheta";
		for1.quantidadeDePedido = "1";
		
		for2.cnpj = "5312672";
		for2.dataDeEntrega = LocalDate.of(3012, 02, 17);
		for2.dataDeSaida = LocalDate.now();
		for2.produto = "peppa verde blindada";
		for2.quantidadeDePedido = "39";
		
		prod1.preco = "R$22";
		prod1.nome = "peppa verde blindada";
		prod1.estoque = "45";
		prod1.precoDoFrete = "12";
		prod1.transportadora = "vendemais";
		
		prod2.preco = "R$12";
		prod2.nome = "ampulheta";
		prod2.estoque = "17";
		prod2.precoDoFrete = "7";
		prod2.transportadora = "vendemais";
		
		tran1.nome = "vendemais";
		tran1.endereco = "Rua travecao leopoldina";
		tran1.telefone = "6066";
		tran1.email = "juninportugal@l.gov.br";
		tran1.caminhao = "1";
		
		vendas.meta = "R$250";
		vendas.relatorio = "Em andamento";
		vendas.promocao = "3 produtos";
		vendas.desenvolvimentoDaEquipe = "Execelente";
		
		est.produtos = "37";
		est.bagunca = "7%";
		est.pratilheiras = "40";
		est.produtosComDefeito = "3";
		
		System.out.printf("O vendedor %s, trabalha na %s e atualmente tem o salario de %s ", vend1.nomeCompleto,vend1.localDeTrabalho,vend1.salario);
		
		System.out.println();
		
		System.out.printf("O vendedor %s, trabalha na %s e atualmente tem o salario de %s ", vend2.nomeCompleto,vend2.localDeTrabalho,vend2.salario);
		
		System.out.println();
		
		System.out.printf("O cliente %s, de cpf %s, idade de %s, telefone número: %s, entregou para o vendedor %s uma quantia de %s no cartão de número %s, para comprar um(a) %s, para entregar em %s",
				clie1.nomeCompleto,clie1.cpf,clie1.idade,clie1.telefone,vend2.nomeCompleto,clie1.dinheiro,clie1.numerodoCartaoCromado,clie1.pedido,clie1.enderecoDeEntrega);
		
		System.out.println();
		
		System.out.printf("O cliente %s, de cpf %s, idade de %s, telefone número: %s, entregou para o vendedor %s uma quantia de %s no cartão de número %s, para comprar um(a) %s, para entregar em %s",
				clie2.nomeCompleto,clie2.cpf,clie2.idade,clie2.telefone,vend2.nomeCompleto,clie2.dinheiro,clie2.numerodoCartaoCromado,clie2.pedido,clie2.enderecoDeEntrega);
	
		System.out.println();
		
		System.out.printf("O fornecedor de cnpj %s, saiu para entrega dia %s para chegar dia %s, levando %s numa quantidade de %s",
				for1.cnpj, for1.dataDeSaida, for1.dataDeEntrega, for1.produto, for1.quantidadeDePedido);
		 
		System.out.println();
		 
		System.out.printf("O fornecedor de cnpj %s, saiu para entrega dia %s para chegar dia %s, levando %s numa quantidade de %s",
				for2.cnpj, for2.dataDeSaida, for2.dataDeEntrega, for2.produto, for2.quantidadeDePedido);
		
		System.out.println();
		
		System.out.printf("O produto de nome: %s, está atualmente com o preço de %s e com %s em estoque, chegou com a transportadora %s com o valor do frete de %s",
				prod1.nome, prod1.preco, prod1.estoque, prod1.transportadora, prod1.precoDoFrete);
		
		System.out.println();
		
		System.out.printf("O produto de nome: %s, está atualmente com o preço de %s e com %s em estoque, chegou com a transportadora %s com o valor do frete de %s",
				prod2.nome, prod2.preco, prod2.estoque, prod2.transportadora, prod2.precoDoFrete);
		
		System.out.println();
		
		System.out.printf("A transportadora %s que fica localizada na %s, tem o número de telefone: %s, e o email: %s, está atualmente trabalhando com %s caminhão(s)",
				tran1.nome, tran1.endereco, tran1.telefone, tran1.email, tran1.caminhao);
	
		System.out.println();
		
		System.out.printf("A meta de vendas atualmente está com o valor de %s, o status atual dela é: %s, estamos com um total de %s produtos em promoção. A equipe está com o status de: %s em relação a meta",
				vendas.meta, vendas.relatorio, vendas.promocao, vendas.desenvolvimentoDaEquipe);
		
		System.out.println();
		
		System.out.printf("Temos atualmente %s produtos em estoque, o nivel de bagunça está em %s, há %s pratilheiras vazias e foram encontados %s produtos com defeitos", 
				est.produtos, est.bagunca, est.pratilheiras, est.produtosComDefeito);
		System.out.println();
		System.out.println("Feito por nicole, Vinicius e Guilherme Costa");
	}
}
