package br.com.sky.chat.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "tb_usuarios")
@Data 
@NoArgsConstructor 
@AllArgsConstructor 
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String senha;

    private String fotoUrl;

    // Salvamos como String no banco de dados para ficar legível (ONLINE, AUSENTE, etc.)
    @Enumerated(EnumType.STRING)
    private StatusLua status = StatusLua.ONLINE; // Todo usuário novo começa como Lua Cheia (Online)
}