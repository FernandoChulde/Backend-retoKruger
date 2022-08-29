package retokruger.vaccination.model;

import javax.persistence.*;

@Entity
@Table (name = "administrator")
public class Administrator {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="adm_id")
    private Long adm_id;

    @Column(name="adm_user")
    private String adm_user;
    
    @Column(name="adm_password")
    private String adm_password;

    public Administrator(String adm_user, String adm_password) {
        this.adm_user = adm_user;
        this.adm_password = adm_password;
    }

    public Long getAdm_id() {
        return adm_id;
    }

    public void setAdm_id(Long adm_id) {
        this.adm_id = adm_id;
    }

    public String getAdm_user() {
        return adm_user;
    }

    public void setAdm_user(String adm_user) {
        this.adm_user = adm_user;
    }

    public String getAdm_password() {
        return adm_password;
    }

    public void setAdm_password(String adm_password) {
        this.adm_password = adm_password;
    }

    
}
