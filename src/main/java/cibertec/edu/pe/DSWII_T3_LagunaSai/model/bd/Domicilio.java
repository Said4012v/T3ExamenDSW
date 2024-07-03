package cibertec.edu.pe.DSWII_T3_LagunaSai.model.bd;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Domicilio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDomicilio;

    @Column(nullable = false)
    private String descDomicilio;

    @Column(nullable = false)
    private int nroDomicilio;

    @Column(nullable = false)
    private String refDomicilio;
}