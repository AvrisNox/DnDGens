package com.avrisnox.dndgens.QuestCardGenerator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@SuppressWarnings("unused")
public class QuestCard {
	/* Front */
	String title;
	int broker;
	float challenge;
	int party;
	int level;
	List<QuestModifierObject> modifiers;
	String description;
	double time;

	/* Back */
	List<Objective> objectives;
	List<Reward> rewards;

	public QuestCard() {
		title = "A Random Quest";
		broker = -1;
		challenge = 0;
		party = 1;
		level = 1;
		modifiers = null;
		description = "Lorem ipsum dolor sit amet.";
		time = Double.POSITIVE_INFINITY;

		objectives = new LinkedList<>();
		objectives.add(new Objective());
		rewards = new LinkedList<>();
		rewards.add(new Reward());
	}

	public QuestCard(String title, String description, float challenge, List<QuestModifierObject> modifiers, List<Objective> objectives, List<Reward> rewards) {
		this.title = title;
		this.modifiers = modifiers;
		this.description = description;
		if(objectives != null) this.objectives = objectives;
		else this.objectives = new LinkedList<>();
		if(rewards != null) this.rewards = rewards;
		else this.rewards = new LinkedList<>();

		/* Calculate broker from objectives */
		broker = getSuggestedBrokerFromObjectives(objectives);
		/* Set challenge, party, level, and time */
		setSuggestedChallengesFromCR(challenge);
	}

	public static int getSuggestedBrokerFromObjectives(List<Objective> objectives) {
		if(objectives == null)
			return -1;

		/* CONSTANTS FOR ARRAY ACCESSES */
		final int GUILD_COUNT = 17;
		final int UNKNOWN = -1;
		final int EXPLORER = 0;
		final int FIGHTER = 1;
		final int SCIENTIST = 2;
		final int ADVENTURER = 3;
		final int ROGUE = 4;
		final int MERCHANT = 5;
		final int GUARD = 6;
		final int DALADEUS = 7;
		final int PROTECTORATE = 8;
		final int WISEMEN = 9;
		final int ORACLES = 10;
		final int GOBLINS = 11;
		final int GALAXA = 12;
		final int MERCENARIES = 13;
		final int WARRIORS = 14;
		final int THIEVES = 15;
		final int HEROES = 16;

		/* END CONSTANTS */

		int[] affinity = new int[GUILD_COUNT];
		for(int i = 0; i < affinity.length; i++)
			affinity[i] = 0;

		ArrayList<Objective> objChq = new ArrayList<>(objectives);

		for(int i = 0; i < objChq.size(); i++) {
			Objective current = objChq.get(i);
			if(!current.getChildren().isEmpty())objChq.addAll(current.getChildren());

			ObjectiveTypeObject ot = current.getType();


	}

	public static void setSuggestedChallengesFromCR(float challengeRating) {

	}

}
