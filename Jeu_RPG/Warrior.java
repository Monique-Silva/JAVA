 public class Warrior {
        private String name;
        private int life;
        private int attack;

        public Warrior () {
            this.name = "Diana";
            this.life = 5;
            this.attack = 5;
        }
        public Warrior (String name) {
            this.name = name;
            this.life = 8;
            this.attack = 8;
        }
        public Warrior (String name, int life, int attack) {
            this.name = name;
            this.life = 10;
            this.attack = 10;
        }

    }
    /** Classe da guerreira, deve conter 3 construtores (sem parâmetros), com nome/life/força de ataque)
 * Attributs Guerrier : Nom, Niveau de vie (5-10), Force d’attaque (5-10), Arme, Bouclier
 */