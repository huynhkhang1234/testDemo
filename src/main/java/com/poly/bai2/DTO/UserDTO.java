package com.poly.bai2.DTO;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
@Null
private Integer id;

	@NotNull
	@NotBlank
	private String username;

	@NotNull
	@NotBlank
	private String passWord;

	@NotNull
	@NotBlank
	@Email
	private String email;

	@NotNull
	@NotBlank
	private String photo;

	@NotNull	
	private Integer activated;

	@NotNull
	private Integer admin;
}
