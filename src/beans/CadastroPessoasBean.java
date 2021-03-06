package beans;

import java.util.ArrayList;
import java.util.Collection;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import modelo.Pessoa;
import modelo.PessoaFisica;
import modelo.Sexo;

@ManagedBean
@SessionScoped
public class CadastroPessoasBean {
	private Pessoa pessoaSelecionada;
	private Collection<Pessoa> lista;
	private String tipoNovaPessoa;
	
	public CadastroPessoasBean() {
		pessoaSelecionada = new PessoaFisica();
		lista = new ArrayList<Pessoa>();
		
		for(int x = 0; x < 10; x++){
			Pessoa p = new PessoaFisica();
			p.setNome(String.format("Fulano %02d", x));
			p.setEmail(String.format("fulano@02@teste.com", x));
			p.setTelefone(String.format("9999.%02d", x));
			
			lista.add(p);
		}
	}
	
	public void salvar(){
		if(!lista.contains(pessoaSelecionada)) {
			lista.add(pessoaSelecionada);
		}
	}
	public String cancelar(){
		return "primeiro.jsf";
	}

	public void excluir(){
		lista.remove(pessoaSelecionada);
		pessoaSelecionada = new PessoaFisica();
		FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Pessoa exclu�da com sucesso!", null));
	}
	
	public Pessoa getPessoaSelecionada() {
		return pessoaSelecionada;
	}

	public void setPessoaSelecionada(Pessoa pessoaSelecionada) {
		this.pessoaSelecionada = pessoaSelecionada;
	}

	public Collection<Pessoa> getLista() {
		return lista;
	}

	public void setLista(Collection<Pessoa> lista) {
		this.lista = lista;
	}
	
	public Sexo[] getSexos(){
		return Sexo.values();
	}

	public String getTipoNovaPessoa() {
		return tipoNovaPessoa;
	}

	public void setTipoNovaPessoa(String tipoNovaPessoa) {
		this.tipoNovaPessoa = tipoNovaPessoa;
	}
	
	

}
