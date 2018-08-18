import db.DBHelper;
import models.Patron;
import models.Review;

public class Runner {

    public static void main(String[] args) {

        Patron stoo = new Patron("Stoo", "The best");
        DBHelper.save(stoo);
        Review review1 = new Review("The best coffee ever", 4.2);
        DBHelper.save(review1);





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
