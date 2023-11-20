package VetoresExercicios;

public class ClassRooms {
    private String nome;
    private String email;
    private int room;


    ClassRooms() {
    }

    public ClassRooms(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public ClassRooms(String nome, String email, int room) {
        this.nome = nome;
        this.email = email;
        this.room = room;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return this.email;

    }

    public int getRoom() {
        return this.room;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }




    @Override
    public String toString() {
        return "ClassRooms{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
