# pls-send-help

Michi, wir wissen deine Java Tage sind schon lange her, aber wir brauchen dringend deine Hilfe! Unser Java-Projekt wurde von chinesischen Hackern sabotiert. Sie haben wichtige Teile unserer Unittests gelöscht und jetzt funktionieren sie nicht mehr.

Aus Sicherheitsgründen zerstört sich das Projekt selbst, wenn die Unittests für mehr als 12 Stunden fehlschlagen. Die Tests sind bereits vor 11 Stunden und 50 Minuten sabotiert worden und schlagen seitdem fehl. Bitte beeile dich!

Wenn du es schaffst, wirst du eine angemessene Belohnung erhalten!

## Aufgabe
1. Lade dir Java 21 hier herunter:
2. Öffne die Tests in `src/test/java/SuperImportantUnitTests.java` mit einem Texteditor deiner Wahl und stelle sicher, dass sie erfolgreich durchlaufen.
Du kannst die Tests ausführen, indem du auf der Kommandozeile `mvnw.cmd clean test` eingibst. Wenn deine Tests erfolgreich waren, sollte das Ende der Ausgabe auf deiner Kommandozeile in etwa so aussehen:
```shell
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
```
3. Nachdem du uns gerettet hast, kannst du deine Belohnung durch das Aufrufen von `mvnw.cmd clean install` abholen. Die Belohnung wird in der Datei `/target/riddle-solution/success.txt` erscheinen.