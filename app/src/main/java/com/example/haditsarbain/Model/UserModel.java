package com.example.haditsarbain.Model;

public class UserModel  {

    public UserModel (int id, String username, String nama, String password) {
        setId(id);
        setUsername(username);
        setNama(nama);
        setPassword(password);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private int id;
    private String username, nama, password;
}
