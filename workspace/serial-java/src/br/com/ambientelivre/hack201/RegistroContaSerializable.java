package br.com.ambientelivre.hack201;

import java.io.Serializable;


public class RegistroContaSerializable implements Serializable {

	private int conta;
	private String primeiroNome;
	private String sobreNome;
	private double saldo;
	
	public RegistroContaSerializable()
	{
		this(0,"","",0.0);
		
	}

	public RegistroContaSerializable(int cct, String nome, String sobre, double sal) {
		setConta(cct);
		setPrimeiroNome(nome);
		setSobreNome(sobre);
		setSaldo(sal);	
	}
	
	public void setConta(int cct)
	{
		conta = cct;
	}
	
	public int getConta()
	{
		return conta;
	}
	
	public void setPrimeiroNome(String nome)
	{
		primeiroNome = nome;
	}
	
	public String getPrimeiroNome()
	{
		return primeiroNome;
	}

	public void setSobreNome(String sobre)
	{
		sobreNome = sobre;
	}
	
	public String getSobreNome()
	{
		return sobreNome;
	}

	public void setSaldo(double sal)
	{
		saldo = sal;
	}
	
	public double getSaldo()
	{
		return saldo;
	}	
	
}