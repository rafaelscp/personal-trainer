package personal_trainer;

public class Login {

    public static void main(String[] args) {
        Student rafael = new Student("rafael.scarvalho08@gmail.com", "31145302Rafaau");
        System.out.println(rafael.validaEntrada(1));

        Student higor = new Student("higor.nunes@gmail.com", "higorgamer123");
        System.out.println(higor.validaEntrada(1));

        Student heitor = new Student("heitor.carvalho@gmail.com", "heitorgamer123");
        System.out.println(heitor.validaEntrada(1));
        System.out.println(heitor.validaEntrada(1));
        System.out.println(heitor.validaEntrada(1));
        System.out.println(heitor.validaEntrada(1));
        System.out.println(heitor.validaEntrada(1));

        //Professor camila = new Professor("camila.nunes@outlook.com", "teste12");
        //System.out.println(camila.validaEntrada(2));
    }
}
