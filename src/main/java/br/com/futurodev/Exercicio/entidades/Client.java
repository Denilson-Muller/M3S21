package br.com.futurodev.Exercicio.entidades;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

    @Data
    @NoArgsConstructor
    @Builder
    @Entity
    @AllArgsConstructor
    public class Client {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @NotNull
        private long id;
        @NotNull
        private String name;
        @Column(unique = true)
        private String cpf;
        @ManyToOne
        private Set<Card> cardList;
    }

