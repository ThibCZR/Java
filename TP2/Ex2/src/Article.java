public class Article {

    private static int num = 0;
    private int numArticle;
    private String ref;
    private String designation;
    private double prix;

    //--------------------------------ACCESSEURS-----------------------------------------------------

    public int getNumArt() {
        return numArticle;
    }

    public static int getNum(){
        return num;
    }

    public String getRef() {
        return ref;
    }

    public String getDesignation() {
        return designation;
    }

    public double getPrix() {
        return prix;
    }

    public void setNumArt(int numArticle) {
        this.numArticle = numArticle;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    //--------------------------------CONSTRUCTEUR-----------------------------------------------------

    public Article() {
        num++;
        this.numArticle=num;
    }

    public Article(int numArticle, String ref) {
        this.setNumArt(numArticle);
        this.ref = ref;
    }

    public Article(int numArticle, String ref, String designation) {
        this.setNumArt(numArticle);
        this.ref = ref;
        this.designation = designation;
    }

    public Article(int numArticle, String ref, String designation, double prix) {
        this.setNumArt(numArticle);
        this.ref = ref;
        this.designation = designation;
        this.prix = prix;
    }

    public String toString() {
        return "Numéro : " + getNumArt() + 
        "\nRéférence : " + getRef() + 
        "\nDésignation : " + getDesignation() +
        "\nPrix : " + getPrix() + " euros";
    }
}
