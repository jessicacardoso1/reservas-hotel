package beans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class MeuPrimeiroBean {
	private String ola = "Ola amigos";
	private boolean exibir = true;
	public String getOla() {
		return ola;
	}
		
}
