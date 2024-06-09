package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public @Data class Cidade implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 200)
    private String nome;
    @ManyToOne
    @JoinColumn(name="estado_id")
    private Estado estado;
    @OneToMany(mappedBy = "cidade")
    private List<Endereco> enderecos;
    
    public String[] getTitulosColunas() {
        return new String[]{"id", "Nome"};
    }

    public String[] getFiltros() {
        return new String[]{"id", "Nome", "RG"};
    }
}
