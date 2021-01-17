package com.dev.iza.di.notificacao;

import com.dev.iza.application.entities.Cliente;

public class NotificacaoEmail implements Notificador {
	
	@Override
	public void notificar (Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do email %s: %s\n",
				cliente.getNome(), cliente.getEmail(), mensagem);
	}

}
