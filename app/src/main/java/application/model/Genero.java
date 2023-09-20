package application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;


@Entity
@Table(name="generos")
public class Genero {

    @Id //indica chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String nome;
    
    //Get e Set do Id
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    //Get e Set do Nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
