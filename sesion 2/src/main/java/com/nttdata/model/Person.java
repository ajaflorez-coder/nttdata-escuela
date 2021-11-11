package com.nttdata.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
public class Person {
  private Integer id;
  private String lastName;
  private String firstName;
  private String dni;
  private String ruc;
}
