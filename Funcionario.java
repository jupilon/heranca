public class Funcionario {
    private String nome;
    private String CPF;
    private double salario;
    private String departamento; 

    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setCPF(String CPF){
        this.CPF=CPF;
    }
    public String getCPF(){
        return this.CPF;
    }

    public void setSalario(double salario){
        this.salario=salario;
    }
    public double getSalario(){
        return this.salario;
    }
    public void getDepartamento(String departamento){
        this.departamento=departamento;
    }
    public String getDepartamento(){
        return this.departamento;
    }
}