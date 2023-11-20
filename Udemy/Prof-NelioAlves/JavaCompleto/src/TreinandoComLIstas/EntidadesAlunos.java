package TreinandoComLIstas;

import java.util.List;

public class EntidadesAlunos {
    private String nome;
    private String serie;
    private List<Double> notas;

    public EntidadesAlunos(String nome, String serie, List<Double> notas) {
        setNome(nome);
        setSerie(serie);
        setNotas(notas);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }
}
