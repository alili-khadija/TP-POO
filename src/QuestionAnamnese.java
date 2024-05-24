public class QuestionAnamnese extends ReponseLibre {
    private CategoryAnamnese category;

    public QuestionAnamnese(String enonce, int score, String reponse, CategoryAnamnese category) {
        super(enonce, score, reponse);
        this.category = category;
    }

    public CategoryAnamnese getCategory() {
        return category;
    }

    public void setCategory(CategoryAnamnese category) {
        this.category = category;
    }
}//