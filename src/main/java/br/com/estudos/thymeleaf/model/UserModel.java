package br.com.estudos.thymeleaf.model;


public class UserModel {

    private Long id;
    private String name;
    private String email;
    private String role;
    private String gender;

    public UserModel(Long id, String name, String email, String role, String gender) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.role = role;
        this.gender = gender;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
