package co.edu.uniquindio.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode

public class Prestamo {
    @Id
    private String codigo;
    private String cedula_persona;
    private String fecha_prestamo;
    private String fecha_devolucion;

}
