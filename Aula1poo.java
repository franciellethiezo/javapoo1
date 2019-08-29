package aula1.poo;

public class cao {

   String nome; 
   String porte;
   int idade;
   float peso;
   
    public static void main(String[] args) {
        
    }

    public cao (String nome, String porte, int idade, float peso) {
        this.nome = nome;
        this.porte = porte;
        this.idade = idade;
        this.peso = peso;
    }
    
    public cao (){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public void infocao (){
        System.out.println("O nome do cão é: "+getNome);
        System.out.println("O porte do cão é: "+getPorte);
        System.out.println("A idade do cão é: "+getIdade);
        System.out.println("O peso do cão é: "+getPeso);
    }
    
    public void validadorIdade (int idade){
        if (idade > 2){
            System.out.println("Seu cãozinho está na fase adulta");
        }
        else{
            System.out.println("Seu cãozinho ainda é um filhote");
        }
        
    }
}
