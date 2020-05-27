class DnDCharacter {
	

	int strength, dexterity, constitution, intelligence, wisdom, charisma,hitpoints,modifier;
	int ability() {
		int small=0,pos=0;
		int rolls[]=new int[4];
		for(int i=0;i<rolls.length;i++) {
			rolls[i]=((int) (Math.random()*(7 - 1))) +1;
			if(rolls[i]<small) {
				small=rolls[i];
				pos=i;
			}
		}
		int modifier=0;
		for(int i=0;i<rolls.length;i++) {
			if(i==pos) {
				continue;
			}
			modifier+=rolls[i];
			
		}
		
		
		return modifier;
    }

int modifier(int input) {
	strength=ability();
	dexterity=ability();
	constitution=ability();
	intelligence=ability();
	wisdom=ability();
	charisma=ability();
	
	modifier=Math.round((constitution-10)/2)-1;
	hitpoints=modifier+input;
	return modifier;
	
	
	
     }

	int getStrength() {
		
		return strength;
	     }
	
	int getDexterity() {
		return dexterity;
	    }
	
	int getConstitution() {
		return constitution;
	}
	
	int getIntelligence() {
		return intelligence;
	}
	
	int getWisdom() {
		return wisdom;
	}
	
	int getCharisma() {
		return charisma;
	}
	
	int getHitpoints() {
		return hitpoints;
	}
	

}
