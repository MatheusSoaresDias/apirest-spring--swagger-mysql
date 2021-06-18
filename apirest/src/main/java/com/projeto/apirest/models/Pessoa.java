package com.projeto.apirest.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/*Edição para testar git clone*/

/* @Data is a convenient shortcut annotation that 
 * bundles the features of @ToString, @EqualsAndHashCode, 
 * @Getter / @Setter and @RequiredArgsConstructor together */
@Data
@Entity
@Table(name="pessoa)
public class Pessoa implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	// Setting Id to auto increment
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String email;
	
	private String password;
	
	private String name;
	
	private String cpf;
	
	private String cep;
	
	private String address;

}
