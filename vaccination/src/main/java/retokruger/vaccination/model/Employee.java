package retokruger.vaccination.model;

import javax.persistence.*;

@Entity
@Table (name = "employee")
public class Employee {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="emp_id")
    private Long emp_id;

    @Column(name = "emp_name")
    private String emp_name;

    @Column(name = "emp_lastname")
    private String emp_lastname;

    @Column(name = "emp_mail")
    private String emp_mail;

    @Column(name = "emp_datebirth")
    private String emp_datebirth;

    @Column(name = "emp_address")
    private String emp_address;

    @Column(name = "emp_cellphone")
    private String emp_cellphone;

    @Column(name = "emp_vaccinestatus")
    private String emp_vaccinestatus;

    @Column(name = "emp_vaccinename")
    private String emp_vaccinename;

    @Column(name = "emp_vaccinedate")
    private String emp_vaccinedate;

    @Column(name = "emp_vaccinedose")
    private Long emp_vaccinedose;

    @Column(name = "emp_user")
    private String emp_user;

    @Column(name = "emp_password")
    private String emp_password;

    @Column(name = "emp_identification")
    private String emp_identification;

    public Employee(String emp_name, String emp_lastname, String emp_mail, String emp_datebirth,
            String emp_address, String emp_cellphone, String emp_vaccinestatus, String emp_vaccinename,
            String emp_vaccinedate, Long emp_vaccinedose, String emp_user, String emp_password,
            String emp_identification) {
        this.emp_name = emp_name;
        this.emp_lastname = emp_lastname;
        this.emp_mail = emp_mail;
        this.emp_datebirth = emp_datebirth;
        this.emp_address = emp_address;
        this.emp_cellphone = emp_cellphone;
        this.emp_vaccinestatus = emp_vaccinestatus;
        this.emp_vaccinename = emp_vaccinename;
        this.emp_vaccinedate = emp_vaccinedate;
        this.emp_vaccinedose = emp_vaccinedose;
        this.emp_user = emp_user;
        this.emp_password = emp_password;
        this.emp_identification = emp_identification;
    }

    public Employee() {
    }

    public Long getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Long emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_lastname() {
        return emp_lastname;
    }

    public void setEmp_lastname(String emp_lastname) {
        this.emp_lastname = emp_lastname;
    }

    public String getEmp_mail() {
        return emp_mail;
    }

    public void setEmp_mail(String emp_mail) {
        this.emp_mail = emp_mail;
    }

    public String getEmp_datebirth() {
        return emp_datebirth;
    }

    public void setEmp_datebirth(String emp_datebirth) {
        this.emp_datebirth = emp_datebirth;
    }

    public String getEmp_address() {
        return emp_address;
    }

    public void setEmp_address(String emp_address) {
        this.emp_address = emp_address;
    }

    public String getEmp_cellphone() {
        return emp_cellphone;
    }

    public void setEmp_cellphone(String emp_cellphone) {
        this.emp_cellphone = emp_cellphone;
    }

    public String getEmp_vaccinestatus() {
        return emp_vaccinestatus;
    }

    public void setEmp_vaccinestatus(String emp_vaccinestatus) {
        this.emp_vaccinestatus = emp_vaccinestatus;
    }

    public String getEmp_vaccinename() {
        return emp_vaccinename;
    }

    public void setEmp_vaccinename(String emp_vaccinename) {
        this.emp_vaccinename = emp_vaccinename;
    }

    public String getEmp_vaccinedate() {
        return emp_vaccinedate;
    }

    public void setEmp_vaccinedate(String emp_vaccinedate) {
        this.emp_vaccinedate = emp_vaccinedate;
    }

    public Long getEmp_vaccinedose() {
        return emp_vaccinedose;
    }

    public void setEmp_vaccinedose(Long emp_vaccinedose) {
        this.emp_vaccinedose = emp_vaccinedose;
    }

    public String getEmp_user() {
        return emp_user;
    }

    public void setEmp_user(String emp_user) {
        this.emp_user = emp_user;
    }

    public String getEmp_password() {
        return emp_password;
    }

    public void setEmp_password(String emp_password) {
        this.emp_password = emp_password;
    }

    public String getEmp_identification() {
        return emp_identification;
    }

    public void setEmp_identification(String emp_identification) {
        this.emp_identification = emp_identification;
    }
    
}
