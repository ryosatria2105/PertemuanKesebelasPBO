package Dialog;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "member_gym")
@NamedQueries({
    @NamedQuery(name = "MemberGym.findAll", query = "SELECT m FROM MemberGym m"),
    @NamedQuery(name = "MemberGym.findByIdMember", query = "SELECT m FROM MemberGym m WHERE m.idMember = :idMember"),
    @NamedQuery(name = "MemberGym.findByNama", query = "SELECT m FROM MemberGym m WHERE m.nama = :nama"),
    @NamedQuery(name = "MemberGym.findByTipePaket", query = "SELECT m FROM MemberGym m WHERE m.tipePaket = :tipePaket"),
    @NamedQuery(name = "MemberGym.findByCoach", query = "SELECT m FROM MemberGym m WHERE m.coach = :coach")
})
public class MemberGym implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "id_member")
    private Integer idMember;

    @Basic(optional = false)
    @Column(name = "nama")
    private String nama;

    @Basic(optional = false)
    @Column(name = "tipe_paket")
    private String tipePaket;

    @Column(name = "coach")
    private String coach;

    public MemberGym() {
    }

    public MemberGym(Integer idMember) {
        this.idMember = idMember;
    }

    public MemberGym(Integer idMember, String nama, String tipePaket, String coach) {
        this.idMember = idMember;
        this.nama = nama;
        this.tipePaket = tipePaket;
        this.coach = coach;
    }

    public Integer getIdMember() {
        return idMember;
    }

    public void setIdMember(Integer idMember) {
        this.idMember = idMember;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTipePaket() {
        return tipePaket;
    }

    public void setTipePaket(String tipePaket) {
        this.tipePaket = tipePaket;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMember != null ? idMember.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof MemberGym)) {
            return false;
        }
        MemberGym other = (MemberGym) object;
        if ((this.idMember == null && other.idMember != null) || 
            (this.idMember != null && !this.idMember.equals(other.idMember))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dialog.MemberGym[ idMember=" + idMember + " ]";
    }
}
