package com.guilhermealbuquerque.bookstore.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddressDTO {

  private String id;
  private String cep;

  private String logradouro;

  private String numero;
  private String bairro;
  private String complemento;

  private String estado;

  private ClientDTO clientDTO;
}
