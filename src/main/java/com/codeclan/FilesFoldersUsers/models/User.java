package com.codeclan.FilesFoldersUsers.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

//    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<Folder> folders;

    public User(String name) {
        this.name = name;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addFolderToUser(Folder folder){
        this.folders.add(folder);
    }

    public int getFolderCount(){
        return this.folders.size();
    }


}