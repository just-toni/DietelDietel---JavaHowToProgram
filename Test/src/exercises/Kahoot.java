package exercises;

import java.util.ArrayList;

public class Kahoot {
    ArrayList<Questions> questions = new ArrayList<>();
    ArrayList<Games> games = new ArrayList<>();
    
    public void createQuestions() {
        Questions question = new Questions();
        questions.add(question);
    }

    public int getTotalNumberOfQuestions() {
        return questions.size();
    }

    public void deleteQuestions(int questionID) {
        for(Questions question: questions){
            if(question.getQuestionID() == questionID){
                questions.remove(question);
                break;
            }
        }
    }

    public void createGame(int gameID, int numberOfQuestions) {
        Games game = new Games(gameID);
        games.add(game);
    }

    public int getGame() {
        return games.size();
    }

    public void deleteGame(int gameID) {
        for(Games game: games){
            if(game.getGame() == gameID){
                games.remove(gameID);
                break;
            }
        }
    }
}
