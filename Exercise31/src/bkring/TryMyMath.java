package bkring;

/*
    Brian Kring
    CIS35A
    Prof. Cynthia Lee-Klawender
 */

public class TryMyMath {

    /* Utility Properties */
    private static double roundedValue = 0;

    public static void print(double value) {

        /* Round value to nearest hundreth */
        roundedValue = MyMath.roundToNearestHundreth(value);

        /* Print roundedValue, square of roundedValue, and cube of roundedValue. Code copied from exercise 2.4 */
        System.out.printf("%20f%20f%20f\n", roundedValue, Math.pow(roundedValue, 2.0), Math.pow(roundedValue, 3.0));
    }

    public static void main(String[] args) {
        print(Math.E);
    }

}

/* Runtime Output */
/* "C:\Program Files\Java\jdk1.8.0_25\bin\java" -Didea.launcher.port=7541 "-Didea.launcher.bin.path=C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 14.0.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_25\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_25\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_25\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_25\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_25\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_25\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_25\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_25\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_25\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_25\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_25\jre\lib\rt.jar;C:\Program Files\Java\jdk1.8.0_25\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_25\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_25\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_25\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_25\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_25\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_25\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_25\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_25\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_25\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_25\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_25\jre\lib\ext\zipfs.jar;C:\Users\bkring\Forge\Exercise31\out\production\Exercise31;C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 14.0.2\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMain bkring.TryMyMath
            2.720000            7.398400           20.123648

Process finished with exit code 0 */