package com.dev.iza.di.notificacao;

import com.dev.iza.application.entities.Cliente;

public interface Notificador {
	
	void notificar (Cliente cliente, String mensagem);

}
