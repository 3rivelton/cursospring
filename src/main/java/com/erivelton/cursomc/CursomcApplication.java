package com.erivelton.cursomc;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.erivelton.cursomc.domain.Categoria;
import com.erivelton.cursomc.domain.Cidade;
import com.erivelton.cursomc.domain.Cliente;
import com.erivelton.cursomc.domain.Endereco;
import com.erivelton.cursomc.domain.Estado;
import com.erivelton.cursomc.domain.ItemPedido;
import com.erivelton.cursomc.domain.Pagamento;
import com.erivelton.cursomc.domain.PagamentoComBoleto;
import com.erivelton.cursomc.domain.PagamentoComCartao;
import com.erivelton.cursomc.domain.Pedido;
import com.erivelton.cursomc.domain.Produto;
import com.erivelton.cursomc.domain.enums.EstadoPagamento;
import com.erivelton.cursomc.domain.enums.TipoCliente;
import com.erivelton.cursomc.repositories.CategoriaRepository;
import com.erivelton.cursomc.repositories.CidadeRepository;
import com.erivelton.cursomc.repositories.ClienteRepository;
import com.erivelton.cursomc.repositories.EnderecoRepository;
import com.erivelton.cursomc.repositories.EstadoRepository;
import com.erivelton.cursomc.repositories.ItemPedidoRepository;
import com.erivelton.cursomc.repositories.PagamentoRepository;
import com.erivelton.cursomc.repositories.PedidoRepository;
import com.erivelton.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

	
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		
	}

}
