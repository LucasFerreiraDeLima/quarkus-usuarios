package io.github.LucasFerreiraDeLima.quarkususers.rest.dto;

public class CreateUserRequest {
    private String name;
    private Integer age;
    private String sobrenome;
//    private String cidadeNascimento;
//    private Integer cpf;



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
//
//    public Integer getCpf() {
//        return cpf;
//    }
//
//    public void setCpf(Integer cpf) {
//        this.cpf = cpf;
//    }

//    public String getCidadeNascimento() {
//        return cidadeNascimento;
//    }
//
//    public void setCidadeNascimento(String cidadeNascimento) {
//        this.cidadeNascimento = cidadeNascimento;
//    }
}
