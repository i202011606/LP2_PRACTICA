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
@Table(name = "tbl_solicitud")
public class Solicitud {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nro_solicitud")
    private int nroSolicitud;

    @ManyToOne
    @JoinColumn(name = "id_actividad")
    private Actividad actividad;

    @Column(name = "estado")
    private String estado;

    @Column(name = "archivo_adjunto")
    private String archivoAdjunto;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_reg")
    private Date fechaReg;
}