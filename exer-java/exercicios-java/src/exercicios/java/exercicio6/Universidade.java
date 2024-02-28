package exercicios.java.exercicio6;

import java.util.ArrayList;
import java.util.List;

public class Universidade {
    
    private String nome;
    private List<Departamento> departamentos;
    
    public Universidade() {
        this.nome = "";
        this.departamentos = new ArrayList<>();
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        
        return this.nome;
    }
    
    public void adicionarDepartamento(Departamento departamento) {
        this.departamentos.add(departamento);
    }
    
    public Departamento buscarDepartamentoPeloCodigo(int codigo) {
        
        if (this.departamentos.isEmpty()) {
            System.out.println("Não existem departamentos cadastrados!");
            
            return null;
        }
        
        Departamento departamento = null;
        
        for (Departamento dep : this.departamentos) {
            
            if (dep.getCodigo() == codigo) {
                departamento = dep;
                        
            }
            
        }
        
        return departamento;
    }
    
    public Departamento buscarDepartamentoPorNome(String nome) {
        
        return null;
    }
}
