package com.gokhantamkoc.javabootcamp.odevhafta2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlayWorldOfMagic implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(PlayWorldOfMagic.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		int maxNumOfAttacksAllowed = 9;
		String[] magicianSpells = createSpellNameRepository();
		float[] spellDamageInfo = createSpellDamageRepository();
		String[] bossNames = createBossNameRepository();
		float[] bossHps = createBossHPRepository();

		int minNumberSpellsUsed = resolveBattle(
				magicianSpells,
				spellDamageInfo,
				bossNames,
				bossHps);

		if (minNumberSpellsUsed > maxNumOfAttacksAllowed) {
			System.out.println("Magician died!");
		} else if (minNumberSpellsUsed > 0 && minNumberSpellsUsed <= maxNumOfAttacksAllowed) {
			System.out.println("Magician won the battle!");
		} else {
			System.out.println("Result is not correct!");
		}
	}

	public static int resolveBattle(
			String[] magicianSpells,
			float[] spellDamageInfo,
			String[] bossNames,
			float[] bossHPs) {

		int spellsUsed = 0;
		// ______ BASLANGIC _______ Kodunuz buradan baslamali
		String firstBoss = bossNames[0];
		float firstBossHp = bossHPs[0];
		String secondBoss = bossNames[1];
		float secondBossHp = bossHPs[1];
		String thirdBoss = bossNames[2];
		float thirdBossHp = bossHPs[2];

		float SelectedSpell = spellDamageInfo[0];
		for (int i = 1; i < spellDamageInfo.length; i++) {
			if (spellDamageInfo[i] > SelectedSpell) {
				SelectedSpell = spellDamageInfo[i];
			}
		}
		while (true) {

			if (firstBossHp > 0) {
				firstBossHp = firstBossHp - SelectedSpell;

			} else if (secondBossHp > 0) {
				secondBossHp = secondBossHp - SelectedSpell;

			} else if (thirdBossHp > 0) {
				thirdBossHp = thirdBossHp - SelectedSpell;
				break;
			}
			spellsUsed++;

		}

		// ______ SON _______ Kodunuz burada bitmeli
		/*
		 * NOT: ______ BASLANGIC _______ ve ______ SON _______
		 * arasina istediginiz kadar sayida satir ekleyebilirsiniz.
		 */
		return spellsUsed;
	}

	public static String[] createSpellNameRepository() {
		return new String[] { "Ice Storm", "Chain Lightning", "Magic Missile" };
	}

	public static float[] createSpellDamageRepository() {
		return new float[] { 40.0f, 30.0f, 5.0f };
	}

	public static String[] createBossNameRepository() {
		return new String[] { "Dire Rat", "Skeleton Knight", "Undead King" };
	}

	public static float[] createBossHPRepository() {
		return new float[] { 15.0f, 45.0f, 60.0f };
	}
}
