
package Model;

public class Grammatia {
    private String username;
    private String password;
    private Account logariasmos;

    public Grammatia(String username, String password,Account logariasmos) {
        this.username = username;
        this.password = password;
         this.logariasmos = logariasmos;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Account getLogariasmos() {
        return logariasmos;
    }
        
       
}
