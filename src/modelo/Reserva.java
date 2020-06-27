package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import modelo.Pessoa;

/**
 * Entity implementation class for Entity: Reserva
 *
 */
@Entity
public class Reserva implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int codigo;
	private Date data;
	private double valor;
	private Pessoa cliente;
	

	public Reserva() {
		super();
	}   
	@Id    
	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}   
	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}   
	public double getValor() {
		return this.valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}  
	@ManyToOne
	@JoinColumn(name="cod_pessoa")
	public Pessoa getCliente() {
		return this.cliente;
	}

	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}
   
}
