public class AlunoDisciplina {
    private String nome;
    private double nap1, nap2, substitutiva;

    public double getP1() {
        return this.nap1;
    }

    public double getP2() {
        return this.nap2;
    }

    public double getSubstitutiva() {
        return this.substitutiva;
    }

    public void setP1(double nap1, double nap2) {
        this.nap1 = nap1;
        this.nap2 = nap2;
        this.nap2 = substitutiva;
    }

    public AlunoDisciplina(String n, double p1, double p2, double subs) {
        this.nome = n;
        this.nap1 = p1;
        this.nap2 = p2;
        this.substitutiva = subs;

    }

    public double media_final() {

        if ((nap1 >= substitutiva && nap2 > substitutiva)) {
            return (nap1 + nap2) / 2;
        } else if ((nap1 >= substitutiva && substitutiva > nap2)) {
            return (nap1 + substitutiva) / 2;
        } else {
            return (substitutiva + nap2) / 2;
        }
    }

    public String toString() {
        return "Nome: " + nome + ", Média final: " + media_final() + ", situacao: " + Situacao();
    }

    public String Situacao() {
        double aux = media_final();
        if (aux >= 6) {
            return "Aprovado";
        } else if (aux < 4) {
            return "Reprovado";
        } else {
            return "Prova final";
        }
    }
}
