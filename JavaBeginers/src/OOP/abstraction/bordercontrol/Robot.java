package OOP.abstraction.bordercontrol;

import OOP.abstraction.multipleimplementation.Identifiable;

public class Robot implements Identifiable {
    private String id;
    private String model;

    public Robot(String model, String id) {
        this.id = id;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String getId() {
        return null;
    }
}