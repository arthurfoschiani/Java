package poo;

import java.util.ArrayList;

public class Ex60ContaBancaria {
	private int agencia;
	private int numero;
	private Double saldo;
	private ArrayList<String> extrato;
	private Double limite;

	public void setExtrato(String tipo, Double valor, String pos) {
		if (pos == "p")
			this.extrato.add("Operação: " + tipo + " || Valor: +" + valor);
		else
			this.extrato.add("Operação: " + tipo + " || Valor: -" + valor);
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public ArrayList<String> getExtrato() {
		return extrato;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	Ex60ContaBancaria () {
		
	}
	
	Ex60ContaBancaria (int agencia, int numero, ArrayList<String> extrato) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 0.0;
		this.extrato = extrato;
		this.limite = 75.00;
	}
	
	public void depositar(double valorDeposito) {
		if (this.limite == 75.0){		
			this.saldo += valorDeposito;
		}
		else {
			double num = 75 - this.limite;
			this.limite = this.limite + num;
			this.saldo = valorDeposito - num;
		}
	}
	
	public boolean sacar(double valorSaque) {
		if(this.saldo < valorSaque) {
			if (this.saldo + this.limite < valorSaque) {
				return false;
			}
			else {
				this.limite = this.limite - (valorSaque - this.saldo);
				this.saldo = 0.0;
				return true;
			}
		}
		else {
			this.saldo -= valorSaque;
			return true;
		}
	}
	
	public boolean transferir(double valorTransf, Ex60Cliente destinatario) {
		if(this.saldo < valorTransf) {
			if (this.saldo + this.limite < valorTransf) {
				return false;
			}
			else {
				this.limite = valorTransf - this.saldo;
				this.saldo = 0.0;
				destinatario.getConta().depositar(valorTransf);
				return true;
			}
		}
		else {
			this.saldo -= valorTransf;
			destinatario.getConta().depositar(valorTransf);
			return true;
		}
	}
	
	public String consultarSaldo() {
		return ("Saldo: " + this.saldo + "\nLimite: " + this.limite);
	}
}
