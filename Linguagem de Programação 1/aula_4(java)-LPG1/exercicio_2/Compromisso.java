public class Compromisso {

    private String data;
    private String horario;
    private String descricao;

    public Compromisso(String data, String horario, String descricao){
        this.data = data;
        this.horario = horario;
        this.descricao = descricao;
    }

    public void setData(String newData) {
        this.data = newData;
    }

    public void setHorario(String newHorario){
        this.horario = newHorario;
    }

    public void setDescricao(String newDescricao){
        this.descricao = newDescricao;
    }

    public String getData(){
        return data;
    }

    public String getHorario(){
        return horario;
    }

    public String getDescricao() {
        return descricao;
    }

    public String toString(){
        return "data: " + this.data + ", horario: " + this.horario + ", descricao: " + this.descricao;
    }
}
