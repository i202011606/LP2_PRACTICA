package entitis;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "tbl_categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private int idCategoria;

    @Column(name = "descripcion")
    private String descripcion;

    @Override
    public String toString() {
        return descripcion;
    }
}