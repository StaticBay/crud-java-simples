import java.util.Scanner;

public class Dados {

    private int id;
    private String nome;
    private String sobrenome;
    private int telefone;
    private String email;

    public Dados(){
        this.id=0;
        this.nome="";
        this.sobrenome="";
        this.telefone=0;
        this.email="";
    }

    void preencher() {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe os dados");
        System.out.print("ID: ");
        this.id = ler.nextInt();
        System.out.print("Nome: ");
        this.nome = ler.next();
        System.out.print("Sobrenome: ");
        this.sobrenome = ler.next();
        System.out.print("Telefone: ");
        this.telefone = ler.nextInt();
        System.out.print("Email: ");
        this.email = ler.next();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
