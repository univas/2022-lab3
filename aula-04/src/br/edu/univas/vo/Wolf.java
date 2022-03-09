package br.edu.univas.vo;

import java.util.ArrayList;

public class Wolf extends Canine {

    private ArrayList<String> samples;

    public ArrayList<String> getSamples() {
        return samples;
    }

    public void setSamples(ArrayList<String> samples) {
        this.samples = samples;
    }

    public Wolf() {
        super(null);

        ArrayList<String> samples = new ArrayList();
        samples.add("Rodrigo");
    }

    public Wolf(String name) {
        super(name);
    }
}
