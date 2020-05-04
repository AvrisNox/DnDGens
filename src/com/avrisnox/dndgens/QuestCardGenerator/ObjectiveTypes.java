package com.avrisnox.dndgens.QuestCardGenerator;

import java.util.HashMap;

@SuppressWarnings("unused")
public enum ObjectiveTypes implements ObjectiveTypeObject {
	EXPLORE,
	FIGHT,
	SCIENCE,
	ADVENTURE,
	ROGUE,
	MERCHANT,
	GUARD,
	DESTROY,
	DEFEND_INF,
	CRAFT,
	OBSERVE,
	FENCE,
	SURVIVE,
	SURPRISE;
	public static final HashMap<ObjectiveTypeObject, Integer> objectiveAffinity = new HashMap<>();
	{
		objectiveAffinity.put();
	}

	/* Explorer's Guild */
	public enum EXPLORE_TYPES implements ObjectiveTypeObject {
		TRAVEL,
		INSPECT;
		public enum TRAVEL_TYPES implements ObjectiveTypeObject {
			TO,
			IN,
			FROM,
			TO_FROM
		}
		public enum INSPECT_TYPES implements ObjectiveTypeObject {
			OBJECT,
			PERSON,
			SCENE,
			INTERROGATE
		}
	}

	/* Fighter's Guild */
	public enum FIGHT_TYPES implements ObjectiveTypeObject {
		CLEAR_OUT,
		KILL;
		public enum CLEAR_OUT_TYPES implements ObjectiveTypeObject {
			ELIMINATE,
			LOOT,
			CAPTURE,
			CAPTURE_OR_ELIMINATE
		}
		public enum KILL_TYPES implements ObjectiveTypeObject {
			ELIMINATE,
			BRUTALIZE,
			HIDE,
			EXECUTE,
			TORTURE
		}
	}

	/* Scientist's Guild */
	public enum SCIENCE_TYPES implements ObjectiveTypeObject {
		ANALYZE,
		ASSESS;
		public enum ANALYZE_TYPES implements ObjectiveTypeObject {
			OBJECT,
			SCENE,
			LOGIC
		}
		public enum ASSESS_TYPES implements ObjectiveTypeObject {
			SITUATION,
			LOCATION,
			LOGIC
		}
	}

	/* Adventurer's Guild */
	public enum ADVENTURE_TYPES implements ObjectiveTypeObject {
		LOCATE,
		EXTRACT;
		public enum LOCATE_TYPES implements ObjectiveTypeObject {
			OBJECT,
			LOCATION,
			PERSON
		}
		public enum EXTRACT_TYPES implements ObjectiveTypeObject {
			OBJECT,
			PERSON
		}
	}

	/* Rogue's Guild */
	public enum ROGUE_TYPES implements ObjectiveTypeObject {
		ASSASSINATE,
		STEAL;
		public enum ASSASSINATE_TYPES implements ObjectiveTypeObject {
			SILENTLY,
			SECRETLY,
			SILENT_AND_SECRET
		}
		public enum STEAL_TYPES implements ObjectiveTypeObject {
			KNOWN_OBJECT,
			UNKNOWN_OBJECT,
			ANY_OBJECT,
			ALL_OBJECTS,
			MIN_OBJECTS,
			MIN_OBJECTS_VALUE,
			MAX_OBJECTS,
			MAX_OBJECTS_VALUE,
			BETWEEN_OBJECTS,
			BETWEEN_OBJECTS_VALUE
		}
	}

	/* Merchant's Guild */
	public enum MERCHANT_TYPES implements ObjectiveTypeObject {
		ACQUIRE,
		SELL;
		public enum ACQUIRE_TYPES implements ObjectiveTypeObject {
			OBJECT,
			INTEL,
			BLACK_MARKET
		}
		public enum SELL_TYPES implements ObjectiveTypeObject {
			OBJECT,
			BARTER,
			BLACK_MARKET
		}
	}

	/* Guard's Guild */
	public enum GUARD_TYPES implements ObjectiveTypeObject {
		DEFEND,
		ESCORT;
		public enum DEFEND_TYPES implements ObjectiveTypeObject {
			UNTIL,
			FOR,
			WHILE
		}
		public enum ESCORT_TYPES implements ObjectiveTypeObject {
			TO,
			UNTIL
		}
	}

	/* ---SPECIAL--- */
	/* Quest Goblins */
	/* Daladeus' Fighters */
	public enum DESTROY_TYPES implements ObjectiveTypeObject {
		OBJECT,
		LOCATION,
		FACTION
	}

	/* Mercenaries */
	/* The Protectorate */
	public enum DEFEND_INF_TYPES implements ObjectiveTypeObject {
		UNTIL,
		FOR,
		WHILE
	}

	/* Galaxa Fighters */
	/* The Wisemen */
	public enum CRAFT_TYPES implements ObjectiveTypeObject {
		WEAPON,
		ARMOR,
		TRINKET,
		ENCHANT,
		BREW
	}

	/* Warriors of Progress */
	/* The Oracles */
	public enum OBSERVE_TYPES implements ObjectiveTypeObject {
		OBJECT_FOR,
		OBJECT_UNTIL,
		LOCATION_FOR,
		LOCATION_UNTIL,
		PERSON_FOR,
		PERSON_UNTIL
	}

	/* Thieve's Guild */
	public enum FENCE_TYPES implements ObjectiveTypeObject {
		OBJECT
	}

	/* ---UNIQUE--- */
	/* Guild of Heroes */
	public enum SURVIVE_TYPES implements ObjectiveTypeObject {
		UNTIL,
		FOR,
		WHILE
	}

	/* Generic */
	public enum SURPRISE_TYPES implements ObjectiveTypeObject {
		OTHER
	}
}
