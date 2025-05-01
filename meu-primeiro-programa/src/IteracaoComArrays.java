public class IteracaoComArrays {

    public static void main(String[] args) {

        int[] numeros = {0,1,2,3,4,5,6,7,8,9};

        for (int numero : numeros){
            System.out.println(numero);
        }

        String[] emails = {"a@email.com","b@email.com","c@email.com","d@email.com","e@email.com"};

        for (int index = 0; index < emails.length; index++){
            System.out.println(emails[index]);
        }
    }
}
