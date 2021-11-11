package com.nttdata.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
public class Account {
  private Integer id;
  private String numberAccount;
  private String descriptionAccount;
  private Integer personId;
}
