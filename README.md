# pls-send-help 🆘😱🆘

Michi, wir wissen deine Java Tage sind schon lange her, aber wir brauchen dringend deine Hilfe! Unser Java-Projekt wurde von Hackern sabotiert. Sie haben wichtige Teile unserer Unittests gelöscht und jetzt funktionieren sie nicht mehr.

Aus Sicherheitsgründen zerstört sich das Projekt selbst, wenn die Unittests für mehr als 12 Stunden fehlschlagen 💣💥. Die Tests sind bereits vor 11 Stunden und 50 Minuten sabotiert worden und schlagen seitdem fehl. Bitte beeile dich! 🏃‍♂️

Wenn du es schaffst, wirst du eine angemessene Belohnung erhalten! 💰

## Aufgabe
1. Lade dieses [Repository hier herunter](https://github.com/RecklessRiddleRequester/michi/archive/refs/heads/main.zip) und entpacke es.
2. (frage deinen Guide vorher, ob dieser Schritt noch notwendig ist) Lade dir [Java hier herunter](https://aka.ms/download-jdk/microsoft-jdk-21.0.3-windows-x64.msi) und installiere es.
3. Öffne die Tests in `src/test/java/SuperImportantUnitTests.java` mit einem Texteditor deiner Wahl und versuche sie zu reparieren.

Du kannst die Tests ausführen, indem du den Hauptordner `michi-main` in einer Kommandozeile öffnest und den Befehl `.\mvnw.cmd clean install` eingibst.

Wenn die Tests nicht erfolgreich waren, wird dir auf der Kommandozeile angezeigt, welche Tests noch kaputt sind. Damit unsere Testgeheimnisse nicht in der Code Base für Fremde (und für dich 😉) zu lesen sind, sind sie codiert. Wundere dich also nicht über die komische Zeichenketten bei den Assertions. Wenn ein Test fehlschlägt, dann sieht das auf der Kommandozeile in etwa so aus:
```shell
[INFO] Results:
[INFO] 
[ERROR] Failures: 
[ERROR]   SuperImportantUnitTests.test:16 
expected: "cmljaHRpZ2UgQW50d29ydA=="
 but was: "ZmFsc2NoZSBBbnR3b3J0"
[INFO] 
[ERROR] Tests run: 1, Failures: 1, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
```

Wenn die Tests erfolgreich waren, sollte das Ende der Ausgabe auf deiner Kommandozeile in etwa so aussehen:
```shell
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
```
4. Wenn du es schaffst unser Projekt zu retten, kannst du deine Belohnung durch das Aufrufen von `.\mvnw.cmd clean install` abholen. Die Belohnung wird in der Datei `target/riddle-solution/success.txt` erscheinen.
