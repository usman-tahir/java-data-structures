
public class AssociationMain {
    public static void main(String[] args) {
        Association dict[] = new Association[9];
        int arg;
        int i;

        dict[0] = new Association("a", "aay");
        dict[1] = new Association("bad", "adbay");
        dict[2] = new Association("had", "adhay");
        dict[3] = new Association("dad", "adday");
        dict[4] = new Association("day", "ayday");
        dict[5] = new Association("hop", "ophay");
        dict[6] = new Association("on", "onay");
        dict[7] = new Association("pop", "oppay");
        dict[8] = new Association("sad", "adsay");

        for (arg = 0; arg < args.length; arg += 1) {
            // for each argument
            for (i = 0; i < dict.length; i += 1) {
                // check each dictionary entry
                if (dict[i].getKey().equals(args[arg])) {
                    System.out.println(dict[i].getValue());
                }
            }
        }
    }
}