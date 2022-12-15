package br.com.futurodev.Exercicio.entidades;

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

public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String number;
    private Double limit;
    private Double currentLimit;
    EnumType typeCard;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
