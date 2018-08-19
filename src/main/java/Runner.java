import db.DBHelper;
import db.DBPatron;
import models.EquipmentType;
import models.Patron;
import models.Recipe;
import models.Review;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

    Patron stoo = new Patron("Stoo", "The best");
    DBHelper.save(stoo);
    Patron joe = new Patron("Joe", "The pressed");
    DBHelper.save(joe);
    Recipe recipe1 = new Recipe("Scott Rao", EquipmentType.V60,15,94,250,"Sea Salt","3:30","Great success",stoo);
    DBHelper.save(recipe1);
    Recipe recipe2 = new Recipe("AP Guy", EquipmentType.AEROPRESS,18,90,200,"Sand","4:30","Aeroight",joe);
    DBHelper.save(recipe2);
    Review review1 = new Review("The best coffee ever", 4.2,recipe1, stoo);
    DBHelper.save(review1);
    Review review2 = new Review("The 2nd best coffee ever", 4.7,recipe1, stoo);
    DBHelper.save(review2);
    Review review3 = new Review("The 3rd best coffee ever", 3.3,recipe2, joe);
    DBHelper.save(review3);

//    recipe1.addReview(review1); NO LONGER REQUIRED
//    DBHelper.update(review1);
//    DBHelper.update(recipe1);

    List<Review> patronsReviews = DBPatron.getReviewsBy(stoo);
        System.out.println(patronsReviews);


//        Ship pearl = new Ship("The Black Pearl");
//        DBHelper.save(pearl);
//
//        Ship dutchman = new Ship("The Flying Dutchman");
//        DBHelper.save(dutchman);
//
//        Pirate pirate1 = new Pirate("Hector", "Barbossa", 65, Weapon.PISTOL, pearl);
//        DBHelper.save(pirate1);
//        Pirate pirate2 = new Pirate("Will", "Turner", 23, Weapon.DAGGER, dutchman);
//        DBHelper.save(pirate2);
//        Pirate pirate3 = new Pirate("Elizabeth", "Swanson", 24, Weapon.PISTOL, dutchman);
//        DBHelper.save(pirate3);
//
//        Captain captain1 = new Captain("Jack", "Sparrow", 32, Weapon.CUTLASS, 100, pearl);
//        DBHelper.save(captain1);
//        Captain captain2 = new Captain("Davey", "Jones", 154, Weapon.CUTLASS, 39, dutchman);
//        DBHelper.save(captain2);
//
//        Raid raid1 = new Raid("Tortuga", 200);
//        DBHelper.save(raid1);
//
//        DBPirate.addPirateToRaid(pirate1, raid1);
//        DBPirate.addPirateToRaid(pirate2, raid1);
//
//        List<Pirate> pirates = DBRaid.getRaidPirates(raid1);
//        List<Raid> raids = DBPirate.getPirateRaids(pirate1);


        }
}
