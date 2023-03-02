package co.edu.uniquindio.proyecto.modelo;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

public class Libro implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    private String isbn;
    private String nombre;

    @Enumerated(EnumType.STRING)
    @ElementCollection
    List<Genero> generos;
    private int unidades;
    private int anio;
    }
