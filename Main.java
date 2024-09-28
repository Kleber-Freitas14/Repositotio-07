public class Main {
    public static void main(String[] args) {

        System.out.println("---------------------------------------------------------------");

        //Nome da Faculdade
        System.out.println("UNIFAN - Centro Universitario Alfredo Nasser");

        //Nome do aluno
        System.out.println("Aluno: Kleber Freitas Martins");

        //Nome do professor
        System.out.println("Professor: Brenno Pimenta");

        //Fraze de boas vindas
        System.out.println("Aproveite o desafio de conhecimento!");
        System.out.println("Boa Sorte!");

        //Dizendo que será respondido 15 perguntas sobre Velozes e Furiosos
        System.out.println("O questionário e formado por 15 perguntas de multiplas escolhas.");

        System.out.println("-----------------------------------------------------------------");
//
//
        Questao q1 = new Questao();
        q1.pergunta = "01 - Em quantas partes são dividos o coração?";
        q1.opcaoA = "A) 2.";
        q1.opcaoB = "B) 4.";
        q1.opcaoC = "C) 5.";
        q1.opcaoD = "D) 1.";
        q1.opcaoE = "E) O coração não tem divisões!";
        q1.correta = "B";

        q1.escrevaQuestao();
        String resposta = q1.leiaResposta();
        q1.isCorreta(resposta);


//
        Questao q2 = new Questao();
        q2.pergunta = "02 - Qual o orgão responsável por filtrar o sague?";
        q2.opcaoA = "A) Pâncreas.";
        q2.opcaoB = "B) Fígado.";
        q2.opcaoC = "C) Ríns.";
        q2.opcaoD = "D) Medula.";
        q2.opcaoE = "E) Nenhum dos itens.";
        q2.correta = "C";

        q2.escrevaQuestao();
        resposta = q2.leiaResposta();
        q2.isCorreta(resposta);


//
        Questao q3 = new Questao();
        q3.pergunta = "03 - Qual o mior osso do nosso corpo? ";
        q3.opcaoA = "A) Ttibia.";
        q3.opcaoB = "B) Fêmur.";
        q3.opcaoC = "C) Mandibula.";
        q3.opcaoD = "D) Zigomatico.";
        q3.opcaoE = "E) Nenhuma das opções.";
        q3.correta = "B";

        q3.escrevaQuestao();
        resposta = q3.leiaResposta();
        q3.isCorreta(resposta);



//
        Questao q4 = new Questao();
        q4.pergunta = "04 - Quais as formas em que o sangue se apresenta?";
        q4.opcaoA = "A) Gasosa e Arterial.";
        q4.opcaoB = "B) Líquida e pastosa";
        q4.opcaoC = "C) Venosa e Pastosa";
        q4.opcaoE = "E) Arteria e Venosa";
        q4.correta = "E";

        q4.escrevaQuestao();
        resposta = q4.leiaResposta();
        q4.isCorreta(resposta);


//
        Questao q5 = new Questao();
        q5.pergunta = "05 - Qua e o maior orgão do corpo?";
        q5.opcaoA = "A) Fígado";
        q5.opcaoB = "B) Pele";
        q5.opcaoC = "C) Instestino grosso";
        q5.opcaoD = "D) Intestino delgado";
        q5.opcaoE = "E) Esôfago";
        q5.correta = "B";

        q5.escrevaQuestao();
        resposta = q5.leiaResposta();
        q5.isCorreta(resposta);
//
        Questao q6 = new Questao();
        q6.pergunta = "06 - O esôfago é um órgão que faz parte de qual sistema?";
        q6.opcaoA = "A) Respitatório.";
        q6.opcaoB = "B) Disgestório.";
        q6.opcaoC = "C) Excretor.";
        q6.opcaoD = "D) Endódrino";
        q6.opcaoE = "E) Reprodutor.";
        q6.correta = "B";

        q6.escrevaQuestao();
        resposta = q6.leiaResposta();
        q6.isCorreta(resposta);


//
        Questao q7 = new Questao();
        q7.pergunta = "07 - Qual o órgão humano responsável pela detoxificação dessa substância do sangue?";
        q7.opcaoA = "A) Coração.";
        q7.opcaoB = "B) Pâncreas.";
        q7.opcaoC = "C) Apêndice.";
        q7.opcaoD = "D) Fígado";
        q7.opcaoE = "E) Estômago.";
        q7.correta = "D";

        q7.escrevaQuestao();
        resposta = q7.leiaResposta();
        q7.isCorreta(resposta);


//
        Questao q8 = new Questao();
        q8.pergunta = "08 - Sobre o coração, marque a alternativa correta.";
        q8.opcaoA = "A) É formado, principalmente, por tecido conjuntivo frouxo.";
        q8.opcaoB = "B) É um órgão pelo qual circula apenas sangue rico em oxigênio.";
        q8.opcaoC = "C) Apresenta duas cavidades, um átrio e um ventrículo.";
        q8.opcaoD = "D) É um órgão pelo qual circula apenas sangue pobre em oxigênio.";
        q8.opcaoE = "E) Possui quatro cavidades, sendo dois átrios e dois ventrículos.";
        q8.correta = "E";

        q8.escrevaQuestao();
        resposta = q8.leiaResposta();
        q8.isCorreta(resposta);


//
        Questao q9 = new Questao();
        q9.pergunta = "09 - Uretra é um órgão pertencente ao sistema?";
        q9.opcaoA = "A) respiratório";
        q9.opcaoB = "B) digestório.";
        q9.opcaoC = "C) endócrino.";
        q9.opcaoD = "D) nervoso.";
        q9.opcaoE = "E) urinário.";
        q9.correta = "E";

        q9.escrevaQuestao();
        resposta = q9.leiaResposta();
        q9.isCorreta(resposta);
//
        Questao q10 = new Questao();
        q10.pergunta = "A pele é o maior órgão do corpo humano e é formada pelos tecidos:";
        q10.opcaoA = "A) muscular e nervoso.";
        q10.opcaoB = "B) epitelial e muscular.";
        q10.opcaoC = "C) nervoso e epitelial.";
        q10.opcaoD = "D) conjuntivo e muscular.";
        q10.opcaoE = "E) epitelial e conjuntivo.";
        q10.correta = "E";

        q10.escrevaQuestao();
        resposta = q10.leiaResposta();
        q10.isCorreta(resposta);
//

        Questao q11 = new Questao();
        q11.pergunta = "11 - Durante a locomoção, o movimento é efetuado pelo esforço:";
        q11.opcaoA = "A) dos ossos sobre os músculos estriados.";
        q11.opcaoB = "B) de tração dos músculos.";
        q11.opcaoC = "C) dos ossos sobre as articulações.";
        q11.opcaoD = "D) dos ligamentos nas articulações.";
        q11.opcaoE = "E) de tração dos músculos sobre os ossos.";
        q11.correta = "E";

        q11.escrevaQuestao();
        resposta = q11.leiaResposta();
        q11.isCorreta(resposta);
//
        Questao q12 = new Questao();
        q12.pergunta = "12 - Com relação ao funcionamento do corpo humano, assinale a alternativa incorreta:";
        q12.opcaoA = "A) O hormônio antidiurético, conhecido por ADH, é produzido nas glândulas suprarrenais.";
        q12.opcaoB = "B) Suco entérico, suco pancreático e bile são secreções que atuam na digestão do quimo no intestino delgado.";
        q12.opcaoC = "C) O cerebelo coordena os movimentos e orienta a postura corporal.";
        q12.opcaoD = "D) O infarto, é provocada pela obstrução de uma ou mais artérias coronárias.";
        q12.opcaoE = "E) O cerebelo coordena os movimentos e orienta a postura corporal.";
        q12.correta = "A";

        q12.escrevaQuestao();
        resposta = q12.leiaResposta();
        q12.isCorreta(resposta);
//





    }
}