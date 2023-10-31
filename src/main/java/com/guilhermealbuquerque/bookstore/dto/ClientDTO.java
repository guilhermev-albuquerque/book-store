package com.guilhermealbuquerque.bookstore.dto;

import java.util.List;

import com.guilhermealbuquerque.bookstore.entity.DocumentType;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClientDTO {
  private String id;

  private String nome;

  private String telefone;

  private DocumentType documentType;

  private List<AddressDTO> address;

}