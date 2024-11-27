public class Quiz {
    public static void main(String[] args) {
        int contador = 0;
        int totalPerguntas = 15;

        System.out.println("********************************************");
        System.out.println("*       FACULDADE ALFREDO NASSER           *");
        System.out.println("********************************************");
        System.out.println("*   Aluno: Keyte Horrane Martins Borges    *");
        System.out.println("*   Professor: Brenno Pimenta da Costa     *");
        System.out.println("********************************************");
        System.out.println("* Quiz de 15 perguntas do Universo Marvel  *");
        System.out.println("********************************************");

        Questao q1 = new Questao();
        q1.pergunta = "Pergunta 1: Considerando por ordem de lançamento, qual foi o primeiro filme estreiado pela Marvel Studios";
        q1.opcaoA = "a) Homem-Aranha: De Volta ao Lar";
        q1.opcaoB = "b) Guardiões da Galáxia Vol. 2";
        q1.opcaoC = "c) Homem de Ferro";
        q1.opcaoD = "d) Homem-Formiga e a Vespa: Quantumania";
        q1.opcaoE = "e) Capitã Marvel";
        q1.correta = "c";

        q1.escrevaQuestao();
        boolean correta = q1.isCorreta(q1.leiaResposta());
        if (correta) {
            contador++;
        }

        Questao q2 = new Questao();
        q2.pergunta = "Pergunta 2: Qual o nome do vilão em 'Pantera Negra'?";
        q2.opcaoA = "a) Galactus";
        q2.opcaoB = "b) Killmonger";
        q2.opcaoC = "c) Ultron";
        q2.opcaoD = "d) Loki";
        q2.opcaoE = "e) Hela";
        q2.correta = "b";

        q2.escrevaQuestao();
        correta = q2.isCorreta(q2.leiaResposta());
        if (correta) {
            contador++;
        }

        Questao q3 = new Questao();
        q3.pergunta = "Pergunta 3: Qual é a cidade natal do Capitão América?";
        q3.opcaoA = "a) Chicago";
        q3.opcaoB = "b) Nova Iorque";
        q3.opcaoC = "c) Brooklyn";
        q3.opcaoD = "d) Los Angeles";
        q3.opcaoE = "e) Washington, D.C.";
        q3.correta = "c";

        q3.escrevaQuestao();
        correta = q3.isCorreta(q3.leiaResposta());
        if (correta) {
            contador++;
        }

        Questao q4 = new Questao();
        q4.pergunta = "Pergunta 4: Qual o nome do martelo de Thor?";
        q4.opcaoA = "a) Stormbreaker";
        q4.opcaoB = "b) Mjölnir";
        q4.opcaoC = "c) Jarnbjorn";
        q4.opcaoD = "d) Aether";
        q4.opcaoE = "e) Yondu";
        q4.correta = "b";

        q4.escrevaQuestao();
        correta = q4.isCorreta(q4.leiaResposta());
        if (correta) {
            contador++;
        }

        Questao q5 = new Questao();
        q5.pergunta = "Pergunta 5: Quem destruiu metade do universo em 'Vingadores: Guerra Infinita'?";
        q5.opcaoA = "a) Ultron";
        q5.opcaoB = "b) Hela";
        q5.opcaoC = "c) Loki";
        q5.opcaoD = "d) Thanos";
        q5.opcaoE = "e) Dormammu";
        q5.correta = "d";

        q5.escrevaQuestao();
        correta = q5.isCorreta(q5.leiaResposta());
        if (correta) {
            contador++;
        }

        Questao q6 = new Questao();
        q6.pergunta = "Pergunta 6: Qual é o nome do alter ego do Hulk?";
        q6.opcaoA = "a) Steve Rogers";
        q6.opcaoB = "b) Bruce Wayne";
        q6.opcaoC = "c) Bruce Banner";
        q6.opcaoD = "d) Tony Stark";
        q6.opcaoE = "e) Clint Barton";
        q6.correta = "c";

        q6.escrevaQuestao();
        correta = q6.isCorreta(q6.leiaResposta());
        if (correta) {
            contador++;
        }

        Questao q7 = new Questao();
        q7.pergunta = "Pergunta 7: Qual é o nome do pai de Peter Quill em 'Guardiões da Galáxia Vol. 2'?";
        q7.opcaoA = "a) Ego";
        q7.opcaoB = "b) Yondu";
        q7.opcaoC = "c) Drax";
        q7.opcaoD = "d) Rocket";
        q7.opcaoE = "e) Clark kent";
        q7.correta = "a";

        q7.escrevaQuestao();
        correta = q7.isCorreta(q7.leiaResposta());
        if (correta) {
            contador++;
        }

        Questao q8 = new Questao();
        q8.pergunta = "Pergunta 8: Qual é o verdadeiro nome de Pantera Negra?";
        q8.opcaoA = "a) Erik Killmonger";
        q8.opcaoB = "b) Nakia";
        q8.opcaoC = "c) T'Challa";
        q8.opcaoD = "d) Okoye";
        q8.opcaoE = "e) Shuri";
        q8.correta = "c";

        q8.escrevaQuestao();
        correta = q8.isCorreta(q8.leiaResposta());
        if (correta) {
            contador++;
        }

        Questao q9 = new Questao();
        q9.pergunta = "Pergunta 9: Quem foi o criador do Ultron no Universo Cinematográfico da Marvel?";
        q9.opcaoA = "a) Bruce Banner";
        q9.opcaoB = "b) Tony Stark";
        q9.opcaoC = "c) Hank Pym";
        q9.opcaoD = "d) Nick Fury";
        q9.opcaoE = "e) Thor";
        q9.correta = "b";

        q9.escrevaQuestao();
        correta = q9.isCorreta(q9.leiaResposta());
        if (correta) {
            contador++;
        }

        // Questão 10
        Questao q10 = new Questao();
        q10.pergunta = "Pergunta 10: Em qual filme do MCU a Joia da Alma aparece pela primeira vez?";
        q10.opcaoA = "a) Vingadores: Ultimato";
        q10.opcaoB = "b) Guardiões da Galáxia";
        q10.opcaoC = "c) Thor: Ragnarok";
        q10.opcaoD = "d) Vingadores: Guerra Infinita";
        q10.opcaoE = "e) Capitão América: Guerra Civil";
        q10.correta = "d";

        q10.escrevaQuestao();
        correta = q10.isCorreta(q10.leiaResposta());
        if (correta) {
            contador++;
        }

        Questao q11 = new Questao();
        q11.pergunta = "Pergunta 11: Qual é o nome da inteligência artificial que substitui o JARVIS em 'Vingadores: Era de Ultron'?";
        q11.opcaoA = "a) EDITH";
        q11.opcaoB = "b) Ultron";
        q11.opcaoC = "c) F.R.I.D.A.Y.";
        q11.opcaoD = "d) Karen";
        q11.opcaoE = "e) J.A.R.V.I.S.";
        q11.correta = "c";

        q11.escrevaQuestao();
        correta = q11.isCorreta(q11.leiaResposta());
        if (correta) {
            contador++;
        }

        Questao q12 = new Questao();
        q12.pergunta = "Pergunta 12: Qual o nome do soldado interpretado por Sebastian Stan no MCU?";
        q12.opcaoA = "a) Homem de Ferro";
        q12.opcaoB = "b) Gavião Arqueiro";
        q12.opcaoC = "c) Soldado Invernal";
        q12.opcaoD = "d) Máquina de Combate";
        q12.opcaoE = "e) Capitão América";
        q12.correta = "c";

        q12.escrevaQuestao();
        correta = q12.isCorreta(q12.leiaResposta());
        if (correta) {
            contador++;
        }

        Questao q13 = new Questao();
        q13.pergunta = "Pergunta 13: Qual herói do MCU é conhecido como o 'Feiticeiro Supremo'?";
        q13.opcaoA = "a) Wong";
        q13.opcaoB = "b) Thor";
        q13.opcaoC = "c) Doutor Estranho";
        q13.opcaoD = "d) Loki";
        q13.opcaoE = "e) Wanda Maximoff";
        q13.correta = "c";

        q13.escrevaQuestao();
        correta = q13.isCorreta(q13.leiaResposta());
        if (correta) {
            contador++;
        }

        Questao q14 = new Questao();
        q14.pergunta = "Pergunta 14: Qual é o nome da organização infiltrada na S.H.I.E.L.D. em 'Capitão América: O Soldado Invernal'?";
        q14.opcaoA = "a) Hydra";
        q14.opcaoB = "b) AIM";
        q14.opcaoC = "c) Sokovia";
        q14.opcaoD = "d) SHIELD Negra";
        q14.opcaoE = "e) Os Dez Anéis";
        q14.correta = "a";

        q14.escrevaQuestao();
        correta = q14.isCorreta(q14.leiaResposta());
        if (correta) {
            contador++;
        }

        Questao q15 = new Questao();
        q15.pergunta = "Pergunta 15: Quem é o diretor da S.H.I.E.L.D. no início do MCU?";
        q15.opcaoA = "a) Maria Hill";
        q15.opcaoB = "b) Phil Coulson";
        q15.opcaoC = "c) Nick Fury";
        q15.opcaoD = "d) Peggy Carter";
        q15.opcaoE = "e) Howard Stark";
        q15.correta = "c";

        q15.escrevaQuestao();
        correta = q15.isCorreta(q15.leiaResposta());
        if (correta) {
            contador++;
        }

        int erros = totalPerguntas - contador;
        double porcentagem = (contador / (double) totalPerguntas) * 100;

        System.out.println("********************************************");
        System.out.println("*               RESULTADOS                 *");
        System.out.println("********************************************");
        System.out.println("Acertos: " + contador);
        System.out.println("Erros: " + erros);
        System.out.println("Porcentagem de acertos: " + String.format("%.2f", porcentagem) + "%");
        System.out.println("********************************************");

    }
}






