# Ödev 2

Bu haftaki ödevinizde aşağıdaki görevi çözmenizi bekliyoruz.

## Görev

Bugün, **World of Magic** isimli oyunu örnek vererek 2 boyutlu dizileri anlatmıştım.
Oyunda büyücümüzün 3 adet bildiği büyü vardır. Büyücümüz bu büyüleri kullanarak bir savaşta maximum 9 büyü gerçekleştirebiliyor.
Göreviniz büyücümüzün minimum sayıda büyü kullanarak bölüm sonu canavarlarını yenip yenemeyeceğini anlayan bir algoritma yazmanız.

Sizin için büyücümüzün savaşı kazanıp kazanmayacağını anlayan kısmı geliştirdik:

```java
if (minNumberSpellsUsed > maxNumOfAttacksAllowed) {
	System.out.println("Magician died!");
} else if (minNumberSpellsUsed > 0 && minNumberSpellsUsed <= maxNumOfAttacksAllowed) {
	System.out.println("Magician won the battle!");
} else {
	System.out.println("Result is not correct!");
}
```

Sizin sadece aşağıdaki kod parçasında değişiklik yapmanızı bekliyoruz (`PlayWorldOfMagic.java` dosyasında bu kod parçasını bulabilirsiniz. Comment'e yazılmış uyarıları dikkatli **okuyunuz**.):

```java
int spellsUsed = 0;
// ______ BASLANGIC _______ Kodunuz buradan baslamali

// ______ SON _______ Kodunuz burada bitmeli
/* NOT: ______ BASLANGIC _______ ve ______ SON _______ 
 * arasina istediginiz kadar sayida satir ekleyebilirsiniz.
 */
return spellsUsed;
```

Onun dışındaki kodlarda yapacağınız değişiklik ödevinizi tamamlamaya **ENGEL** olabilir.

Kolaylıklar diliyorum.