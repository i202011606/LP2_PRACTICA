package entitis;

import java.util.Date;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "tbl_actividad")
public class Actividad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_actividad")
    private int idActividad;

    @Column(name = "descripcion")
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_inicio")
    private Date fechaInicio;

    @Column(name = "nro_vacantes")
    private int nroVacantes;

    @Override
    public String toString() {
        return descripcion;
    }
}
