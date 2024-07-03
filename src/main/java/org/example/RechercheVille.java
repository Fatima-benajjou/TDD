package org.example;


import java.util.ArrayList;
import java.util.List;

public class RechercheVille {

    private List<String> listVilles;


    public RechercheVille() {

        listVilles = List.of("Paris", "Budapest", "Skopje", "Rotterdam", "Valence", "Vancouver", "Amsterdam", "Vienne", "Sydney", "New York", "Londres", "Bangkok", "Hong Kong", "Dubaï", "Rome", "Istanbul");

    }

    public List<String> rechercher(String ville) {
        if (ville.equals("*"))
            return listVilles;

        if (ville.length() < 2) {
            throw new NotFoundException();
        }
        List<String> listResultat = new ArrayList<>();
        for (String villeResult : listVilles) { //j'ajoute chaque villeResult dans la listResult
            if (villeResult.startsWith(ville)) {
                listResultat.add(villeResult);
            }
        }

        for (String villeResult : listVilles) {
            if (villeResult.equalsIgnoreCase(ville)) {
                listResultat.add(villeResult);
            }
        }

        for (String villeResult : listVilles) {
            if (villeResult.contains(ville)) {
                listResultat.add(villeResult);

            }
        }

        return listResultat;

    }
}

