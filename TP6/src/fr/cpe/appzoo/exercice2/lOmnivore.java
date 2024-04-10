package fr.cpe.appzoo.exercice2;

import fr.cpe.appzoo.exercice1.lCarnivore;
import fr.cpe.appzoo.exercice1.lHerbivore;

public interface lOmnivore extends lCarnivore, lHerbivore{
    String mangerAvec();
}
