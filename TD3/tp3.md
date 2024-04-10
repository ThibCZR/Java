# TD3

## Partie 1 : Interfaces

## Exercice 1

### Question 1.1 

```java
package zoo;

public class Elephant implements Animal {
    private int weight;

    public Elephant(int weight) {
        this.weight = weight;
    }

    @Override
    public int getNbLegs() {
        return 4;
    }

    @Override
    public boolean isCarnivorous() {
        return false;
    }
}
```

### Question 1.2 

```java
public void addAnimal(Animal animal);
```

### Question 2

Toutes les valeurs possibles T sont : 
- `Elephant` 
- Tout les types parent de `Elephant` 
- Tout les types implémentant l'interface `Animal`

## Exercice 2

### Question 1 

```java
package text;

public class ToLowerCaseTransformation implements Transformation {

    @Override
    public String transform(String input) {
        if (input == null) {
            return null; 
        }
        return input.toLowerCase();
    }

    @Override
    public String getDescription() {
        return "Transforme tous les caractères majuscules en minuscules.";
    }
}

```

### Question 2

Les valeurs possibles pour le type T dans l'expression 
`T ref = new ToLowerCaseTransformation();` sont les types suivants :
Transformation: Puisque ToLowerCaseTransformation implémente l'interface Transformation, la référence ref peut être de type Transformation.

### Question 3

```java
package text;

import java.util.Arrays;

public class MultiStringTransformer {
    public static String[] multiTransform(String[] strings, Transformation transformation) {
        return Arrays.stream(strings)
                     .map(transformation::transform)
                     .toArray(String[]::new);
    }
}

```

### Question 3.1

```java
package text;

import java.util.Arrays;

public class MultiStringTransformer {
    public static String[] multiTransform(String[] strings, Transformation transformation) {
        return Arrays.stream(strings)
                     .map(transformation::transform)
                     .toArray(String[]::new);
    }
}

```

### Question 4

```java
MultiStringTransformer transformer = new MultiStringTransformer();
String[] lowers = transformer.multiTransform(data, new ToLowerCaseTransformation());
String[] rot13s = transformer.multiTransform(data, new Rot13Transformation());
```

## Partie Question Cours 

1. **Différence entre une classe abstraite et une interface en Java :**
   - Une classe abstraite peut contenir des méthodes concrètes ainsi que des méthodes abstraites, tandis qu'une interface ne peut contenir que des méthodes abstraites et des constantes.
   - Une classe peut hériter d'une seule classe abstraite, mais elle peut implémenter plusieurs interfaces.
   - Une classe abstraite peut avoir des champs (attributs) non finaux qui peuvent être modifiés, tandis qu'une interface ne peut pas avoir de champs variables.

2. **Qu'est-ce qu'une interface ?**
   - Une interface en Java est une collection de méthodes abstraites et de constantes. Elle définit un contrat pour les classes qui choisissent de l'implémenter. Les interfaces fournissent une spécification de comportement sans aucune implémentation concrète.

3. **Avantage d'utiliser une interface par rapport à une classe abstraite :**
   - Flexibilité : Une classe peut implémenter plusieurs interfaces mais ne peut hériter que d'une seule classe abstraite.
   - Évitement du problème du diamant : Les interfaces évitent le problème du diamant qui peut survenir lors de l'héritage multiple avec les classes abstraites.
   - Séparation des préoccupations : Les interfaces permettent de séparer les contrats des implémentations concrètes, favorisant ainsi une meilleure modularité et une meilleure maintenance du code.

4. **Comment une interface peut-elle être utilisée pour définir un contrat ou un comportement commun pour plusieurs classes ?**
   - Une interface définit un ensemble de méthodes abstraites que les classes qui l'implémentent doivent fournir. Ainsi, en définissant une interface, vous pouvez garantir qu'un groupe de classes fournira une fonctionnalité spécifique.

5. **Pourquoi avons-nous déclaré Forme2D et Forme3D comme des interfaces plutôt que des classes abstraites dans notre exemple ?**
   - Les interfaces sont utilisées pour définir des contrats et des comportements communs que plusieurs classes peuvent implémenter. Dans ce cas, Forme2D et Forme3D représentent des types de formes géométriques qui peuvent être de différentes formes (comme des rectangles, des cercles, etc.), il est donc logique de les déclarer comme des interfaces afin de permettre une flexibilité maximale dans les implémentations.

6. **Peut-on implémenter plusieurs interfaces dans une seule classe ? Si oui, comment cela s'appelle et quelles sont les restrictions associées ?**
   - Oui, une classe peut implémenter plusieurs interfaces. Cela s'appelle l'implémentation multiple d'interfaces. Les restrictions associées incluent le fait que la classe doit fournir des implémentations pour toutes les méthodes abstraites définies dans les interfaces qu'elle implémente.

7. **Dans notre exemple, que signifie `implements Forme2D` pour la classe Rectangle ?**
   - Cela signifie que la classe Rectangle doit fournir une implémentation pour la méthode `calculerPerimetre()` définie dans l'interface `Forme2D`.

8. **Quelles méthodes la classe Rectangle doit-elle implémenter en raison de son implémentation de l'interface Forme2D ?**
   - La classe Rectangle doit implémenter la méthode `calculerPerimetre()` en raison de son implémentation de l'interface `Forme2D`. En plus de cela, elle doit également implémenter la méthode `calculerSurface()` en raison de son héritage de l'interface `Forme`.

