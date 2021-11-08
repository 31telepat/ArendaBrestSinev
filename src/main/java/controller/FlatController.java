package controller;

import View.ViewFlat;
import models.Flat;
import services.Service;

public class FlatController {

    private Service service;
    private ViewFlat viewFlat;

    public FlatController(Service service, ViewFlat viewFlat){
        this.service = service;
        this.viewFlat = viewFlat;
    }

    private void saveFlat(){
        Flat flat = viewFlat.createFlat();
        service.save(flat);
    }

    private void deleteFlat(){
        Flat numberOfDeleteFlat = ViewFlat.deleteFlat();
        service.delete(numberOfDeleteFlat);
    }

}
