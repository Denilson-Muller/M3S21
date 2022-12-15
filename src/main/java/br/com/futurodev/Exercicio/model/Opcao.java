package br.com.futurodev.Exercicio.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Opcao {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    String CREDIT;
    String DEBIT;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
