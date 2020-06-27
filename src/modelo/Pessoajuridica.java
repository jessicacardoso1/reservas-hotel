package modelo;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;
import modelo.Pessoa;

/**
 * Entity implementation class for Entity: Pessoajuridica
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("PJ")
public class Pessoajuridica extends Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;
	private String razaoSocial;
	private String cnpj;
	private String inscricaoEstadual;
	private String inscricaoMunicipal;
	
	public Pessoajuridica() {
		super();
	}   
	public String getRazaoSocial() {
		return this.razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}   
	public String getCnpj() {
		return this.cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}   
	public String getInscricaoEstadual() {
		return this.inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}   
	public String getInscricaoMunicipal() {
		return this.inscricaoMunicipal;
	}

	public void setInscricaoMunicipal(String inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}
   
}
