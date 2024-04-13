package org.example.tank.dto;

import java.io.Serializable;

public class UserDto implements Serializable {
    private static final long serialVersionUID = 6529685098267757671L;
    private boolean novel;
    private String username;
    private String password;

    public UserDto(boolean novel,String username, String password) {
        this.novel = novel;
        this.username = username;
        this.password = password;
    }

    public boolean isNovel() {
        return novel;
    }

    public void setNovel(boolean novel) {
        this.novel = novel;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
