public class ProgPrincipal {
    public static void main(String[] args) {
        Article article1 = new Article();
        article1.setNumArt(1);
        article1.setRef("ref1");
        article1.setDesignation("des1");
        article1.setPrix(15);

        Article article2 = new Article();
        article2.setNumArt(2);
        article2.setRef("ref2");
        article2.setDesignation("des2");
        article2.setPrix(20);
        
        System.out.println(article1.toString()+"\n");
        System.out.println(article2.toString()+"\n");

        System.out.println("Nombre d'articles créés : " + Article.getNum());
    }
}