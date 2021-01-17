package com.dev.iza.application;

import com.dev.iza.application.entities.Cliente;
import com.dev.iza.di.notificacao.NotificacaoEmail;
import com.dev.iza.di.notificacao.Notificador;
import com.dev.iza.service.AtivacaoCliente;

public class Program {

	public static void main(String[] args) {
		
		Cliente joao = new Cliente ("João", "61 -991598361", "Joao@gmail.com");
		Cliente maria = new Cliente ("Maria","61 -991598361","maria@gmail.com");
		
		Notificador notificador = new NotificacaoEmail();
		
		AtivacaoCliente ativarCliente = new AtivacaoCliente(notificador);
		ativarCliente.ativar(maria);
		ativarCliente.ativar(joao);

	}

}
