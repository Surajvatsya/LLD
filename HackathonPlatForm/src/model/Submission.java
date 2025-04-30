package model;

public class Submission {
    public String id;
    public String questionId;
    public  boolean isCorrect;
    public int timeTaken;

    public Submission(String id, String questionId, boolean isCorrect, int timeTaken) {
        this.id = id;
        this.questionId = questionId;
        this.isCorrect = isCorrect;
        this.timeTaken = timeTaken;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

    public int getTimeTaken() {
        return timeTaken;
    }

    public void setTimeTaken(int timeTaken) {
        this.timeTaken = timeTaken;
    }
}
