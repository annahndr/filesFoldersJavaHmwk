package com.codeclan.FilesFoldersUsers.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class Folder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

//    @JsonIgnore
    @OneToMany(mappedBy = "folder")
    private List<File> folderOfFiles;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Folder(String title, User user) {
        this.title = title;
        this.user = user;
//        this.folderOfFiles = new ArrayList<File>();
    }

    public Folder() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void addFileToFolder(File file){
        this.folderOfFiles.add(file);
    }

    public List<File> getFolderOfFiles() {
        return folderOfFiles;
    }

    public void setFolderOfFiles(List<File> folderOfFiles) {
        this.folderOfFiles = folderOfFiles;
    }
}
