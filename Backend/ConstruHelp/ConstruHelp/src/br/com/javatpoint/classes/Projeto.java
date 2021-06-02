package br.com.javatpoint.classes;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.xml.crypto.Data;

@Entity
public class Projeto {
	@Id
	private long id;
	@Column
    private String nomeProjeto;
	@Column
    private String descricao;
	@Column
    private Data data;
	@Column
    private String status;
	
	@Embedded
    private Endereco endereco;
    

    public String getNomeProjeto(){
        return nomeProjeto;
    }
    public String getDescricao(){
        return descricao;
    }
    public Data getData(){
        return data;
    }
    public String getStatus(){
        return status;
    }

    public void setNomeProjeto(String nome){
        this.nomeProjeto = nome;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public void setData(Data data){
        this.data = data;
    }
    public void setStatus(String status){
        this.status = status;
    }

@Embeddable
public class Endereco {
	@Column
    private String rua;
	@Column
    private String bairro;
	@Column
    private String complemento;
	@Column
    private String cidade;
	@Column
    private String estado;
    
    public String getRua(){
        return rua;
    }
    public String getBairro(){
        return bairro;
    }
    public String getComplemento(){
        return complemento;
    }
    public String getCidade(){
        return cidade;
    }
    public String getEstado(){
        return estado;
    }

    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    public void setRua(String rua){
        this.rua = rua;
    }
    public void setComplemento(String complemento){
        this.complemento = complemento;
    }
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
}
}
