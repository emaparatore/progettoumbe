package entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "attivita")
public class Attivita {
	
	@Id private String id;
	private String categoria;
	private String nome;
	private Date dataInizio;
	private Date dataScadenza;
	private Double tempoDedicato;	
	
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataInizio() {
		return dataInizio;
	}
	public void setDataInizio(Date dataInizio) {
		this.dataInizio = dataInizio;
	}
	public Date getDataScadenza() {
		return dataScadenza;
	}
	public void setDataScadenza(Date dataFine) {
		this.dataScadenza = dataFine;
	}
	public Double getTempoDedicato() {
		return tempoDedicato;
	}
	public void setTempoDedicato(Double tempoDedicato) {
		this.tempoDedicato = tempoDedicato;
	}
	
	
	
	
}
