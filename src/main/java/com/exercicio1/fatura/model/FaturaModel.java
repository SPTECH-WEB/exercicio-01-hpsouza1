package com.exercicio1.fatura.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "faturas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FaturaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O número do cartão não pode estar em branco")
    @Pattern(regexp = "\\d{16}", message = "Deve conter exatamente 16 dígitos numéricos")
    private String numeroCartao;

    @NotBlank(message = "O nome do titular não pode estar em branco")
    @Size(min = 3, max = 100, message = "O nome do titular deve ter entre 3 e 100 caracteres")
    private String nomeTitular;

    @NotNull(message = "O valor não pode ser nulo")
    @DecimalMin(value = "10.00", message = "O valor mínimo é 10.00")
    @DecimalMax(value = "5000.00", message = "O valor máximo é 5000.00")
    private Double valor;

    @NotNull(message = "A data de pagamento não pode ser nula")
    @FutureOrPresent(message = "A data de pagamento deve ser presente ou futura")
    private LocalDate dataPagamento;

    @NotBlank(message = "O e-mail de contato não pode estar em branco")
    @Email(message = "Deve ser um e-mail válido")
    private String emailContato;
}