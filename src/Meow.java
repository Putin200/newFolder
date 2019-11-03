public class Meow {
    public static void main(String[] args) {
        Woof gaf = new Woof();
        gaf.all_data("Бима","15","Коричневая","Такса");
        System.out.println("Кличка собаки - " + gaf.getName() + " Вес - " + gaf.getWeight() + "кг" + " Окраска - " + gaf.getColor() + " Порода - " + gaf.getPoroda());
        Woof mur = new Woof();
        mur.all_data("Бума","25","Белая с коричневыми пятнами","Корги");
        System.out.println(mur.getAll_data());
        Cat catyara  = new Cat();
        catyara.all1_data("собака","5","Полосатая","дворовая");
        System.out.println(catyara.getAll1_data());
        Gopher gophers = new Gopher();
        gophers.all_data(" рыжий "," 9 ", "большой");
        System.out.println(gophers.getall_data());



        //dsfsdf
        //adudau

    }
}
