package com.jonalake.pokeapi.pokemon;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

import lombok.Data;

@Entity
@Data
@Table(name = "pokemon")
public class Pokemon {

  @Column(name = "name")
  private String name;

  @Column(name = "image_url")
  private String imageUrl;
}