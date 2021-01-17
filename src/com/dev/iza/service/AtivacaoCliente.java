package com.dev.iza.service;

import com.dev.iza.application.entities.Cliente;
import com.dev.iza.di.notificacao.Notificador;

public class AtivacaoCliente {

	private Notificador notificador;
	
	public AtivacaoCliente(Notificador notificador) {
		this.notificador = notificador;
	}
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		notificador.notificar(cliente, "Seu cadastro está ativo!");
	}
}
