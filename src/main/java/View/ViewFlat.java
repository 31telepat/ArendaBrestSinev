package View;

import models.Flat;
import java.util.Scanner;

public class ViewFlat {
    private Scanner console = new Scanner(System.in);
    Flat flat = null;

    public void useFlatService(){
        System.out.println("Choose an action: 1.Create flat 2.Delete flat 3.Show flat 4.Update flat");
        int choose = console.nextInt();
        switch (choose) {
            case  (1):
                createFlat();
                break;
            case (2):
                deleteFlat();
                break;
            case (3):
                showFlat();
                break;
            case (4):
                updateFlat();
                break;
            default:
                System.out.println("Choose an action 1,2,3 or 4");
                useFlatService();
                break;
        }
    }

    public Flat createFlat(){
        Flat flat = new Flat();
        System.out.println("Enter number of rooms: ");
        int number_of_rooms = console.nextInt();
        flat.setNumber_of_rooms(number_of_rooms);
        System.out.println("Enter cost: ");
        float cost = console.nextFloat();
        flat.setCost(cost);
        System.out.println("Enter area: ");
        float area = console.nextFloat();
        flat.setArea(area);
        System.out.println("Enter owner: ");
        String owner = console.nextLine();
        flat.setOwner(owner);
        return flat;
    }

    public int deleteFlat(){
        int idOfDeleteFlat = console.nextInt();
        return idOfDeleteFlat;
    }

    public int showFlat(){
        int idOfShowFlat = console.nextInt();
        return idOfShowFlat;
    }
    public int updateFlat(){
        int idOfUpdateFlat = console.nextInt();
        return idOfUpdateFlat;
    }
}