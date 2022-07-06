public class Usuario{
    protected String login;
    private String senha;

    public String getl(){
        return this.login;
    }
    public String gets(){
        return this.senha;
    }
    public void setl(String login, String senha){
        this.login = login;
        this.senha = senha;
    }

    public Usuario(String l, String s){
       this.login =l;
       this.senha = s;
    }
    public boolean autenticar(String l , String s){
        if(this.login.equals(l) && this.senha.equals(s)){
        return true;
    }else {
        return false;
    
    }
}
public String toString(){
    return "Classe Usuario: "+this.login;
}
}
