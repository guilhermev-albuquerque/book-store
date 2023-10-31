package com.guilhermealbuquerque.bookstore.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "endereco")
public class AddressEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "id")
  private String id;

  @Column(name = "cep")
  private String cep;

  @Column(name = "logradouro")
  private String logradouro;

  @Column(name = "numero")
  private String numero;

  @Column(name = "bairro")
  private String bairro;

  @Column(name = "complemento")
  private String complemento;

  @Column(name = "uf")
  private String estado;

  @ManyToOne
  @JoinColumn(name = "cliente_fk")
  private ClientEntity client;
}
