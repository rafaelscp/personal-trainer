package personal_trainer;

public class Professor extends User{

    String message;

    public Professor(String email, String password) {
        super(email, password);
    }

    public String validaEntrada(int codEntrada) {
        if (codEntrada == 2){
            this.message = "Seu cadastro foi realizado com sucesso. Seja bem-vindo novo personal :D";
            return this.message;
        }

        if (codEntrada == 1 & this.email == "camila.nunes@outlook.com" & this.password == "teste123"){
            this.message = "Acesso realizado com sucesso. Seja bem-vindo(a)!";
            return this.message;
        } else {
            this.message = "Usuário ou senha incorretos.";
            return this.message;
        }
    }

}
