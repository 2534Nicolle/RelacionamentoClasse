package RelacionamentoClasses.Agregacao;

public class PrincipalEmpresa {
	
	public static void main(String[] args) {
		
		Departamento departamento = new Departamento("V8");
		Empresa empresa = new Empresa("Jhonsons");
		
		System.out.println("Empresa é: " + empresa.getNome() + "\nDepartamento: " + departamento.getNome());
	}

}
