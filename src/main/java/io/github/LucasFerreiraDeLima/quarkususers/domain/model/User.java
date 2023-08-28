package io.github.LucasFerreiraDeLima.quarkususers.domain.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "users")
public class User extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private Integer age;

    @Column(name = "sobrenome")
    private String sobrenome;

//    @Column(name = "cidadeNascimento")
//    private String cidadeNascimento;
//
//    @Column(name = "cpf")
//    private Integer cpf;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

//    public String getCidadeNascimento() {
//        return cidadeNascimento;
//    }
//
//    public void setCidadeNascimento(String cidadeNascimento) {
//        this.cidadeNascimento = cidadeNascimento;
//    }

//    public Integer getCpf() {
//        return cpf;
//    }
//
//    public void setCpf(Integer cpf) {
//        this.cpf = cpf;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(name, user.name) && Objects.equals(sobrenome, user.sobrenome) && Objects.equals(age, user.age);
    }

    //&& Objects.equals(cidadeNascimento, user.cidadeNascimento) && Objects.equals(cpf, user.cpf);

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, sobrenome);
        //cidadeNascimento, cpf
    }
}
