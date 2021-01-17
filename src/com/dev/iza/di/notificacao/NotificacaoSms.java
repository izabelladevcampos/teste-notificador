package com.dev.iza.di.notificacao;

import com.dev.iza.application.entities.Cliente;

public class NotificacaoSms implements Notificador{
	
	@Override
	public void notificar (Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do telefone %s: %s/n",
				cliente.getNome(), cliente.getTelefone(), mensagem);
	}

}
