public void createWarrior(Warrior warrior, String characterChosen) {
        System.out.println("How do you want to call your warrior?");
        keyboardScan = scanKeyboard();
        warrior.setName(keyboardScan);
        String warriorName = warrior.getName();
        System.out.println("Choose your life points (5-10):");
        keyboardScan = scanKeyboard();
        warrior.setLife(Integer.parseInt(keyboardScan));
        System.out.println("Choose your attack points (5-10):");
        keyboardScan = scanKeyboard();
        warrior.setAttack(Integer.parseInt(keyboardScan));
        System.out.println("Welcome to life, " + warriorName + "! Are you ready to start?");
        System.out.println("Let's go!");
    }


public void createWizard(Wizard wizard, String characterChosen) {
        System.out.println("How do you want to call your wizard?");
        keyboardScan = scanKeyboard();
        wizard.setName(keyboardScan);
        String wizardName = wizard.getName();
        System.out.println("Choose your life points (5-10):");
        keyboardScan = scanKeyboard();
        wizard.setLife(Integer.parseInt(keyboardScan));
        System.out.println("Choose your attack points (5-10):");
        keyboardScan = scanKeyboard();
        wizard.setAttack(Integer.parseInt(keyboardScan));
        System.out.println("Welcome to life, " + wizardName + "! Are you ready to start?");
        System.out.println("Let's go!");
    }

public void createCharacter(characterChosen) {
	System.out.println("How do you want to call your " + characterChosen + "?");
        keyboardScan = scanKeyboard();
        characterChosen.setName(keyboardScan);
        String characterName = characterChosen.getName();
        System.out.println("Choose your life points (5-10):");
        keyboardScan = scanKeyboard();
        characterChosen.setLife(Integer.parseInt(keyboardScan));
        System.out.println("Choose your attack points (5-10):");
        keyboardScan = scanKeyboard();
        characterChosen.setAttack(Integer.parseInt(keyboardScan));
        System.out.println("Welcome to life, " + characterName + "! Are you ready to start?");
        System.out.println("Let's go!");
    }










	public void showInfo(characterChosen) {
        System.out.println("This is you:");
        switch (characterChosen) {
            case "Warrior" -> {
                System.out.println("Name: " + warrior.getName());
                System.out.println("Life points: " + warrior.getLife());
                System.out.println("Attack points: " + warrior.getAttack());
            }
            //System.out.println("Weapon: " + warrior.getWeapon());
            //System.out.println("Shield: " + warrior.getShield());
            case "Wizard" -> {
                System.out.println("Name: " + wizard.getName());
                System.out.println("Life points: " + wizard.getLife());
                System.out.println("Attack points: " + wizard.getAttack());
            }
            //System.out.println("Spell: " + wizard.getSpell());
            //System.out.println("Filter: " + wizard.getFilter());
        }
    }

	 public void modifyCharacter() {
        switch (characterChosen) {
            case "Warrior" -> {
                System.out.println("Name: " + warrior.getName());
                System.out.println("New name:");
                keyboardScan = scanKeyboard();
                warrior.setName(keyboardScan);
                System.out.println("Name: " + warrior.getName());
                System.out.println("Life points: " + warrior.getLife());
                System.out.println("New life points:");
                keyboardScan = scanKeyboard();
                warrior.setLife(Integer.parseInt(keyboardScan));
                System.out.println("Life points: " + warrior.getLife());
                System.out.println("Attack points: " + warrior.getAttack());
                System.out.println("New attack points:");
                keyboardScan = scanKeyboard();
                warrior.setAttack(Integer.parseInt(keyboardScan));
                System.out.println("Attack points: " + warrior.getAttack());
            }
            case "Wizard" -> {
                System.out.println("Name: " + wizard.getName());
                System.out.println("New name:");
                keyboardScan = scanKeyboard();
                wizard.setName(keyboardScan);
                System.out.println("Name: " + wizard.getName());
                System.out.println("Life points: " + wizard.getLife());
                System.out.println("New life points:");
                keyboardScan = scanKeyboard();
                wizard.setLife(Integer.parseInt(keyboardScan));
                System.out.println("Life points: " + wizard.getLife());
                System.out.println("Attack points: " + wizard.getAttack());
                System.out.println("New attack points:");
                keyboardScan = scanKeyboard();
                wizard.setAttack(Integer.parseInt(keyboardScan));
                System.out.println("Attack points: " + wizard.getAttack());
            }
        }
    }