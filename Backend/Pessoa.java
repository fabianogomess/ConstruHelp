public class Pessoa {
   private String nome;
   private String email;
   private String cpf;
   private String telefone;
   
   public String getNome(){
       return nome;
   }
   public String getEmail(){
       return email;
   }
   public String getCpf(){
       return cpf;
   }
   public String getTelefone(){
       return telefone;
   }

   public void setNome(String nome){
        this.nome = nome;
   }
   public void setEmail(String email){
       this.email = email;
   }
   public void setCpf(String cpf){
       this.cpf = cpf;
   }
   public void setTelefone(String telefone){
        this.telefone = telefone;
   }
}
