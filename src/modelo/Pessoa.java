package modelo;

import java.io.Serializable;
import java.lang.String;
import java.util.Collection;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Pessoa
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//O que vai diferenciar se é pessoa juridica ou fisica e terá o discriminatorType padrao = "string".
@DiscriminatorColumn(name = "tipo")
public abstract class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;
	private int codigo;
	private String nome;
	private String emaill;
	private String telefone;
	private Collection<Reserva> reservas;

	public Pessoa() {
		super();
	} 
	@Id
	@GeneratedValue(generator="genpessoa")
	@SequenceGenerator(sequenceName="pessoa_cod_seq", name="genpessoa")
	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}   
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}  
	
	@Column(nullable=false, unique=true) 
	public String getEmaill() {
		return this.emaill;
	}
	
	@Embedded
	public void setEmaill(String emaill) {
		this.emaill = emaill;
	}   
	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	@OneToMany(mappedBy="cliente")	
	public Collection<Reserva> getReservas() {
		return reservas;
	}
	public void setReservas(Collection<Reserva> reservas) {
		this.reservas = reservas;
	}
   
	
}
