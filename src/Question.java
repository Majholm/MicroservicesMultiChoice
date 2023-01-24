class Question {
    private String question;
    private String[] answers;
    private int correctAnswer;
    private int numCorrect;

    public Question(String question, String[] answers, int correctAnswer, int numCorrect) {
        this.question = question;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
        this.numCorrect = numCorrect;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getAnswers() {
        return answers;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public int getNumCorrect() {
        return numCorrect;
    }

    public void setNumCorrect(int numCorrect) {
        this.numCorrect = numCorrect;
    }
}
