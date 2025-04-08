package personal_trainer;

public class Student extends User {

    String message;

    public Student(String email, String password) {
        super(email, password);
    }

    public String validaEntrada(int codEntrada) {
        if (codEntrada == 2){
            this.message = "Seu cadastro foi realizado com sucesso. Seja bem-vindo a nova maneira de viver, aluno.";
            return this.message;
        }

        if (codEntrada == 1 & this.email == "rafael.scarvalho08@gmail.com" & this.password == "31145302Rafaau"){
            this.message = "Acesso realizado com sucesso. Seja bem-vindo(a)!";
            return this.message;
        } else {
            this.message = "Usuário ou senha incorretos.";
            return this.message;
        }
    }

}
