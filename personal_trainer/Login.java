package personal_trainer;

public class Login {

    public static void main(String[] args) {
        Student rafael = new Student("rafael.scarvalho08@gmail.com", "31145302Rafaau");
        System.out.println(rafael.validaEntrada(1));

        //Professor camila = new Professor("camila.nunes@outlook.com", "teste12");
        //System.out.println(camila.validaEntrada(2));
    }
}
