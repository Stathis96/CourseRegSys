
package Model;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    private String username;
    private String password;
    private String kinito;
    private String email;
    private String hmeromEggrafis;

    public Account(String username,String password, String kinito, String email, String hmeromEggrafis) {
        this.username = username;
        this.password = password;
        this.kinito = kinito;
        this.email = email;
        this.hmeromEggrafis = hmeromEggrafis;
    }

    public String getUsername() {
        return username;
    }
    
    public String getPassword(){
        return password;
    }

    public String getKinito() {
        return kinito;
    }

    public String getEmail() {
        return email;
    }

    public String getHmeromEggrafis() {
        return hmeromEggrafis;
    }
    
    
}
