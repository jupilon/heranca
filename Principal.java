public class Principal{
    public static void main(String[] agr){
        
        Funcionario f=new Funcionario();

        f.setNome("Juliana");
        f.setCPF("333.444.555-89");
        f.setSalario(8900.00);
        f.setDepartamento("Lideranca");

        System.out.println(f.getNome());
        System.out.println(f.getCPF());
        System.out.println(f.getSalario());
        System.out.println(f.getDepartamento());
    }
}