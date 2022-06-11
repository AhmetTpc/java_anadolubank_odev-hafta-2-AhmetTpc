package com.gokhantamkoc.javabootcamp.odevhafta2.tests;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.gokhantamkoc.javabootcamp.odevhafta2.PlayWorldOfMagic;

@RunWith(SpringRunner.class)
public class PlayWorldOfMagicTests {
	
	@Test
	public void TestResolveBattle() {
		String[] magicianSpells = createSpellNameRepositoryTest();
		float[] spellDamageInfo = createSpellDamageRepositoryTest();
		
		// Test1
		String[] bossNames = createBossNameRepositoryTest1();
		float[] bossHps = createBossHPRepositoryTest1();
		
		int testResult1 = PlayWorldOfMagic.resolveBattle(
				magicianSpells,
				spellDamageInfo, 
				bossNames,
				bossHps);
		
		assertThat(testResult1).isEqualTo(6);
		
		// Test2
		bossNames = createBossNameRepositoryTest2();
		bossHps = createBossHPRepositoryTest2();
		
		int testResult2 = PlayWorldOfMagic.resolveBattle(
				magicianSpells,
				spellDamageInfo, 
				bossNames,
				bossHps);
		
		assertThat(testResult2).isEqualTo(5);
	}
	
	public static String[] createSpellNameRepositoryTest() {
		return new String[]{"Ice Storm", "Chain Lightning", "Magic Missile"};
	}
	
	public static float[] createSpellDamageRepositoryTest() {
		return new float[]{40.0f, 30.0f, 5.0f};
	}
	
	public static String[] createBossNameRepositoryTest1() {
		return new String[]{"Mutated Dire Rat", "Skeleton King", "Arch Devil"};
	}
	
	public static float[] createBossHPRepositoryTest1() {
		return new float[]{28.0f, 60.0f, 100.0f};
	}
	
	public static String[] createBossNameRepositoryTest2() {
		return new String[]{"Dire Rat", "Skeleton Knight", "Undead King"};
	}
	
	public static float[] createBossHPRepositoryTest2() {
		return new float[]{10.0f, 45.0f, 60.0f};
	}
}