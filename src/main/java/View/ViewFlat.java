package View;

import models.Flat;
import java.util.Scanner;

public class ViewFlat {
    private Scanner console = new Scanner(System.in);
    Flat flat = null;

    public Flat createFlat(){
        return flat;
    }

    public int deleteFlat(){
        int idOfDeleteFlat = console.nextInt();
        return idOfDeleteFlat;
    }

    public int updateFlat(){
        int idOfUpdateFlat = console.nextInt();
        return idOfUpdateFlat;
    }

    public int showFlat(){
        int idOfShowFlat = console.nextInt();
        return idOfShowFlat;
    }
}