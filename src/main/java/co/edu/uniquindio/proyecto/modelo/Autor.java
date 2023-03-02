package co.edu.uniquindio.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Entity

public class Autor {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)private String codigoAutoge;
    private String nombre;

}
